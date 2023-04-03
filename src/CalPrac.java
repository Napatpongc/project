import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalPrac implements ActionListener {
    practice prac = new practice();
    JFrame frame = new JFrame();
    JButton bback= new JButton();
    JButton bgen = new JButton("generate");
    JButton bsub = new JButton("submit");
    JLabel labeltitle = new JLabel("Mathematical Practice");
    JLabel lwhat = new JLabel("what answer of           ?" );
    JLabel lmath = new JLabel(prac.genmath());
    JLabel lans = new JLabel("Answer is");
    JLabel lcor = new JLabel();
    JLabel lncor = new JLabel();
    JLabel lnumans = new JLabel();
    JTextField txt1 = new JTextField();
    JLabel lback = new JLabel("Back");
    ImageIcon iconback = new ImageIcon("src/back.png");
    ImageIcon iconcal = new ImageIcon("src/calculate.png");
    String stChoice,sncl;

    CalPrac(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(700,200,600,600);
        frame.setTitle("Calculate Volume");
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(173,242,253));
        frame.setVisible(true);

        labeltitle.setFont(new Font("MV Boli",Font.PLAIN,30));
        labeltitle.setBounds(150,70,350,30);
        frame.add(labeltitle);

        lwhat.setFont(new Font("MV Boli",Font.PLAIN,22));
        lwhat.setBounds(100, 150, 500, 50);
        frame.add(lwhat);

        lmath.setFont(new Font("MV Boli",Font.PLAIN,22));
        lmath.setBounds(280, 150, 500, 50);
        frame.add(lmath);


        lans.setFont(new Font("MV Boli",Font.PLAIN,22));
        lans.setBounds(130, 200, 500, 50);
        frame.add(lans);

        lcor.setFont(new Font(null,Font.PLAIN,20));
        lcor.setBounds(230, 300, 500, 50);
        frame.add(lcor);
        lcor.setVisible(false);

        lncor.setFont(new Font(null,Font.PLAIN,20));
        lncor.setBounds(240, 300, 500, 50);
        frame.add(lncor);
        lncor.setVisible(false);

        lback.setFont(new Font(null,Font.PLAIN,13));
        lback.setBounds(40,475, 500, 50);
        frame.add(lback);


        bback.setBounds(20, 510, 70, 30);
        bback.addActionListener(this);
        bback.setIcon(iconback);
        frame.add(bback);

        bgen.setBounds(420, 160, 85, 25);
        bgen.addActionListener(this);
        frame.add(bgen);
        //bgen.setIcon(iconcal);

        bsub.setBounds(370, 210, 75, 25);
        bsub.addActionListener(this);
        frame.add(bsub);

        txt1.setFont(new Font(null,Font.PLAIN,15));
        txt1.setBounds(250, 215, 100, 25);
        frame.add(txt1);


        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bback){
            LaunchPageMath lp = new LaunchPageMath();
            frame.dispose();
        }
        if(e.getSource()==bgen){
            txt1.setText("");
            lmath.setText(prac.genmath());
            lcor.setVisible(false);
            lncor.setVisible(false);
            
        }
        if(e.getSource()==bsub){
            
            if(txt1.getText().equals(prac.getnumans())){
                lcor.setText(prac.getnumans()+" is correct");
                lcor.setVisible(true);
                lncor.setVisible(false);
                txt1.setText("");
            }else if(!(txt1.getText().equals(prac.getnumans()))){
                sncl = txt1.getText();
                lncor.setText(sncl+" not Correct");
                lncor.setVisible(true);
                lcor.setVisible(false);
                txt1.setText("");
            }
        }
        

    }
}

    

