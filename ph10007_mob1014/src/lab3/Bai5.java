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
public class Bai5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Moi nhap vao so nguyen n:");
        int n = s.nextInt();
        
        int S1 = 0, S2 = 0, S3 = 0;
        for(int i = 1; i <= n; i++){
            S1 += i;
            double a = Math.pow(-1, i) * i;
            S2 += a;
        }
        System.out.printf("S1 = %d\nS2 = %d\nS3 = %d\n", S1, S2, S3 = 2*S1);
    }
}
