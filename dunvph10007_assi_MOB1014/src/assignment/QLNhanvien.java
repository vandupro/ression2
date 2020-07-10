/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QLNhanvien {

    Scanner s = new Scanner(System.in);
    ArrayList<NhanVien> list = new ArrayList<NhanVien>();
    int n;

    public void menu() {
        System.out.println("+................MENU..............+");
        System.out.println("1.Nhap danh sach nhan vien");
        System.out.println("2.Xuat danh sach nhan vien");
        System.out.println("3.Tim kiem nhan vien theo ma nhan vien");
        System.out.println("4.Xoa nhan vien theo ma nhap vao");
        System.out.println("5.Tim kiem hoc vien theo ma so va cap nhat");
        System.out.println("6.Tim nhan vien theo khoang luong");
        System.out.println("7.Sap xep nhan vien theo ho ten");
        System.out.println("8.Sap xep nhan vien theo thu nhap");
        System.out.println("9.Xuat 5 nhan vien co thu nhap cao nhat");
        System.out.println("0.Thoat");
        System.out.println("+................MENU..............+");
    }

    public void Y01() {
        System.out.println("1_Hanh chinh, 2_Tiep thi, 3_Truong phong");
        System.out.print("Moi chon loai nhan vien: ");
        int choose = Integer.parseInt(s.nextLine());

        System.out.print("Moi nhap so luong nhan vien: ");
        n = Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++) {
            if (choose == 1) {
                NhanVien x = new NhanVien();
                System.out.printf("Nhan vien thu %d:", i + 1);
                x.nhap();
                list.add(x);
            } else if (choose == 2) {
                NhanVien x = new TiepThi();
                System.out.printf("Nhan vien thu %d:", i + 1);
                x.nhap();
                list.add(x);
            } else if (choose == 3) {
                NhanVien x = new TruongPhong();
                System.out.printf("Nhan vien thu %d:", i + 1);
                x.nhap();
                list.add(x);
            }
        }
    }

    public void Y02() {
        System.out.println("Danh sach nhan vien: ");
        System.out.printf("%-20s %-20s %-20s %-20s\n", "Ma nhan vien", "Ho ten", "Thu nhap", "Thue thu nhap");
        for (NhanVien a : list) {
            a.xuat();
        }
    }

    public void Y03() {
        System.out.println("Moi nhap vao ma nhan vien: ");
        String m = s.nextLine();
        int count = 0;
        for (NhanVien a : list) {
            if (a.manv.equalsIgnoreCase(m)) {
                count++;
                a.xuat();
            }
        }
        if (count == 0) {
            System.out.println("Ma ban nhap khong trung voi nhan vien nao!");
        }
    }

    public void Y04() {
        System.out.print("Nhập vào mã nhân viên: ");

        String m = s.nextLine();
        

//        for (NhanVien s : list) {
//
//            if (s.manv.equalsIgnoreCase(m)) {
//
//                list.remove(s);
//
//            }
           for( int i = 0; i < list.size(); i++){
               if(list.get(i).manv.equals(m)){
                   list.remove(list.get(i));
               }
           }

        
        System.out.println("Danh sách sau khi xóa: ");
        System.out.printf("%-20s %-20s %-20s %-20s\n", "Họ tên", "Mã NV", "Thu nhap", "Thue thu nhap");
        for (NhanVien a : list) {
            System.out.printf("%-20s %-20s %-20.0f %-20.0f\n", a.manv, a.hoTen, a.getTn(), a.getthueTn());
        }

    }

    public void Y05() {
        System.out.println("Moi nhap ma nhan vien: ");
        String m = s.nextLine();
        for (NhanVien a : list) {
            if (a.manv.equalsIgnoreCase(m)) {
                a.nhap();
                System.out.println("+........Thong tin sau cap nhat..........+");
                System.out.printf("%-20s %-20s %-20s %-20s\n", "Ma nhan vien", "Ho ten", "Thu nhap", "Thue thu nhap");
                a.xuat();
            }
        }
    }

    public void Y06() {
        System.out.print("Moi nhap vao khoang luong min: ");
        double min = Double.parseDouble(s.nextLine());
        System.out.print("Moi nhap vao khoang luong max: ");
        double max = Double.parseDouble(s.nextLine());
        System.out.printf("%-20s %-20s %-20s %-20s\n", "Ma nhan vien", "Ho ten", "Thu nhap", "Thue thu nhap");
        for (NhanVien a : list) {
            if (a.luong >= min && a.luong <= max) {
                a.xuat();
            }
        }
    }

    public void Y07() {
        Comparator<NhanVien> nv = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien a, NhanVien b) {
                return a.hoTen.compareTo(b.hoTen);
            }
        };
        Collections.sort(list, nv);
        Y02();
    }

    public void Y08() {
        Comparator<NhanVien> nv = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien a, NhanVien b) {
                Double x = new Double(a.getTn());
                Double y = new Double(b.getTn());
                return x.compareTo(y);
            }
        };
        Collections.sort(list, nv);
        Y02();
    }

    public void Y09() {
        Collections.reverse(list);
        System.out.printf("%-20s %-20s %-20s %-20s\n", "Ma nhan vien", "Ho ten", "Thu nhap", "Thue thu nhap");
        if (list.size() < 5) {
            for (NhanVien a : list) {
                a.xuat();
            }
        } else {
            for (int i = 0; i < 5; i++) {
                list.get(i).xuat();
            }
        }
    }
}
