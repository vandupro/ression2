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
public class Bai4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Moi nhap so luong sinh vien: ");
        int n = Integer.parseInt(scan.nextLine());
        String[] a = new String[n];
        String hl[] = new String[n];
        int[] p = new int[n];
        for(int i = 0; i < a.length; i++){
            System.out.printf("Moi nhap ho ten sinh vien thu %d: ", i + 1);            
            a[i] = scan.nextLine();
            //scan.nextLine();//dùng để tránh lỗi nhảy
            System.out.printf("Diem sinh vien thu %d: ", i+1);
            p[i] = Integer.parseInt(scan.nextLine());
        }
        
        //Sap xep sinh vien theo diem tang dan
        for(int i = 0; i < a.length -1; i++){
            for(int j = i + 1; j < a.length; j++){
                if(p[i] > p[j]){
                    int temp1 = p[i];
                    String temp2 = a[i];
                    p[i] = p[j];
                    p[j] = temp1;
                    a[i] = a[j];
                    a[j] = temp2;
                }
            }
        }
        //Xep loai
        for(int i = 0; i < a.length; i++){
            if(p[i] < 5)
                hl[i] = "Yeu";
            else if(5 <= p[i] && p[i] <6.5)
                hl[i] = "Trung binh";
            else if(6.5 <= p[i] && p[i] <7.5 )
                hl[i] = "Kha";
            else if(7.5 <= p[i] && p[i] <9)
                hl[i] = "Gioi";
            else
                hl[i] = "Xuat sac";
        }
        //In ket qua
        System.out.println("KET QUA:");
        String name = "Ho ten", diem = "Diem", hocLuc = "Hoc luc";
        System.out.printf("%-10s%-10s%-10s\n", name, diem, hocLuc);
        for( int i = 0; i < a.length; i++){
            System.out.printf("%-10s%-10s%-10s\n", a[i], p[i], hl[i]);
        }
    }
}

