import java.util.Random;
class practice{
    Random rnd = new Random();
    private int num1,num2,numans;
    private String action;
    public practice(){
        setnum1(rnd.nextInt(100));
        setnum2(rnd.nextInt(100));
        int getrandom = rnd.nextInt(3);
        if(getrandom==0){
            setaction("plus");
            setnumans(getnum1()+getnum2());
        }else if(getrandom==1){
            setaction("minus");
            setnumans(getnum1()-getnum2());
        }else {
            setaction("multiply");
            setnumans(getnum1()*getnum2());
        }  
    }
    public String genmath(){
        setnum1(rnd.nextInt(100));
        setnum2(rnd.nextInt(100));
        int getrandom = rnd.nextInt(3);
        if(getrandom==0){
            setaction("plus");
            setnumans(getnum1()+getnum2());

        }else if(getrandom==1){
            setaction("minus");
            setnumans(getnum1()-getnum2());;
        }else {
            setaction("multiply");
            setnumans(getnum1()*getnum2());
        }
        String snum1 = String.valueOf(getnum1());
        String snum2 = String.valueOf(getnum2());
        if(action.equals("plus")){
            setnumans(getnum1()+getnum2());
            return snum1+" + "+snum2;
        }else if(action.equals("minus")) {
            setnumans(getnum1()-getnum2());
            return snum1+" - "+snum2;
        }
        else  {
            setnumans(getnum1()*getnum2());
            return snum1+" x "+snum2;
        }
    }
    public int getnum1(){
        return num1;
    }
    public void setnum1(int num1){
        this.num1=num1;
    }
    public int getnum2(){
        return num2;
    }
    public void setnum2(int num2){
        this.num2=num2;
    }
    public String getnumans(){
        String snumans = String.valueOf(numans);
        return snumans;
    }
    public void setnumans(int numans){
        this.numans=numans;
    }
    public String getaction(){
        return action;
    }
    public void setaction(String action){
        this.action=action;  
}
}