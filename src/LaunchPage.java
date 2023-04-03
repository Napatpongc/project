import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label1 = new JLabel("King of Geometry");
    JLabel LCalArea = new JLabel("Calulate Area");
    JLabel LPrac = new JLabel("Math Practice");
    JLabel LCalVom = new JLabel("Calulate Volume");
    JButton btnar= new JButton();
    JButton btnvom = new JButton();
    JButton btnpr = new JButton();
    ImageIcon ImageArea = new ImageIcon("src/calarea.jpg");
    ImageIcon ImageVom = new ImageIcon("src/calvom.jpg");
    ImageIcon ImagePrac = new ImageIcon("src/prac.jpg");
    LaunchPage(){


    label1.setFont(new Font("MV Boli",Font.PLAIN,30));
    label1.setBounds(180,30,300,40);
    frame.getContentPane().add(label1);
    

    LCalArea.setFont(new Font("MV Boli",Font.PLAIN,20));
    LCalArea.setBounds(100,100,300,40);
    frame.getContentPane().add( LCalArea);

    LCalVom.setFont(new Font("MV Boli",Font.PLAIN,20));
    LCalVom.setBounds(355,100,300,40);
    frame.getContentPane().add(LCalVom);

    LPrac.setFont(new Font("MV Boli",Font.PLAIN,20));
    LPrac.setBounds(230,370,300,40);
    frame.getContentPane().add(LPrac);

    btnar.setBounds(60, 140, 200, 200);
    btnar.addActionListener(this);
    btnar.setIcon(ImageArea);
    frame.add(btnar);

    btnvom.setBounds(330, 140, 200, 200);
    btnvom.addActionListener(this);
    btnvom.setIcon(ImageVom);
    frame.add(btnvom);

    btnpr.setBounds(200, 410, 200, 100);
    btnpr.addActionListener(this);
    btnpr.setIcon(ImagePrac);
    frame.add(btnpr);
    

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(700,200,600,600);
    frame.setTitle("King of Geometry");
    frame.setLayout(null);
    frame.getContentPane().setBackground(new Color(245,221,155));
    frame.setVisible(true);
    
    
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btnar){
            CalArea carea = new CalArea();
            frame.dispose();
        }
        if(e.getSource()== btnvom){
            CalVolume volume = new CalVolume();
            frame.dispose();
        }
        if(e.getSource()== btnpr){
            //CalPrac prac = new CalPrac();
            LaunchPageMath lpm = new LaunchPageMath();
            frame.dispose();
        }   
    }  
}
