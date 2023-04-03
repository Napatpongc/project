import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalPracScore implements ActionListener {
    MathScore prac = new MathScore();
   String [] volume = {"               -Selec choice-","          -3 choice","         - 5 choice","         -10 choice"};
   JComboBox cmb = new JComboBox(volume);
    JFrame frame = new JFrame();
    JButton bback= new JButton();
    JButton bsub = new JButton("submit");
    JLabel labeltitle = new JLabel("Mathematical Practice");
    JLabel lwhat = new JLabel("what answer of           ?" );
    JLabel lmath = new JLabel(prac.genmath());
    JLabel lans = new JLabel("Answer is");
    JLabel lcor = new JLabel();
    JLabel lncor = new JLabel();
    JLabel lnumans = new JLabel();
    JLabel lcaution = new JLabel("Please select  number of choice");
    JLabel lchoice = new JLabel("1.");
    JLabel lscore = new JLabel();
    JLabel lback = new JLabel("Back");
    JTextField txt1 = new JTextField();
    ImageIcon iconback = new ImageIcon("src/back.png");
    ImageIcon iconcal = new ImageIcon("src/calculate.png");
    int countChoice=1;
    String stChoice,sncl;

    CalPracScore(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(700,200,600,600);
        frame.setTitle("Calculate Volume");
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(173,242,253));
        frame.setVisible(true);

        frame.add(cmb);
        cmb.setBounds(200, 110, 200, 25);
        cmb.addActionListener(this);


        labeltitle.setFont(new Font("MV Boli",Font.PLAIN,30));
        labeltitle.setBounds(150,60,350,30);
        frame.add(labeltitle);

        lcaution.setFont(new Font(null,Font.PLAIN,25));
        lcaution.setForeground(new Color(75, 75, 75));
        lcaution.setBounds(115, 250, 500, 50);
        frame.add(lcaution);

        lwhat.setFont(new Font("MV Boli",Font.PLAIN,22));
        lwhat.setBounds(100, 150, 500, 50);
        frame.add(lwhat);
        lwhat.setVisible(false);

        lmath.setFont(new Font("MV Boli",Font.PLAIN,22));
        lmath.setBounds(280, 150, 500, 50);
        frame.add(lmath);
        lmath.setVisible(false);


        lans.setFont(new Font("MV Boli",Font.PLAIN,22));
        lans.setBounds(130, 200, 500, 50);
        frame.add(lans);
        lans.setVisible(false);

        lcor.setFont(new Font(null,Font.PLAIN,20));
        lcor.setBounds(230, 300, 500, 50);
        frame.add(lcor);
        lcor.setVisible(false);

        lncor.setFont(new Font(null,Font.PLAIN,20));
        lncor.setBounds(240, 300, 500, 50);
        frame.add(lncor);
        lncor.setVisible(false);

        lchoice.setFont(new Font(null,Font.PLAIN,22));
        lchoice.setBounds(80,150, 500, 50);
        frame.add(lchoice);
        lchoice.setVisible(false);

        lscore.setFont(new Font(null,Font.PLAIN,30));
        lscore.setBounds(215,420, 500, 50);
        frame.add(lscore);
        lscore.setVisible(false);

        lback.setFont(new Font(null,Font.PLAIN,13));
        lback.setBounds(40,475, 500, 50);
        frame.add(lback);
       


        bback.setBounds(20, 510, 70, 30);
        bback.addActionListener(this);
        bback.setIcon(iconback);
        frame.add(bback);

        bsub.setBounds(370, 210, 75, 25);
        bsub.addActionListener(this);
        frame.add(bsub);
        bsub.setVisible(false);

        txt1.setFont(new Font(null,Font.PLAIN,15));
        txt1.setBounds(250, 215, 100, 25);
        frame.add(txt1);
        txt1.setVisible(false);


        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bback){
            LaunchPageMath lp = new LaunchPageMath();
            frame.dispose();
        }
        if(e.getSource()==cmb&&cmb.getSelectedIndex()==0){
            prac.setTruecount(3);
            bsub.setVisible(false);
            lwhat.setVisible(false);
            lmath.setVisible(false);
            lmath.setVisible(false);
            lans.setVisible(false);
            txt1.setVisible(false);
            lcaution.setVisible(true);
            lcor.setVisible(false);
            lncor.setVisible(false);
            lchoice.setVisible(false);
            lscore.setVisible(false);
            countChoice=0;
            

        }
        if(e.getSource()==cmb&&cmb.getSelectedIndex()==1){
            prac.setTruecount(3);
            prac.setKeepaction(3);
            bsub.setVisible(true);
            lwhat.setVisible(true);
            lmath.setVisible(true);
            lmath.setVisible(true);
            lans.setVisible(true);
            txt1.setVisible(true);
            lcaution.setVisible(false);
            lcor.setVisible(false);
            lncor.setVisible(false);
            lchoice.setVisible(true);
            lscore.setVisible(true);
            countChoice=1;
            stChoice = String.valueOf(countChoice);
                lchoice.setText(stChoice+".");
                prac.setreCountscore(0);
                lscore.setText("Score "+prac.getCountscore()+" / "+ prac.getKeepaction());
        }
        if(e.getSource()==cmb&&cmb.getSelectedIndex()==2){
            prac.setTruecount(5);
            prac.setKeepaction(5);
            bsub.setVisible(true);
            lwhat.setVisible(true);
            lmath.setVisible(true);
            lmath.setVisible(true);
            lans.setVisible(true);
            txt1.setVisible(true);
            lcaution.setVisible(false);
            lcor.setVisible(false);
            lncor.setVisible(false);
            lchoice.setVisible(true);
            lscore.setVisible(true);
            countChoice=1;
            stChoice = String.valueOf(countChoice);
                lchoice.setText(stChoice+".");
                prac.setreCountscore(0);
                lscore.setText("Score "+prac.getCountscore()+" / "+ prac.getKeepaction());
        }
        if(e.getSource()==cmb&&cmb.getSelectedIndex()==3){
            prac.setTruecount(10);
            prac.setKeepaction(10);
            bsub.setVisible(true);
            lwhat.setVisible(true);
            lmath.setVisible(true);
            lmath.setVisible(true);
            lans.setVisible(true);
            txt1.setVisible(true);
            lcaution.setVisible(false);
            lcor.setVisible(false);
            lncor.setVisible(false);
            lchoice.setVisible(true);
            lscore.setVisible(true);
            countChoice=1;
            stChoice = String.valueOf(countChoice);
                lchoice.setText(stChoice+".");
                prac.setreCountscore(0);
                lscore.setText("Score "+prac.getCountscore()+" / "+ prac.getKeepaction());
        }
        if(e.getSource()==bsub){
            if(txt1.getText().equals(prac.getnumans())){
               
                prac.setPluscount(1);
               if(prac.getTruecount()==prac.getPluscount()){
                prac.setCountscore(1);
                lmath.setText(prac.genmath());
                txt1.setText("");
                countChoice=1;
                stChoice = String.valueOf(countChoice);
                lchoice.setText(stChoice+".");
                lscore.setText("Score "+0+" / "+ prac.getKeepaction());
                lncor.setVisible(false);
                lcor.setVisible(false);
                lncor.setVisible(false);
                JOptionPane.showMessageDialog(frame,"Your Score is "+prac.getCountscore()+"/"+prac.getKeepaction());
                
                prac.setreCountscore(0);
                prac.setTruecount(prac.getKeepaction());
                    prac.setReplus(0);
               }else{
                
                countChoice++;
            stChoice = String.valueOf(countChoice);
            lchoice.setText(stChoice+".");
                lcor.setText(prac.getnumans()+" is correct");
                lmath.setText(prac.genmath());
                lcor.setVisible(true);
                lncor.setVisible(false);
                txt1.setText("");
                prac.setCountscore(1);
                lscore.setText("Score "+prac.getCountscore()+" / "+ prac.getKeepaction());
               }   
                }             
            else if(!(txt1.getText().equals(prac.getnumans()))){
                sncl = txt1.getText();
                
                
                prac.setPluscount(1);
                if(prac.getTruecount()==prac.getPluscount()){
                    lmath.setText(prac.genmath());
                    txt1.setText("");
                    countChoice=1;
                    stChoice = String.valueOf(countChoice);
                lchoice.setText(stChoice+".");
                lscore.setText("Score "+0+" / "+ prac.getKeepaction());
                lncor.setVisible(false);
                lcor.setVisible(false);
                lncor.setVisible(false);
                    JOptionPane.showMessageDialog(frame,"Your Score is "+prac.getCountscore()+"/"+prac.getKeepaction());
                    
                    prac.setreCountscore(0);
                    prac.setTruecount(prac.getKeepaction());
                    prac.setReplus(0);
                   }else{
                    countChoice++;
            stChoice = String.valueOf(countChoice);
            lchoice.setText(stChoice+".");
                
                lncor.setText(sncl+" not Correct");
                lmath.setText(prac.genmath());
                lncor.setVisible(true);
                lcor.setVisible(false);  
                txt1.setText(""); 
                lscore.setText("Score "+prac.getCountscore()+" / "+ prac.getKeepaction());
                   }   
            }
        }
        

    }
}

    

