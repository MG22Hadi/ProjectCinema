package GUI;

import java.awt.*;
import javax.swing.*;

public class MainGUI {

    JFrame frame = new JFrame();
    
    JPanel navBarPanel=new JPanel();
    JPanel iMoviesPanel =new JPanel();
    JPanel oMoviesPanel =new JPanel();

    JPanel mo1 =new JPanel();
    JLabel mL1=new JLabel();
    JPanel mo2 =new JPanel();
    JLabel mL2=new JLabel();

    JScrollPane sp=new JScrollPane(iMoviesPanel);

    JButton mainButton = new JButton("🎞");
    JButton sittingButton = new JButton("⚙");


    public MainGUI(){


        mainButton.setBounds(0,0,210,65);
        mainButton.setFocusable(false);
        mainButton.setBackground(new Color(222,229,236));
        mainButton.setForeground(new Color(108,77,56));
        mainButton.setFont(new Font(null,0,30));

        sittingButton.setBounds(210,0,210,65);
        sittingButton.setFocusable(false);
        sittingButton.setBackground(new Color(222,229,236));
        sittingButton.setFont(new Font(null,0,30));
        sittingButton.setForeground(new Color(108,77,56));

        iMoviesPanel.setPreferredSize(new Dimension(400,1000));
        iMoviesPanel.setBounds(0,0,200,400);
        iMoviesPanel.setBackground(Color.GRAY);
        iMoviesPanel.setForeground(new Color(108,77,56));
        iMoviesPanel.setLayout(null);
        iMoviesPanel.add(mo1);
        iMoviesPanel.add(mo2);

        mo1.setBounds(10,0,150,300);
        mo1.setBackground(Color.GREEN);
        mo1.setForeground(new Color(108,77,56));
        mo1.setLayout(null);

        mo2.setBounds(240,0,150,300);
        mo2.setBackground(Color.GREEN);
        mo2.setForeground(new Color(108,77,56));
        mo2.setLayout(null);

        oMoviesPanel.setBounds(0,0,405,500);
        oMoviesPanel.setBackground(Color.RED);
        oMoviesPanel.setForeground(new Color(108,77,56));
        oMoviesPanel.setLayout(new GridLayout());
        oMoviesPanel.add(sp);

        navBarPanel.setSize(420,300);
        navBarPanel.setBounds(0,500,420,100);
        navBarPanel.setForeground(new Color(108,77,56));
        navBarPanel.setLayout(null);
        navBarPanel.add(mainButton);
        navBarPanel.add(sittingButton);

        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);

        frame.add(oMoviesPanel);
        frame.add(navBarPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocation(500, 100);
        frame.setSize(420, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
