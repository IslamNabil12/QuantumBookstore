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
public class paperBook extends book{
    
    int stock;
    public paperBook(  String ISBN, String title, String author, int publishYear, double price , int stock )
    {
        super(ISBN,title,author,publishYear,price, true);
        this.stock = stock;
    }
    
}
