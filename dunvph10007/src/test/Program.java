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

public class Program {

    public static void main(String[] args) {
        QuanLySinhVien ql = new QuanLySinhVien();
        Scanner s = new Scanner(System.in);
        int choose;
        ql.menu();
        do {
            System.out.print("Moi chon chuc nang: ");
            choose = Integer.parseInt(s.nextLine());
            switch (choose) {
                case 1: {
                    ql.NhapDS();
                    break;
                }
                case 2: {
                    ql.XuatDs();
                    break;
                }
                case 3: {
                    ql.timKiem();
                    break;
                }
                case 4: {
                    ql.Xoa();
                    break;
                }
                case 0: {
                    System.out.println("Thoat");
                    System.exit(0);
                }
                default: {
                    System.out.println("Moi ban chon dung chuc nang!");
                }
            }

        } while (choose != 0);

    }
}
