/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ht {

    public void menu() {
        System.out.println("1.Nhap danh sach ho ten");
        System.out.println("2.Xuat danh sach vua nhap");
        System.out.println("3.Xuat danh sach ngau nhien");
        System.out.println("4.Sap xep giam dan va xuat danh sach");
        System.out.println("5.Tim va xoa ten nhap tu ban phim");
        System.out.println("6.Ket thuc");
    }
    ArrayList<Danhsach> list = new ArrayList<Danhsach>();
    Scanner scan = new Scanner(System.in);
    int n;

    public void nhap() {

        System.out.print("Moi nhap so luong ho ten: ");
        n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("Moi nhap ho ten thu %d: ", i + 1);
            Danhsach ht1 = new Danhsach();
            ht1.hoten = scan.nextLine();
            list.add(ht1);
        }
    }

    public void xuat() {
        System.out.println("Ket qua danh sach vua nhap:");
        for (Danhsach x : list) {
            System.out.printf("%s\n", x.hoten);
        }
    }

    public void ngauNhien() {
        List relist = new ArrayList(list);
        Collections.shuffle(list);
        for (Danhsach x : list) {
            System.out.printf("%s\n", x.hoten);
        }
    }
    
    public void sapXep(){
        Comparator<Danhsach> comp = new Comparator<Danhsach>(){
            @Override
            public int compare(Danhsach t, Danhsach t1){
                return t.hoten.compareTo(t1.hoten);
            }
        };
        Collections.sort(list,comp);
        Collections.reverse(list);
        xuat();
    }
    
    public void xoa(){
        System.out.println("Nhap vao ho ten: ");
        String HT =scan.nextLine();
        System.out.printf("%-20s\n", "Ho ten");
        for(Danhsach b: list){
            if(b.hoten.equalsIgnoreCase(HT)){
                System.out.printf("%-20s\n", b.hoten);
                //list.removeAll(b);
                list.remove(b);
            }
        }
        xuat();
    }

}
