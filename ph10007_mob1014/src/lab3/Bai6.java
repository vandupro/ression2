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
public class Bai6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Moi nhap vao tong tien: ");
        int tongTien = s.nextInt();
        System.out.print("Moi nhap vao don gia: ");
        int donGia = s.nextInt();
        
        int soHang = 0, tienPhaiTra = 0;
        if (tongTien >= donGia){
            soHang = (int)(tongTien / donGia);
            tienPhaiTra = soHang * donGia;
        }else
            System.out.println("Khong mua duoc hang do khong du tien!");
        System.out.printf("So hang mua duoc la: %d\nSo tien phai tra la: %d\n", soHang, tienPhaiTra);
    }
}
