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
import java.util.ArrayList;

public class qlsv {

    ArrayList<sinhVien> list = new ArrayList<sinhVien>();
    Scanner s = new Scanner(System.in);

    public void nhap() {
        System.out.print("Moi nhap so luong sinh vien: ");
        int n = Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++) {
            sinhVien sv = new sinhVien();
            System.out.printf("+.......Nhap sinh vien thu %d: ", i + 1);
            System.out.print("\nNhap ten: ");
            sv.ht = s.nextLine();
            sv.email = sv.ktEmail();
            sv.cmnd = sv.ktcmnd();
            sv.sdt = sv.ktsdt();
            list.add(sv);
        }
    }
    public void xuat() {
        System.out.printf("%-20s %-20s %-20s %-20s\n", "Ho ten", "So dien thoai", "Email", "CMND");
        for(sinhVien a: list){
            System.out.printf("%-20s %-20s %-20s %-20s\n", a.ht, a.sdt, a.email, a.cmnd);
        }
    }
}
