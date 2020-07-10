/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>();
        Scanner s= new Scanner(System.in);
        System.out.print("Moi nhap so luong so thuc: ");
        int n = s.nextInt();
        for(int i = 0; i < n; i++){
            System.out.printf("Moi nhap so thu %d: ", i+1);
            Double x = s.nextDouble();
            list.add(x);
        }
        double sum = 0;
//        for(int i = 0; i <= n; i++){
//            sum += list.get(i);
//        }
        System.out.print("Danh sach so thuc: ");
        for(int i = 0; i < n; i++){
            System.out.printf("%.0f\t", list.get(i));
            sum += list.get(i);
        }
        System.out.printf("\nTong la: %.0f\n", sum);
        
        
    }
}
