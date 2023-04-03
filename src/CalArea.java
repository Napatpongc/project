import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalArea implements ActionListener{
    JFrame frame = new JFrame();
    Geoar ar = new Geoar();
    
    JButton bback= new JButton();
    JButton bsub = new JButton();
    JLabel labeltitle = new JLabel("Calculate Area");
    JLabel labelcal = new JLabel("Calculate");
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();
    JLabel lcaution = new JLabel("Please select  type of Geometry");
    JLabel lback = new JLabel("Back");
    JTextField txt1 = new JTextField();
    JTextField txt2 = new JTextField();
    JPanel picturego = new JPanel();
    String [] volume = {"-select Geometry-","Rectangle","Circle","Triangle","pentagon","hexagon"};
    JComboBox cmb = new JComboBox(volume);
    ImageIcon iconback = new ImageIcon("src/back.png");
    ImageIcon iconcal = new ImageIcon("src/calculate.png");
    ImageIcon iconrec = new ImageIcon("src/rectangle.png");
    ImageIcon iconcir = new ImageIcon("src/circle.png");
    ImageIcon icontri = new ImageIcon("src/triangle.png");
    ImageIcon iconpen= new ImageIcon("src/pentagon.png");
    ImageIcon iconhex= new ImageIcon("src/hexagon.png");
    JLabel lpicgo = new JLabel();
    
    CalArea(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(700,200,600,600);
        frame.setTitle("Calculate Area");
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

        labelcal.setFont(new Font("MV Boli",Font.PLAIN,10));
        labelcal.setBounds(458,140,300,30);
        frame.add(labelcal);
        labelcal.setVisible(false);

        labeltitle.setFont(new Font("MV Boli",Font.PLAIN,40));
        labeltitle.setBounds(175,20,300,30);
        frame.add(labeltitle);

        label1.setFont(new Font("MV Boli",Font.PLAIN,20));
        label1.setBounds(175, 150, 100, 30);
        frame.add(label1);

        label2.setFont(new Font("MV Boli",Font.PLAIN,20));
        label2.setBounds(175, 220, 100, 30);
        frame.add(label2);

        label3.setFont(new Font(null,Font.PLAIN,25));
        label3.setBounds(160, 410, 500, 50);
        frame.add(label3);

        label4.setFont(new Font(null,Font.PLAIN,15));
        label4.setBounds(160, 360, 500, 50);
        frame.add(label4);

        label5.setFont(new Font(null,Font.PLAIN,15));
        label5.setBounds(160, 385, 500, 50);
        frame.add(label5);

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

        lpicgo.setBounds(10, 125, 150, 150);
        lpicgo.setVisible(false);
        frame.add(lpicgo);

        lback.setFont(new Font(null,Font.PLAIN,13));
        lback.setBounds(40,475, 500, 50);
        frame.add(lback);
      
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        double a,b,area;
        if(e.getSource()==bback){
            LaunchPage lp = new LaunchPage();
            frame.dispose();
        }
        if(e.getSource()==cmb&&cmb.getSelectedIndex()==0){
        lpicgo.setVisible(false);
        label1.setVisible(false);
        label2.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(false);
        lcaution.setVisible(true);
        txt1.setVisible(false);
        txt2.setVisible(false);
        picturego.setVisible(false);
        bsub.setVisible(false);
        txt1.setText(null);
        txt2.setText(null);
        labelcal.setVisible(false);

        }
        
        if(e.getSource()==cmb&&cmb.getSelectedIndex()==1){
            lpicgo.setVisible(true);
            lcaution.setVisible(false);  
            label1.setText("Width");
            label2.setText("hight");
            txt1.setVisible(true);
            txt2.setVisible(true);
            label1.setVisible(true);
            label2.setVisible(true);
            bsub.setVisible(true);
            lpicgo.setVisible(true);
            lpicgo.setIcon(iconrec);
            label3.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
            label4.setText(null);
            label5.setText(null);
            label3.setText(null);
            txt1.setText(null);
            txt2.setText(null);
            labelcal.setVisible(true);
            

        }
        if(e.getSource()==cmb&&cmb.getSelectedIndex()==2){
            lpicgo.setVisible(true);
            lcaution.setVisible(false); 
            label1.setText("Radius");
            label1.setVisible(true);
            txt1.setVisible(true);
            txt2.setVisible(false);
            label2.setVisible(false);
            bsub.setVisible(true);
            lpicgo.setVisible(true);
            lpicgo.setIcon(iconcir);
            label3.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
            label4.setText(null);
            label5.setText(null);
            label3.setText(null);
            txt1.setText(null);
            txt2.setText(null);
            labelcal.setVisible(true);
        }
        if(e.getSource()==cmb&&cmb.getSelectedIndex()==3){
            lpicgo.setVisible(true);
            lcaution.setVisible(false); 
            label1.setText("base");
            label2.setText("height");
            label1.setVisible(true);
            label2.setVisible(true);
            txt1.setVisible(true);
            txt2.setVisible(true);
            bsub.setVisible(true);
            lpicgo.setVisible(true);
            lpicgo.setIcon(icontri);
            label3.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
            label4.setText(null);
            label5.setText(null);
            label3.setText(null);
            txt1.setText(null);
            txt2.setText(null);
            labelcal.setVisible(true);
        }
        if(e.getSource()==cmb&&cmb.getSelectedIndex()==4){
            lpicgo.setVisible(true);
            lcaution.setVisible(false); 
            label1.setText("side");
            label2.setText("apothem");
            label1.setVisible(true);
            label2.setVisible(true);
            txt1.setVisible(true);
            txt2.setVisible(true);
            bsub.setVisible(true);
            lpicgo.setVisible(true);
            lpicgo.setIcon(iconpen);
            label3.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
            label4.setText(null);
            label5.setText(null);
            label3.setText(null);
            txt1.setText(null);
            txt2.setText(null);
            labelcal.setVisible(true);
        }
        if(e.getSource()==cmb&&cmb.getSelectedIndex()==5){
            lpicgo.setVisible(true);
            lcaution.setVisible(false); 
            label1.setText("side");
            label2.setText("apothem");
            label1.setVisible(true);
            label2.setVisible(true);
            txt1.setVisible(true);
            txt2.setVisible(true);
            bsub.setVisible(true);
            lpicgo.setVisible(true);
            lpicgo.setIcon(iconhex);
            label3.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
            label4.setText(null);
            label5.setText(null);
            label3.setText(null);
            txt1.setText(null);
            txt2.setText(null);
            labelcal.setVisible(true);
        }
        try{
        if(e.getSource()==bsub){
            if(cmb.getSelectedIndex()==1){
                label5.setVisible(true);
                label3.setVisible(true);
                label4.setVisible(true);
                ar.setnum1(Double.parseDouble(txt1.getText())); 
                ar.setnum2(Double.parseDouble(txt2.getText()));
                ar.calRec();
                label3.setText("Area of Triangle is "+ar.getnumans());
                label4.setText("Width is "+ar.getnum1());
                label5.setText("Height is "+ar.getnum2());
                txt1.setText(null);
                txt2.setText(null);
            }
            else if(cmb.getSelectedIndex()==2){
                label5.setVisible(true);
                label3.setVisible(true);
                label4.setVisible(true);
                ar.setnum1(Double.parseDouble(txt1.getText()));
                ar.calCir();
                label3.setText("Area of Circle is "+ar.getnumans());
                label5.setText("Radius is "+ar.getnum1());
                label4.setVisible(false);
                txt1.setText(null);
                txt2.setText(null);
            }
            else if(cmb.getSelectedIndex()==3){
                label5.setVisible(true);
                label3.setVisible(true);
                label4.setVisible(true);
                label5.setVisible(true);
                ar.setnum1(Double.parseDouble(txt1.getText())); 
                ar.setnum2(Double.parseDouble(txt2.getText()));
                ar.calTri();
                label3.setText("Area of Triangle is "+ar.getnumans());
                label4.setText("Base is "+ar.getnum1());
                label5.setText("Height is "+ar.getnum2());
                txt1.setText(null);
                txt2.setText(null);
            }
            else if(cmb.getSelectedIndex()==4){
                label5.setVisible(true);
                label3.setVisible(true);
                label4.setVisible(true);
                label5.setVisible(true);
                ar.setnum1(Double.parseDouble(txt1.getText())); 
                ar.setnum2(Double.parseDouble(txt2.getText()));
                ar.calPen();
                label3.setText("Area of Pentagon is "+ar.getnumans());
                label4.setText("Side length is "+ar.getnum1());
                label5.setText("Apothem is "+ar.getnum2());
                txt1.setText(null);
                txt2.setText(null);
            }
            else if(cmb.getSelectedIndex()==5){
                label5.setVisible(true);
                label3.setVisible(true);
                label4.setVisible(true);
                label5.setVisible(true);
                ar.setnum1(Double.parseDouble(txt1.getText())); 
                ar.setnum2(Double.parseDouble(txt2.getText()));
                ar.calHex();
                label3.setText("Area of Pentagon is "+ar.getnumans());
                label4.setText("Side length is "+ar.getnum1());
                label5.setText("Apothem is "+ar.getnum2());
                txt1.setText(null);
                txt2.setText(null);
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