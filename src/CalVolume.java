import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalVolume implements ActionListener{
    Geovo vo =new Geovo();
    JFrame frame = new JFrame();
    JButton bback= new JButton();
    JButton bsub = new JButton();
    JLabel labeltitle = new JLabel("Calculate Volume");
    JLabel line1 = new JLabel();
    JLabel line2 = new JLabel();
    JLabel linesummarize = new JLabel();
    JLabel labelcal = new JLabel("Calculate");
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();
    JLabel line3 = new JLabel();
    JLabel label7 = new JLabel();
    JLabel lcaution = new JLabel("Please select  type of Geometry");
    JLabel lback = new JLabel("Back");
    JTextField txt1 = new JTextField();
    JTextField txt2 = new JTextField();
    JTextField txt3 = new JTextField();
    String [] volume = {"-select Geometry-","Rectangular prism","Sphere","Pyramid","Cylinder","Cone"};
    JComboBox cmb = new JComboBox(volume);
    ImageIcon iconback = new ImageIcon("src/back.png");
    ImageIcon iconcal = new ImageIcon("src/calculate.png");
    ImageIcon iconrec = new ImageIcon("src/rectangular.png");
    ImageIcon iconsph = new ImageIcon("src/sphere.png");
    ImageIcon iconpyr= new ImageIcon("src/pyramid.png");
    ImageIcon iconcyl= new ImageIcon("src/cylinder.png");
    ImageIcon iconcon= new ImageIcon("src/cone.png");
    JLabel lpicgo = new JLabel();
    CalVolume(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(700,200,600,600);
        frame.setTitle("Calculate Volume");
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(173,242,253));
        frame.setVisible(true);

        frame.add(cmb);
        cmb.setBounds(200, 80, 200, 25);
        cmb.addActionListener(this);
        cmb.setVisible(true);

        bback.setBounds(20, 510, 70, 30);
        bback.addActionListener(this);
        bback.setIcon(iconback);
        frame.add(bback);

        bsub.setBounds(455, 165, 50, 60);
        bsub.addActionListener(this);
        frame.add(bsub);
        bsub.setIcon(iconcal);
        bsub.setVisible(false);

        labeltitle.setFont(new Font("MV Boli",Font.PLAIN,40));
        labeltitle.setBounds(155,20,350,30);
        frame.add(labeltitle);

        labelcal.setFont(new Font("MV Boli",Font.PLAIN,10));
        labelcal.setBounds(458,140,300,30);
        frame.add(labelcal);
        labelcal.setVisible(false);

        line1.setFont(new Font("MV Boli",Font.PLAIN,20));
        line1.setBounds(175, 150, 100, 30);
        frame.add(line1);

        line2.setFont(new Font("MV Boli",Font.PLAIN,20));
        line2.setBounds(175, 220, 100, 30);
        frame.add(line2);

        linesummarize.setFont(new Font(null,Font.PLAIN,25));
        linesummarize.setBounds(120, 430, 500, 50);
        frame.add(linesummarize);

        label4.setFont(new Font(null,Font.PLAIN,15));
        label4.setBounds(120, 380, 500, 50);
        frame.add(label4);

        label5.setFont(new Font(null,Font.PLAIN,15));
        label5.setBounds(120, 405, 500, 50);
        frame.add(label5);

        label7.setFont(new Font(null,Font.PLAIN,15));
        label7.setBounds(120, 355, 500, 50);
        frame.add(label7);

        line3.setFont(new Font("MV Boli",Font.PLAIN,20));
        line3.setBounds(175, 280, 500, 50);
        frame.add(line3);

        lcaution.setFont(new Font(null,Font.PLAIN,25));
        lcaution.setForeground(new Color(75, 75, 75));
        lcaution.setBounds(115, 250, 500, 50);
        frame.add(lcaution);
    

        txt1.setFont(new Font(null,Font.PLAIN,15));
        txt1.setBounds(275, 150, 144, 25);
        frame.add(txt1);
        txt1.setVisible(false);
        
        txt2.setFont(new Font(null,Font.PLAIN,15));
        txt2.setBounds(275, 220, 144, 25);
        frame.add(txt2);
        txt2.setVisible(false);

        txt3.setFont(new Font(null,Font.PLAIN,15));
        txt3.setBounds(275, 290, 144, 25);
        frame.add(txt3);
        txt3.setVisible(false);

        lpicgo.setBounds(10, 125, 150, 150);
        lpicgo.setVisible(false);
        frame.add(lpicgo);

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
        }
        if(e.getSource()==cmb&&cmb.getSelectedIndex()==0){
            lpicgo.setVisible(false);
            txt1.setVisible(false);
            txt2.setVisible(false);
            txt3.setVisible(false);
            line1.setVisible(false);
            line2.setVisible(false);
            line3.setVisible(false);
            bsub.setVisible(false);
            lcaution.setVisible(true);
            linesummarize.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
            label7.setVisible(false);
            txt1.setText(null);
            txt2.setText(null);
            txt3.setText(null);
            labelcal.setVisible(false);
            

        }
        
        if(e.getSource()==cmb&&cmb.getSelectedIndex()==1){
            lpicgo.setVisible(true);
            lcaution.setVisible(false);  
            line1.setText("Length");
            line2.setText("Width");
            line3.setText("Hight");
            txt1.setVisible(true);
            txt2.setVisible(true);
            txt3.setVisible(true);
            line1.setVisible(true);
            line2.setVisible(true);
            line3.setVisible(true);
            bsub.setVisible(true);
            lpicgo.setIcon(iconrec);           
            linesummarize.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
            label7.setVisible(false);
            linesummarize.setText(null);
            label4.setText(null);
            label5.setText(null);
            label7.setText(null);
            txt1.setText(null);
            txt2.setText(null);
            txt3.setText(null);
            labelcal.setVisible(true);

        }
        if(e.getSource()==cmb&&cmb.getSelectedIndex()==2){
            lpicgo.setVisible(true);
            lcaution.setVisible(false); 
            line1.setText("Radius");
            line1.setVisible(true);
            txt1.setVisible(true);
            txt2.setVisible(false);
            txt3.setVisible(false);
            line2.setVisible(false);
            bsub.setVisible(true);
            lpicgo.setIcon(iconsph);        
            linesummarize.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
            line3.setVisible(false);
            label7.setVisible(false);
            linesummarize.setText(null);
            label4.setText(null);
            label5.setText(null);
            label7.setText(null);
            txt1.setText(null);
            txt2.setText(null);
            txt3.setText(null);
            labelcal.setVisible(true);
        }
        if(e.getSource()==cmb&&cmb.getSelectedIndex()==3){
            lpicgo.setVisible(true);
            lcaution.setVisible(false); 
            line1.setText("Length");
            line2.setText("Width");
            line3.setText("Height");
            line1.setVisible(true);
            line2.setVisible(true);
            txt1.setVisible(true);
            txt2.setVisible(true);
            txt3.setVisible(true);
            bsub.setVisible(true);         
            lpicgo.setIcon(iconpyr);           
            linesummarize.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
            line3.setVisible(true);
            label7.setVisible(false);
            linesummarize.setText(null);
            label4.setText(null);
            label5.setText(null);
            label7.setText(null);
            txt1.setText(null);
            txt2.setText(null);
            txt3.setText(null);
            labelcal.setVisible(true);
        }
        if(e.getSource()==cmb&&cmb.getSelectedIndex()==4){
            lpicgo.setVisible(true);
            lcaution.setVisible(false); 
            line1.setText("Radius");
            line2.setText("Height");
            line1.setVisible(true);
            line2.setVisible(true);
            line3.setVisible(false);
            txt1.setVisible(true);
            txt2.setVisible(true);
            txt3.setVisible(false);
            bsub.setVisible(true);            
            lpicgo.setIcon(iconcyl);           
            linesummarize.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
            label7.setVisible(false);
            linesummarize.setText(null);
            label4.setText(null);
            label5.setText(null);
            label7.setText(null);
            txt1.setText(null);
            txt2.setText(null);
            txt3.setText(null);
            labelcal.setVisible(true);
        }
        if(e.getSource()==cmb&&cmb.getSelectedIndex()==5){
            lpicgo.setVisible(true);
            lcaution.setVisible(false); 
            line1.setText("Radius");
            line2.setText("Height");
            line1.setVisible(true);
            line2.setVisible(true);
            line3.setVisible(false);
            txt1.setVisible(true);
            txt2.setVisible(true);
            txt3.setVisible(false);
            bsub.setVisible(true);;
            lpicgo.setIcon(iconcon);
            linesummarize.setText(null);
            label4.setText(null);
            label5.setText(null);
            label7.setText(null);
            txt1.setText(null);
            txt2.setText(null);
            txt3.setText(null);
            labelcal.setVisible(true);
            
            
            linesummarize.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
            label7.setVisible(false);
        }
        try{
        if(e.getSource()==bsub){
            if(cmb.getSelectedIndex()==1){
                label5.setVisible(true);
                linesummarize.setVisible(true);
                label4.setVisible(true);
                label7.setVisible(true);
                vo.setnum1(Double.parseDouble(txt1.getText())); 
                vo.setnum2(Double.parseDouble(txt2.getText()));
                vo.setnum3(Double.parseDouble(txt3.getText()));
                vo.calRecPris();
                linesummarize.setText("Volume of Rectangular prism is "+vo.getnumans());
                label4.setText("Width is "+vo.getnum1());
                label5.setText("Height is "+vo.getnum2());
                label7.setText("Length is "+vo.getnum3());

                txt1.setText(null);
                txt2.setText(null);
                txt3.setText(null);
            }
            else if(cmb.getSelectedIndex()==2){
                label5.setVisible(true);
                linesummarize.setVisible(true);
                vo.setnum1(Double.parseDouble(txt1.getText()));
                vo.calSph(); 
                linesummarize.setText("Volume of Sphere is "+vo.getnumans());
                label5.setText("Radius is "+vo.getnum1());
                label4.setVisible(false);
                txt1.setText(null);
                txt2.setText(null);
                txt3.setText(null);
            }
            else if(cmb.getSelectedIndex()==3){
                label7.setVisible(true);
                label5.setVisible(true);
                linesummarize.setVisible(true);
                label4.setVisible(true);
                label5.setVisible(true);
                vo.setnum1(Double.parseDouble(txt1.getText())); 
                vo.setnum2(Double.parseDouble(txt2.getText()));
                vo.setnum3(Double.parseDouble(txt3.getText()));
                vo.calPy();
                linesummarize.setText("Volume of Pyramid "+vo.getnumans());
                label4.setText("Width is "+vo.getnum1());
                label5.setText("Height is "+vo.getnum2());
                label7.setText("Length is "+vo.getnum3());
                txt1.setText(null);
                txt2.setText(null);
                txt3.setText(null);
            }
            else if(cmb.getSelectedIndex()==4){
                label7.setVisible(true);
                label5.setVisible(true);
                linesummarize.setVisible(true);
                label4.setVisible(true);
                label5.setVisible(true);
                vo.setnum1(Double.parseDouble(txt1.getText())); 
                vo.setnum2(Double.parseDouble(txt2.getText()));
                vo.calCy();
                linesummarize.setText("Volume of Cylinder is "+vo.getnumans());
                label4.setText("Radius is "+vo.getnum1());
                label5.setText("Height is "+vo.getnum2());
                label7.setVisible(false);
                txt1.setText(null);
                txt2.setText(null);
                txt3.setText(null);
            }
            else if(cmb.getSelectedIndex()==5){
                label7.setVisible(true);
                label5.setVisible(true);
                linesummarize.setVisible(true);
                label4.setVisible(true);
                label5.setVisible(true);
                vo.setnum1(Double.parseDouble(txt1.getText())); 
                vo.setnum2(Double.parseDouble(txt2.getText()));
                vo.calCone();
                linesummarize.setText("Volume of Cone is "+vo.getnumans());
                label4.setText("Radius is "+vo.getnum1());
                label5.setText("Height is "+vo.getnum2());
                label7.setVisible(false);
                txt1.setText(null);
                txt2.setText(null);
                txt3.setText(null);
            }
            else {
                JOptionPane.showMessageDialog(frame,"Please select type of Geometry");

            }
        }  
    }catch(NumberFormatException ed){
        JOptionPane.showMessageDialog(frame,"Please put number only / put number all of chanel");
        txt1.setText(null);
        txt2.setText(null);
    }

    }

}