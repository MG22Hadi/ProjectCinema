package GUI;

import Classes.User;
import Main.IDandPasswords;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class CreatAccountPage implements ActionListener {
    JFrame frame = new JFrame();

    JPanel mainPanel = new JPanel();

    JLabel welcomeLabel = new JLabel("Creat New Account ");
    JLabel genderLabel =new JLabel("Gender :");

    JTextField text1= new JTextField("First Name");
    JTextField text2= new JTextField("Last Name");
    JTextField text3= new JTextField("Email ");
    JTextField text4= new JTextField("Password");

    JRadioButton male =new JRadioButton("Male"),female =new JRadioButton("Female");

    ButtonGroup genderGroup =new ButtonGroup();

    JButton creatButton =new JButton("creat");
    JButton backButton =new JButton("back");

    public CreatAccountPage() {
        welcomeLabel.setBounds(110,25,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,20));
        welcomeLabel.setForeground(new Color(108,77,56));
        welcomeLabel.setFont(new Font("serif",Font.BOLD,22));

        mainPanel.setSize(420, 600);
        mainPanel.setBounds(0,0,420,600);
        mainPanel.setBackground(new Color(222,229,237));
        mainPanel.setForeground(new Color(108,77,56));
        mainPanel.setLayout(null);
        mainPanel.add(welcomeLabel);
        mainPanel.add(text1);
        mainPanel.add(text2);
        mainPanel.add(text3);
        mainPanel.add(text4);
        mainPanel.add(genderLabel);
        mainPanel.add(male);
        mainPanel.add(female);
        mainPanel.add(creatButton);
        mainPanel.add(backButton);

        text1.setBounds(80,100,250,30);
        text1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(text1.getText().equals("First Name")){
                    text1.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(text1.getText().equals("")){
                    text1.setText("First Name");
                }
            }
        });
        text1.setFont(new Font("serif",Font.BOLD,15));

        text2.setBounds(80,160,250,30);
        text2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(text2.getText().equals("Last Name")){
                    text2.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(text2.getText().equals("")){
                    text2.setText("Last Name");
                }
            }
        });
        text2.setFont(new Font("serif",Font.BOLD,15));

        text3.setBounds(80,220,250,30);
        text3.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(text3.getText().equals("Email ")){
                    text3.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(text3.getText().equals("")){
                    text3.setText("Email ");
                }
            }
        });
        text3.setFont(new Font("serif",Font.BOLD,15));

        text4.setBounds(80,280,250,30);
        text4.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(text4.getText().equals("Password")){
                    text4.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(text4.getText().equals("")){
                    text4.setText("Password");
                }
            }
        });
        text4.setFont(new Font("serif",Font.BOLD,15));

        genderLabel.setBounds(80,330,200,35);
        genderLabel.setForeground(new Color(108,77,56));
        genderLabel.setFont(new Font("serif",Font.BOLD,17));

        genderGroup.add(male);genderGroup.add(female);

        male.setBounds(125,370,100,35);
        male.setFont(new Font("serif",Font.BOLD,12));
        male.setBackground(new Color(222,229,237));
        male.setFocusable(false);

        female.setBounds(225,370,100,35);
        female.setFont(new Font("serif",Font.BOLD,12));
        female.setBackground(new Color(222,229,237));
        female.setFocusable(false);

        creatButton.setBounds(250,440,75,25);
        creatButton.setForeground(new Color(108,77,56));
        creatButton.setBackground(new Color(191, 223, 236));
        creatButton.setFocusable(false);
        creatButton.addActionListener(this);

        backButton.setBounds(80,440,75,25);
        backButton.setForeground(new Color(108,77,56));
        backButton.setBackground(new Color(191, 223, 236));
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocation(500, 100);
        frame.setSize(420, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==backButton){
            frame.dispose();
            LoginPage loginPage = new LoginPage();
        } else if (e.getSource()==creatButton) {
            User u = new User();
            u.signup(text1.getText(),text2.getText(),text3.getText(),text4.getText(),genderLabel.getText());

             for(User s : User.accounts){
                 System.out.println(s.getEmail());
             }
        }
    }
}
