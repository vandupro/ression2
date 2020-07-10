/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmetn_final;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLy {

    ArrayList<NhanVien> list = new ArrayList<NhanVien>();
    Scanner s = new Scanner(System.in);

    public void menu() {
        System.out.println("...........MENU.............");
        System.out.println("1.Nhap danh sach nhan vien");
        System.out.println("2.Xuat danh sach nhan vien");
        System.out.println("3.Tim va hien thi nhan vien theo ma nhap vao");
        System.out.println("4.Xoa nhan vien theo ma nhap vao");
        System.out.println("5.Cap nhat thong tin nhan vien theo ma nhap vao");
        System.out.println("6.Tim cac nhan vien theo khoang luong");
        System.out.println("7.Sap xep nhan vien theo ho ten");
        System.out.println("8.Sap xep nhan vien theo thu nhap");
        System.out.println("9.Xuat 5 nhan vien co thu nhap cao nhat");
        System.out.println("............................");

    }

    public void Y01() {

        int choose, soLuong;
        System.out.println("1-Hanh chinh, 2-Tiep thi, 3-Truong phong");
        System.out.print("Moi chon loai nhan vien: ");
        choose = Integer.parseInt(s.nextLine());
        System.out.print("Moi chon so luong: ");
        soLuong = Integer.parseInt(s.nextLine());
        for (int i = 0; i < soLuong; i++) {
            if (choose == 1) {
                NhanVien a = new NhanVien();
                System.out.printf("-Nhan vien thu %d: \n", i + 1);
                a.nhap();
                list.add(a);
            } else if (choose == 2) {
                NhanVien a = new TiepThi();
                System.out.printf("-Nhan vien thu %d: \n", i + 1);
                a.nhap();
                list.add(a);
            } else if (choose == 3) {
                NhanVien a = new TruongPhong();
                System.out.printf("-Nhan vien thu %d: \n", i + 1);
                a.nhap();
                list.add(a);
            }
        }
    }

    public void Y02() {
        System.out.printf("%-15s %-15s %-15s %-15s %-15s \n", "Ma nhan vien", "Ho ten", "Luong", "Thue thu nhap", "Thu nhap");
        for (NhanVien a : list) {
            a.xuat();
        }
    }

    public void Y03() {
        System.out.print("Moi nhap vao ma: ");
        String code = s.nextLine();
        int count = 0;
        System.out.println("KET QUA:");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s \n", "Ma nhan vien", "Ho ten", "Luong", "Thue thu nhap", "Thu nhap");
        for (NhanVien a : list) {
            if (a.getManv().equalsIgnoreCase(code)) {
                a.xuat();
                count = 1;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Khong tim thay nhan vien nao!");
        }
    }

    public void Y04() {
       System.out.print("Moi nhap vao ma nhan vien: ");
       String code = s.nextLine();
       int count;
       for(int i = 0; i < list.size(); i++){
           if(list.get(i).getManv().equalsIgnoreCase(code)){
               list.remove(list.get(i));
               count = 1;
               break;
           }
       }
    }

    public void Y05() {
        System.out.print("Moi nhap vao ma: ");
        String code = s.nextLine();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getManv().equalsIgnoreCase(code)) {
                list.get(i).nhap();
                count = 1;
            }
        }
        System.out.println("KET QUA: ");
        if (count == 0) {
            System.out.println("Khong co ma nhan vien nao trung hop!");
        } else {
            Y02();
        }
    }

    public void Y06() {
        int acount = 0;
        System.out.print("Nhap khoang luong Min: ");
        double min = Double.parseDouble(s.nextLine());
        System.out.print("Nhap khoang luong Max: ");
        double max = Double.parseDouble(s.nextLine());
        System.out.println("Ket qua: ");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s \n", "Ma nhan vien", "Ho ten", "Luong", "Thue thu nhap", "Thu nhap");
        for (NhanVien a : list) {
            if (a.getLuong() > min && a.getLuong() < max) {
                a.xuat();
            }
            acount = 1;
        }
        if (acount == 0) {
            System.out.println("Khong co nhan vien nao phu hop!");
        }
    }

    public void Y07() {
        Comparator<NhanVien> nv = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien a, NhanVien b) {
                return a.getHoTen().compareTo(b.getHoTen());
            }
        };
        Collections.sort(list, nv);
        Y02();
    }

    public void Y08() {
        Comparator<NhanVien> nv = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien a, NhanVien b) {
                Double x = new Double(a.getThuNhap()); // chuyển a.getThuNhap() thành Double (kiểu đối tượng)
                Double y = new Double(b.getThuNhap()); //thì mới so sánh được
                return x.compareTo(y);
            }
        };
        Collections.sort(list, nv);
        Y02();
    }

    public void Y09() {
        Collections.reverse(list);
        System.out.println("KET QUA: ");
        if (list.size() < 5) {
            Y02();
        } else {
            System.out.printf("%-15s %-15s %-15s %-15s %-15s \n", "Ma nhan vien", "Ho ten", "Luong", "Thue thu nhap", "Thu nhap");
            for (int i = 0; i < 5; i++) {
                list.get(i).xuat();
            }
        }
    }
}
