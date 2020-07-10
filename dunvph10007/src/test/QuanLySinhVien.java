/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.ArrayList;

public class QuanLySinhVien {

    ArrayList<SinhVien> list = new ArrayList<SinhVien>();
    Scanner s = new Scanner(System.in);

    public void TongDiem() {
        for (SinhVien a : list) {
            a.getTongDiem();
        }

    }

    public void XepLoai() {

    }

    public void NhapDS() {
        
        System.out.print("Moi chon doi tuong: 1_SV binh thuong , 2_SV nuoc ngoai: ");
        int b = Integer.parseInt(s.nextLine());
        System.out.print("Moi nhap so luong: ");
        int n = Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++) {
            if (b == 1) {
                SinhVien sv = new SinhVien();
                System.out.printf("Sinh vien thu %d: \n", i + 1);
                sv.nhap();
                list.add(sv);

            }
            if (b == 2) {
                SinhVien sv = new SinhVienNuocNgoai();
                System.out.printf("Sinh vien thu %d: \n", i + 1);
                sv.nhap();
                list.add(sv);
            }
        }
    }

    public void XuatDs() {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Ma sinh vien", "HO ten", "diem toan", "diem van", "tong diem", "xep loai");
        for (SinhVien x : list) {
            x.xuat();
        }
    }

    public void timKiem() {
        System.out.print("Moi nhap diem min: ");
        double min = Double.parseDouble(s.nextLine());
        System.out.print("Moi nhap diem max: ");
        double max = Double.parseDouble(s.nextLine());
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Ma sinh vien", "HO ten", "diem toan", "diem van", "tong diem", "xep loai");
        for (SinhVien a : list) {
            if (a.diemToan > min && a.diemToan < max) {
                a.xuat();
            }
        }
    }

    public void Xoa() {
        System.out.print("Nhập vào mã nhân viên: ");

        String m = s.nextLine();

        for (SinhVien s : list) {

            if (s.maSV.equalsIgnoreCase(m)) {

                list.remove(s);

            }
        }
        System.out.println("Danh sach sau xoa:");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Ma sinh vien", "HO ten", "diem toan", "diem van", "tong diem", "xep loai");
        for (SinhVien x : list) {
            x.xuat();
        }
    }

    public void menu() {
        System.out.println("1.Nhap danh sach sinh vien");
        System.out.println("2.Xuat danh sach sinh vien");
        System.out.println("3.Tim kiem sinh vien theo khoang diem");
        System.out.println("4.Xoa nhan vien theo ma nhap vao");
        System.out.println("0.Thoat");
    }
}
