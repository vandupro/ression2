/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Bai7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Moi nhap so nguyen: ");
        int x = scan.nextInt();
        
        if(x % 2 == 0 && x >= 0)
            System.out.printf("\n%d la so nguyen duong chan", x);
        else if(x % 2 == 0 && x < 0)
            System.out.printf("\n%d la so nguyen am chan", x);
        else if(x % 2 != 0 && x < 0)
            System.out.printf("\n%d la so nguyen am le", x); 
        else
            System.out.printf("\n%d la so nguyen duong le", x); 
        if( x > 99){
            int soDau = x/100;
            int soCuoi = x % 10;
            System.out.println("\nSo dau: "+ soDau);
            System.out.println("So cuoi: "+ soCuoi);
            
        }
    }
    
    
}
