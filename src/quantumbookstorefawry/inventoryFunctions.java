/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quantumbookstorefawry;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Islam
 */
public class inventoryFunctions {
    
                  public boolean checkpaperbook(book b){
          if(!(b instanceof paperBook)) {
        return false;
    }
          return true;
     }
     public boolean checkdemobook(book b){
          if(!(b instanceof Demobook)) {
              
        return false;
    }
          return true;
     }
    public void addtoinventory(book b)
    {
        QuantumBookstoreFAWRY.inventory.add(b); 
        System.out.println("**  Book Added Successfully **");
        System.out.println("------------");
}
    public ArrayList<book> removeOutdated(int year)
    {
             ArrayList<book> removedbook = new ArrayList<>();

          int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int exactyear = currentYear - year;
        Iterator<book> iterator = QuantumBookstoreFAWRY.inventory.iterator();
          while (iterator.hasNext()) {
            book book = iterator.next();
            if (book.publishYear < exactyear) {
                removedbook.add(book);
                iterator.remove();
            }
        }
     
        
        return removedbook;
    }
    
    public void Buybook(String ISBN, int quantity, String email, String address)
    {
        boolean found = false;
         for(book b  : QuantumBookstoreFAWRY.inventory)
        {
            String isbn = b.ISBN;
           if(isbn.equals(ISBN))
           {
            found = true;   
               if(b.canbuy)
               {
                   if(checkpaperbook(b))
                   {
                       paperBook pb = (paperBook) b;
                       if((pb.stock - quantity) >= 0)
                       {
                           pb.stock -= quantity;
                           System.out.println("** the receipt ** ");
                           System.out.println("Subtotal :" + quantity*pb.price);
                           System.out.println("Shipping :" + "30");
                           System.out.println(" paid amount :" + ((quantity*pb.price)+30));
            System.out.println("Paper book is sent to the ShippingService with address provided : " + address);
                           System.out.println("---------------------------");
                      
                       }else{
                           System.out.println("The required quantity is NOT available");
                           System.out.println("**------------------------**");

                       }
                   }else{
                        EBook eb = (EBook) b;
                           System.out.println("** the receipt ** ");
                           System.out.println("amount :" + eb.price);
                           System.out.println("Send EBook to MailService with email provided : "+ email);
                           System.out.println("---------------------------");
                                                                             
                   }
               }else{
                   System.out.println("Sorry This BOOK IS NOT FOR SALE");
                   System.out.println("**------------------------**");

               }
           }
            
        }
         if(found == false)
         {
      System.out.println("Undefined Book");

         }
    }

}