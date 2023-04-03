public class Geoar {
    protected double num1=0,num2=0,num3=0,numans=0;
    
    Geoar(){

    }
    public void calRec (){
        numans=num1*num2;
    }
    public void calCir (){
        numans=num1*3.14;
    }
    public void calTri (){
        numans=num1*num2*0.5;
    }
    public void calPen (){
        numans=((num1*5)*num2)*0.5;
    }
    public void calHex (){
        numans=((num1*6)*num2)*0.5;
    }
    public void setnum1(double num1){
        this.num1=num1;
    }
    public double getnum1(){
        return num1;
    }
    public void setnum2(double num2){
        this.num2=num2;
    }
    public double getnum2(){
        return num2;
    }
    public void setnum3(double num3){
        this.num3=num3;
    }
    public double getnum3(){
        return num3;
    }
    public void setnumans(double numans){
        this.numans=numans;
    }
    public String getnumans(){
        String snumans = String.valueOf(numans);
        return snumans;
    }

    
}
