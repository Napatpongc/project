import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LaunchPageMath implements ActionListener {
    JButton bback= new JButton();
    JLabel label1 = new JLabel("Select mode");
    JLabel LScore = new JLabel("Score mode");
    JLabel LNormal = new JLabel("Normal mode");
    JFrame frame = new JFrame();
    JButton btnsim = new JButton();
    JButton btnsco = new JButton();
    JLabel lback = new JLabel("Back");
    ImageIcon iconnormal = new ImageIcon("src/queston.jpg");
    ImageIcon iconscore = new ImageIcon("src/score.jpg");

    ImageIcon iconback = new ImageIcon("src/back.png");
    LaunchPageMath(){

        label1.setFont(new Font("MV Boli",Font.PLAIN,30));
        label1.setBounds(210,50,300,40);
        frame.getContentPane().add(label1);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(700,200,600,600);
    frame.setTitle("King of Geometry");
    frame.setLayout(null);
    frame.getContentPane().setBackground(new Color(245,221,155));
    frame.setVisible(true);

    bback.setBounds(20, 510, 70, 30);
    bback.addActionListener(this);
    bback.setIcon(iconback);
    frame.add(bback);

    btnsim.setBounds(60, 180, 200, 200);
    btnsim.addActionListener(this);
    btnsim.setIcon(iconnormal);
    frame.add(btnsim);

    btnsco.setBounds(330, 180, 200, 200);
    btnsco.addActionListener(this);
    btnsco.setIcon(iconscore);

    LNormal.setFont(new Font("MV Boli",Font.PLAIN,20));
    LNormal.setBounds(100,140,300,40);
    frame.getContentPane().add( LNormal);

    LScore.setFont(new Font("MV Boli",Font.PLAIN,20));
    LScore.setBounds(375,140,300,40);
    frame.getContentPane().add(LScore);
    frame.add(btnsco);

    lback.setFont(new Font(null,Font.PLAIN,13));
    lback.setBounds(40,475, 500, 50);
    frame.add(lback);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        double a,b,c,area;
        if(e.getSource()==bback){
            LaunchPage lp = new LaunchPage();
            frame.dispose();
        }if(e.getSource()== btnsim){
            CalPrac cp = new CalPrac();
            frame.dispose();
        }if(e.getSource()== btnsco){
            CalPracScore cp = new CalPracScore();
            frame.dispose();
        }
    }
    
}
