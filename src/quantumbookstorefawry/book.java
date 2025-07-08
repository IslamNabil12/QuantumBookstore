/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quantumbookstorefawry;

/**
 *
 * @author Islam
 */
public abstract class book {
     String ISBN;
    String title;
    String author;
    int publishYear;
    double price;
    boolean canbuy;

     public book( String ISBN, String title, String author, int publishYear, double price , boolean canbuy)
    {
       this.ISBN = ISBN ;
       this.title = title;
       this.author     = author; 
        this.publishYear = publishYear;
       this.price = price; 
       this.canbuy = canbuy;
    }
 
}
