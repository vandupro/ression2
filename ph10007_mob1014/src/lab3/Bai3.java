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
import java.util.Arrays;
public class Bai3 {
    public static void main(String[] args) {
       System.out.print("Moi nhap so phan tu cua mang: ");
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int arr[] = new int[n];
       int i;
       for( i = 0; i < n; i++){
           System.out.printf("Moi nhap phan tu thu arr[%d]: ", i);
            arr[i] = scan.nextInt();
       }
       System.out.println("...............");
       Arrays.sort(arr);
           System.out.print("Mang sau sap xep:  "+ Arrays.toString(arr));
        int min = arr[0]; 
        double tb =0;
        int count = 1, s = 0;
        for(  i =0; i < n; i++){
             if(min > arr[i])
                min = arr[i];
             if(arr[i] % 3 ==0){
                count++;
                s += arr[i];
             }
         }
           System.out.printf("\nPhan tu nho nhat la: %d\n", min);
           System.out.printf("Trung binh cong cac phan tu chia het cho 3 la: %d\n", s/count);
    }
}
