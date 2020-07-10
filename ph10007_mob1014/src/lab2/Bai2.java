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
public class Bai2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Giai PT: a*x*x + b*x + c = 0");
        System.out.print("Moi nhap gia tri cua a: ");
        int a = scan.nextInt();
        System.out.print("Moi nhap gia tri cua b: ");
        int b = scan.nextInt();
        System.out.print("Moi nhap gia tri cua c: ");
        int c = scan.nextInt();
        
        if(a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("PT vo so nghiem");
                }else
                    System.out.println("PT vo nghiem");
            }else
                System.out.println("PT co nghiem x = " + (-c/b));
        }else{
            double delta = b*b - 4*a*c;
            if(delta < 0)
                System.out.println("Pt vo nghiem");
            else if(delta == 0)
                System.out.println("Pt co nghiem kep x1=x2= " +(-b/(2*a)));
            else{
                double x1 = (-b+Math.sqrt(delta))/(2*a); 
                double x2 = (-b-Math.sqrt(delta))/(2*a);                 
                System.out.printf("Pt co 2 nghiem phan biet: \nx1 = %.1f\nx2 = %.1f", x1, x2);
            }
        }
        
    }
}
