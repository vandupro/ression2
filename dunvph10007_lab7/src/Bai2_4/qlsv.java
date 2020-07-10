/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2_4;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class qlsv {

    Scanner s = new Scanner(System.in);
    ArrayList<SinhVienIt> list1 = new ArrayList<SinhVienIt>();
    ArrayList<SinhVienBiz> list2 = new ArrayList<SinhVienBiz>();

    public void nhapIt() {
        System.out.print("Moi nhap so luong sinh vien: ");
        int n = Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("Sinh vien thu %d:\n", i + 1);
            System.out.print("Ho ten: ");
            String ht = s.nextLine();
            System.out.print("diem java: ");
            double j = Double.parseDouble(s.nextLine());
            System.out.print("diem html: ");
            double h = Double.parseDouble(s.nextLine());
            System.out.print("diem css: ");
            double c = Double.parseDouble(s.nextLine());
            SinhVienIt sv = new SinhVienIt(j, h, c, ht);
            list1.add(sv);
        }
    }

    public void xuatIt() {
        System.out.printf("%-20s %-20s %-20s %-20s\n", "Ho ten", "Nganh", "Diem", "Hoc luc");
        for (SinhVienIt a : list1) {
            a.xuat();
        }
    }

    public void nhapBiz() {
        System.out.print("Moi nhap so luong sinh vien: ");
        int n = Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("Sinh vien thu %d:\n", i + 1);
            System.out.print("Ho ten: ");
            String ht = s.nextLine();
            System.out.print("diem marketing: ");
            double m = Double.parseDouble(s.nextLine());
            System.out.print("diem sale: ");
            double sa = Double.parseDouble(s.nextLine());
            SinhVienBiz sv = new SinhVienBiz(m, sa, ht);
            list2.add(sv);
        }
    }

    public void xuatBiz() {
        System.out.printf("%-20s %-20s %-20s %-20s\n", "Ho ten", "Nganh", "Diem", "Hoc luc");
        for (SinhVienBiz b : list2) {
            b.xuat();
        }
    }

    public void gioiIt() {
        for (SinhVien a : list1) {
            if (a.getHocLuc() == "Gioi") {
                a.xuat();
            }
        }
    }

    public void gioiBiz() {
        for (SinhVien a : list2) {
            if (a.getHocLuc() == "Gioi") {
                a.xuat();
            }
        }
    }

    public void menu() {
        System.out.println("+............MENU.............+");
        System.out.println("1.Nhap thong tin sinh vien");
        System.out.println("2.Xuat thong tin sinh vien");
        System.out.println("3.Xuat danh sach sinh vien co hoc luc gioi");
        System.out.println("4.Sap xep danh sach sinh vien theo diem");
        System.out.println("5.Ket thuc");
        System.out.println("+............................+");
    }

    public void sxIt() {
        Comparator<SinhVienIt> comp = new Comparator<SinhVienIt>() {
            @Override
            public int compare(SinhVienIt a, SinhVienIt b) {
                Double x = new Double(a.getDiem());
                Double y = new Double(b.getDiem());
                return x.compareTo(y);
            }
        };
        Collections.sort(list1, comp);
        this.xuatIt();
    }
    
    public void sxBiz() {
        Comparator<SinhVienBiz> comp = new Comparator<SinhVienBiz>() {
            @Override
            public int compare(SinhVienBiz a, SinhVienBiz b) {
                Double x = new Double(a.getDiem());
                Double y = new Double(b.getDiem());
                return x.compareTo(y);
            }
        };
        Collections.sort(list2, comp);
        this.xuatBiz();
    }

}
