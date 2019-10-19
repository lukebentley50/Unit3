package Lesson8.studentbrowser;

import java.awt.Graphics;

public class GameController {
    private Dice d1,d2;
    boolean newGame;
    private int rollnum,point;
    public GameController(Graphics g1,Graphics g2){
        d1=new Dice(g1);
        d2=new Dice(g2);
        rollnum=0;
        point=0;
        newGame=true;
    }
    
    public void roll(){
        newGame=false;
        rollnum++;
        d1.roll();
        d2.roll();
        if(rollnum==1){
            point=getTotal();
        }
    }
    
    public boolean isNewGame(){
        return newGame;
    }
    
    public int getTotal(){
        System.out.println(d1.getNum());
        return d1.getNum()+d2.getNum();
    }
    
    public int getPoint(){return point;}
    
    public boolean hasWon(){
        if(rollnum==1){
            if(getTotal()==7||getTotal()==1)return true;
        }else{
            return getTotal()==point;
        }
        return false;
    }
    
    public boolean hasLost(){
        if((getTotal()==2||getTotal()==3||getTotal()==12)&&rollnum==1){
            return true;
        }else if(rollnum>1){
            return getTotal()==7;
        }
        return false;
    }
}
