public class MathScore extends practice {
    private int truecount, pluscount,keepaction,countscore,countcount;
    private String countchoice;


    MathScore(){
        this.truecount=0;
        this.pluscount=0;
        this.keepaction=0;
        this.countscore=0;
    }

    public void setTruecount(int truecount){
        this.truecount=truecount;
    }
    public void setPluscount(int pluscounts){
        this.pluscount+=pluscounts;
        
    }
    public void setReplus(int pluscount){
        this.pluscount=pluscount;
    }
    public int getTruecount(){
        return truecount;
    }
    public int getPluscount(){
        return pluscount;
    }
    public void setKeepaction(int keepaction){
        this.keepaction=keepaction;
    }
    public int getKeepaction(){
        return keepaction;
    }
    public void setCountscore(int countscores){
        this.countscore+=countscores;
    }
    public void setreCountscore(int countscore){
        this.countscore=countscore;
    }
    public int getCountscore(){
        return countscore;
    }
    public void setStchoice(int stchoice){
        String a = String.valueOf(stchoice);
        this.countchoice=a;
    }
    public String getStchoice(){
        return countchoice;
    }
    
}
    

    

    

