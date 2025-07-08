/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quantumbookstorefawry;

import java.util.ArrayList;

/**
 *
 * @author Islam
 */
public class QuantumBookstoreFAWRY {

   public static ArrayList<book> inventory = new ArrayList<>();
    public static void main(String[] args) {
       
        
//test adding
        book pb = new paperBook("A1", "paperBOOK", "A", 2010, 150, 20);     
        book eb = new EBook("B2", "EBOOK", "B", 2025, 100, "pdf");
        book db = new Demobook("C3", "demoBOOK", "C", 2020, 90);
inventoryFunctions invent = new inventoryFunctions();
invent.addtoinventory(pb);
invent.addtoinventory(eb);
invent.addtoinventory(db);


//test delete
   ArrayList<book> show = invent.removeOutdated(5);
        System.out.println("**  the outdated books **");
        for (book b : show) {
            System.out.println("ISBN :" + b.ISBN);
            System.out.println("auther :" + b.author);
            System.out.println("title :" + b.title);
            System.out.println("-------------------------------");
        }
        
 //test buying
        invent.Buybook("A1", 10, "islamnabil558@gmail.com", "nasr city");     
        invent.Buybook("A1", 50, "islamnabil558@gmail.com", "nasr city");    
        invent.Buybook("B2", 10, "fawry@fawry.com", "Egypt");
        invent.Buybook("C3", 10, "none@none.com", "paris");
    }
    
}
