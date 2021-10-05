/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gsloop;
import java.util.*;
/**
 *
 * @author Abdul Moiz Chishti
 */
public class GsLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner obj=new Scanner (System.in);
        System.out.print("enter Starting number:");
        int s=obj.nextInt();
        System.out.print("enter ending number:");
        int e=obj.nextInt();
        
        Counting con=new Counting();
        con.getmeth(s, e);
    
    }
    
}
