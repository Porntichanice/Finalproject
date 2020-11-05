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
public class ProtoBts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        customer c1 = new customer("nice");
customer c2 =new customer("fluk");
c2.Register();
c2.getCard().subtractMoney(100);
        System.out.println(c1);
        System.out.println(c2);
    }
    
}
