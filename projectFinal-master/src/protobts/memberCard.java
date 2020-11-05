/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protobts;

/**
 *
 * @author phunon
 */
public class memberCard {

    private  static long numberofCard ;
    private String idcard ;
    private String Cardholder;
    private double remainMoney;
    private Station destination;
  

    public memberCard(String name) {
        numberofCard++;
        this.Cardholder=name;
        this.remainMoney = 0;
        this.idcard= "000"+String.valueOf(numberofCard);
        
    }
    public void addMoney(double cash){
        remainMoney+=cash;// a+=b == a=a+b
    }
    public void subtractMoney(double cash){
        if(remainMoney<cash){
            System.out.println("No enough Money");
        }
        else{
            remainMoney-=cash;
        }
    }
    
    @Override
    public String toString() {
        return  "CardHolder="+ Cardholder + " idcard=" + idcard + ", remainMoney=" + remainMoney ;
    }
    public void show(){
        System.out.println(numberofCard);
    }
    
    
    
    
}
