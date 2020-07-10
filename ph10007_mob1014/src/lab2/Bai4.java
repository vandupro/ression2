/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Bai4 {
   

    public static void main(String[] args) {
        Scanner can = new Scanner(System.in);
        System.out.println("+.........MENU..........+");
        System.out.println("1.Giai phuong trinh bac nhat");
        System.out.println("2.Giai phuong trinh bac hai");
        System.out.println("3.Tinh tien dien");
        System.out.println("4.Ket thuc");
        System.out.println("+.......................+");
        int choose;
        do {
            System.out.print("\nMoi nhap chuc nang: ");
            choose = can.nextInt();

            switch (choose) {
                case 1: {
                    Bai1.main(args);
                    break;
                }
                case 2: {
                    Bai2.main(args);
                    break;
                }
                case 3: {
                    Bai3.main(args);
                    break;
                }
                case 4: {
                    System.out.println("Ban da thoat khoi chuong trinh");

                    break;
                }
            }

        } while (choose != 4);
    }
}
