package GUI;

import Classes.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class LoginPage implements ActionListener{
    JFrame frame = new JFrame();
    JPanel topPanel =new JPanel();
    JPanel mainPanel =new JPanel();
    JPanel bottomPanel =new JPanel();

    JLabel wel = new JLabel("Welcome ");
    JLabel CULabel =new JLabel("You don't have account ?");

    ImageIcon logo =new ImageIcon("Pro.jpg");
    JLabel logoLabel = new JLabel();

    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    
    JLabel userIDLabel = new JLabel("Email or Username :");
    JLabel userPasswordLabel = new JLabel("Password:");

    JButton loginButton = new JButton("login");
    JButton creatButton = new JButton("Create");


    public LoginPage(){

        logoLabel.setIcon(logo);

        topPanel.setLayout(null);
        topPanel.add(logoLabel);
        topPanel.setBounds(0,0,420,200);
        topPanel.setSize(420,200);

        logoLabel.setOpaque(true);
        logoLabel.setBackground(new Color(222,229,237));
        logoLabel.setBounds(0,0,420,200);
        logoLabel.setVerticalAlignment(JLabel.CENTER);
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

        creatButton.setBounds(250,0,75,20);
        creatButton.setForeground(new Color(108,77,56));
        creatButton.setBackground(new Color(222, 229, 236));
        creatButton.setFocusable(false);
        creatButton.setBorder(null);
        creatButton.addActionListener(this);

        loginButton.setBounds(225,190,100,25);
        loginButton.setForeground(new Color(108,77,56));
        loginButton.setBackground(new Color(222, 229, 236));
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        
        CULabel.setForeground(new Color(108,77,56));
        CULabel.setBounds(100,5,200,10);
//
       
        

        mainPanel.setSize(420,300);
        mainPanel.setBounds(0,200,420,325);
        mainPanel.setBackground(new Color(222,229,237));
        mainPanel.setForeground(new Color(108,77,56));
        mainPanel.setLayout(null);
        mainPanel.add(userIDLabel);
        mainPanel.add(userPasswordLabel);
        mainPanel.add(userIDField);
        mainPanel.add(userPasswordField);
        mainPanel.add(loginButton);
        mainPanel.add(wel);


        bottomPanel.setSize(420,30);
        bottomPanel.setBounds(0,525,420,75);
        bottomPanel.setBackground(new Color(222,229,239));
        bottomPanel.setLayout(null);
        bottomPanel.add(CULabel);
        bottomPanel.add(creatButton);

        frame.add(mainPanel);
        frame.add(topPanel);
        frame.add(bottomPanel);
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

        if (e.getSource() == loginButton) {

            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            for (User u : User.accounts) {
                if (u.getEmail().equalsIgnoreCase(userID)) {
                    if (u.getPassword().equalsIgnoreCase(password)) {
                        frame.dispose();
                        MainGUI welcomePage = new MainGUI();
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong Password !", "Input Error", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Username not founded !!", "Input Error", JOptionPane.ERROR_MESSAGE);

                }
            }


        }else if (e.getSource() == creatButton) {
                    frame.dispose();
                    CreatAccountPage cap = new CreatAccountPage();
                }
            }
        }
