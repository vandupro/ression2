/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Moi nhap vao so nguyen: ");
       int x = scan.nextInt();
       System.out.println("______________");
       int count = 0;
       for(int i = 2; i <= (int)(x/2); i++){
           if(x % i == 0){
               count++;
           }          
       }
       if(count != 0 || x <= 1)
           System.out.println("So ban nhap khong phai la so nguyen to");
       else
           System.out.println("So ban nhap la so nguyen to");
    }
}
