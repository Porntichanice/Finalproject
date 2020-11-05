/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protobts;
import java.util.Scanner;
/**
 *
 * @author phunon
 */
public class customer {
    private String name;
    private final Scanner scan=new Scanner(System.in);
    private memberCard card;
    private final Station station=new Station();

    public customer(String name) {
        this.name = name;
        
    }

    public customer(String name, memberCard card) {
        this.name = name;
        this.card = card;
    }
    
    public void Register(){
        if(card==null){
            System.out.println("Input your name to register");
            String name=scan.nextLine();
           //int a= 10;
           //int b=a;
            card=new memberCard(name);
        }
        else{
            System.out.println("You already have card");
        }
    }
    public memberCard getCard(){
        return card;
    }
public void Go(){
    
   for(int i=0;i<station.getAllStation().length;i++){
       System.out.println("กด "+i+" ไป "+station.getAllStation()[i] );
   }
   int menu=scan.nextInt();
   
    
}
//public double calculate(){
//    
//}
    @Override
    public String toString() {
        return name+" " +card+"";
    }
    
    
    
    
}
