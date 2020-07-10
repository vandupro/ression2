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
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class qlsanpham {

    ArrayList<sanpham> a = new ArrayList<sanpham>();
    Scanner p = new Scanner(System.in);
    public static void menu() {
        System.out.println("+-----Menu-----+");
        System.out.println("1.Nhập danh sách sản phẩm");
        System.out.println("2.xuất ra sản phẩm theo giá giảm dần");
        System.out.println("3.Tìm và xóa sản phẩm theo tên");
        System.out.println("4.xuất giá trung bình sản phẩm");
        
        System.out.println("+--------------+");
        System.out.print("Chọn chương trình: ");
}


    public void Y01() {
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = Integer.parseInt(p.nextLine());
        for (int i = 0; i < n; i++) {
            sanpham sp = new sanpham();
            System.out.printf("-----Nhập thông tin sp: -----\n");
            System.out.print("Nhập tên: ");
            sp.tensp = p.nextLine();
            System.out.print("Nhập giá: ");
            sp.gia = Double.parseDouble(p.nextLine());
            a.add(sp);
        }

    }

    public void Y02() {
        Comparator<sanpham> comp = new Comparator<sanpham>() {
            @Override
            public int compare(sanpham o1, sanpham o2) {
                return o1.gia.compareTo(o2.gia);
            }
        };
        Collections.sort(a, comp);
        Collections.reverse(a);
        System.out.printf("%-20s %-10s\n", "Tên sp", "Giá sp");
        for (sanpham s : a) {
            System.out.printf("%-20s %-10.1f\n", s.tensp, s.gia);
        }
    }

    public void Y03() {
        System.out.println("Nhap vao ho ten: ");
        String HT =p.nextLine();
        System.out.printf("%-20s\n", "Ho ten");
        for(sanpham b: a){
            if(b.tensp.equalsIgnoreCase(HT)){
                System.out.printf("%-20s\n", b.tensp);
                //list.removeAll(b);
                a.remove(b);
            }
        }
        Y02();
    }

    public void Y04() {
        int tong = 0, giatb;
        for (int i = 0; i < a.size(); i++) {
            tong = (int) (tong + a.get(i).gia);
        }
        giatb = tong / a.size();
        System.out.println("gia trung binh cua cac sp la: " + giatb + " VND");
    }
}
