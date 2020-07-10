/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class SanPham {
    String ten;
    double donGia;
    String hang;
    
   public void nhap(){
       Scanner s = new Scanner(System.in);
       System.out.print("Moi nhap vao ten san pham: ");
       ten = s.nextLine();
       System.out.print("Moi nhap vao don gia: ");
       donGia = Double.parseDouble(s.nextLine());
       System.out.print("Moi nhap vao hang: ");
       hang = s.nextLine();
   } 
    
    public void xuat(){
        System.out.printf("%-20s %-20s %-20s\n", ten, donGia, hang);
    }
}
