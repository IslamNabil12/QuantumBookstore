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
public class EBook extends book{
    String fileType;
      public EBook(  String ISBN, String title, String author, int publishYear, double price , String fileType )
    {
        super(ISBN,title,author,publishYear,price,true);
        this.fileType = fileType;
    }
    
}
