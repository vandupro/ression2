/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3 {
    public static void main(String[] args){
        qlsanpham ql = new qlsanpham ();
        int chon;
        while (true) {
            Scanner sc = new Scanner(System.in);
            ql.menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    System.out.println("-----Nhập danh sách sản phẩm-----");
                    ql.Y01();
                    break;
                case 2:
                    System.out.println("Sắp xếp sản phẩm theo giá");
                    ql.Y02();
                    break;
                case 3:
                    System.out.println("Tìm và xóa sản phẩm");
                    ql.Y03();
                    break;
                case 4:
                    System.out.println("Xuất giá trung bình của sản phẩm");
                    ql.Y04();
                    break;
                
                default:
                    System.out.println("Chọn lại các số từ 1-4");
                    break;
            }
        }
    }
}

   
    
    
