package GUI;

import Main.Movie;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.*;

public class MainGUI implements MouseListener {

    JFrame frame = new JFrame();
    
    JPanel navBarPanel=new JPanel();
    JPanel iMoviesPanel =new JPanel();
    JPanel oMoviesPanel =new JPanel();


    private static int x=0;
    private static int y=0;
    private static int countLabel=0;
    JLabel m1,m2,m3,m4;

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
        iMoviesPanel.setBackground(Color.GRAY);
        iMoviesPanel.setForeground(new Color(108,77,56));
        iMoviesPanel.setLayout(null);

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

        m1=addMovie("Inception",null,null,"Movis Photos/Inseption 0.jpg");
        m2=addMovie("Shutter Island",null,null,"Movis Photos/Shutter i.jpg");
        m3=addMovie("Inception",null,null,"Movis Photos/The body0.jpg");
        m4=addMovie("Inception",null,null,"Movis Photos/The day After Tomorrow.jpg");

    }

    public JLabel addMovie(String name , ArrayList type,int []showTime,String path){
        Movie newMovie= new Movie(name,type,showTime);
        countLabel++;
        if(countLabel%2==1){
            x=0;
        }else {
            x=205;
        }
        if (countLabel%2==1 && countLabel>1)
            y+=300;
        JLabel l =new JLabel();
        ImageIcon imageIcon=new ImageIcon(path);
        l.setBounds(x,y,200,296);
        l.setIcon(imageIcon);
        l.setLayout(null);
        l.addMouseListener(this);
        iMoviesPanel.add(l);

        return l;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==m1)
            System.out.println(1);
    }
    @Override
    public void mousePressed(MouseEvent e) {

    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }
    @Override
    public void mouseEntered(MouseEvent e) {

    }
    @Override
    public void mouseExited(MouseEvent e) {

    }
}
