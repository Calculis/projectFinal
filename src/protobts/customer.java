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
            card=new memberCard(scan.nextLine());
        }
        else{
            System.out.println("You already have card");
        }
    }
    public memberCard getCard(){
        return card;
    }
    
    
    
}
