package GUI;

import java.awt.*;
import javax.swing.*;

public class MainGUI {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello!");

    MainGUI(String userID){

        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        welcomeLabel.setText("Hello "+userID);

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocation(500, 100);
        frame.setSize(420, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
