package GUI;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class LoginPage implements ActionListener{
    JPanel topPanel =new JPanel();
    JPanel mainPanel =new JPanel();
    JFrame frame = new JFrame();
    JLabel wel = new JLabel("Welcome ");

    ImageIcon logo =new ImageIcon("Pro.jpg");
    JLabel logoLabel = new JLabel();
    JButton loginButton = new JButton("Login");

    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    
    JLabel userIDLabel = new JLabel("UserName:");
    JLabel userPasswordLabel = new JLabel("password:");
    HashMap<String,String> logininfo;

    public LoginPage(HashMap<String,String> loginInfoOriginal){

        logininfo = loginInfoOriginal;

        logoLabel.setIcon(logo);
        mainPanel.setBackground(new Color(222,229,237));
        topPanel.setLayout(null);
        topPanel.add(logoLabel);
        topPanel.setBounds(0,0,420,200);
        topPanel.setSize(420,200);
        logoLabel.setBackground(new Color(222,229,237));
        logoLabel.setBounds(0,0,420,200);
        logoLabel.setSize(420,200);        logoLabel.setOpaque(true);
        logoLabel.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        logoLabel.setHorizontalAlignment(JLabel.CENTER);

        wel.setFont(new Font("serif",Font.BOLD,30));
        wel.setBounds(50,5,200,45);
        wel.setForeground(new Color(108,77,56));

        userIDLabel.setBounds(50,90,75,25);
        userIDLabel.setForeground(new Color(108,77,56));

        userPasswordLabel.setBounds(50,140,75,25);
        userPasswordLabel.setForeground(new Color(108,77,56));



        userIDField.setBounds(125,90,200,25);
        userPasswordField.setBounds(125,140,200,25);

        loginButton.setBounds(225,190,100,25);
        loginButton.setForeground(new Color(108,77,56));
        loginButton.setBackground(new Color(158, 199, 199));
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        mainPanel.setSize(420,300);
        mainPanel.setBounds(0,200,420,400);
        mainPanel.setForeground(new Color(108,77,56));
        mainPanel.setLayout(null);
        mainPanel.add(userIDLabel);
        mainPanel.add(userPasswordLabel);

        mainPanel.add(userIDField);
        mainPanel.add(userPasswordField);
        mainPanel.add(loginButton);
        mainPanel.add(wel);

        frame.add(mainPanel);
        frame.add(topPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocation(500, 100);
        frame.setIconImage(logo.getImage());
        frame.getContentPane().setBackground(new Color(182, 65, 112));

    }

    @Override
    public void actionPerformed(ActionEvent e) {



        if(e.getSource()==loginButton) {

            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if(logininfo.containsKey(userID)) {
                if(logininfo.get(userID).equals(password)) {
                    frame.dispose();
                    MainGUI welcomePage = new MainGUI(userID);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Wrong PassWord !!","Error",JOptionPane.ERROR_MESSAGE);
                }

            }
            else {
                JOptionPane.showMessageDialog(null,"UserName not found !!","Error",JOptionPane.ERROR_MESSAGE);

            }
        }
    }
}