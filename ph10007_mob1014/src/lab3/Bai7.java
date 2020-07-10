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
public class Bai7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Chuong trinh tim UCLN cua 2 so nguyen duong a, b:");
        System.out.print("Moi nhap a: ");
        int a = s.nextInt();
        System.out.print("Moi nhap b: ");
        int b = s.nextInt();
        
        int UCLN = 1;
        for( int i = 1; i <= (Math.max(a, b)) / 2 ; i++){
            if(a % i == 0 && b % i == 0)
                UCLN = i;
        }
        System.out.println("KET QUA:");
        System.out.printf("UCLN = %d\n", UCLN);
    }
}
