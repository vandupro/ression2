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

public class Program {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choose, x;
        qlsv ql = new qlsv();
        ql.menu();
        System.out.print("Mo chon doi tuong (1_sinhvienit), (2_sinhvienbiz): ");
        x = Integer.parseInt(s.nextLine());
        do {

            System.out.print("Moi chon chuc nang: ");
            choose = Integer.parseInt(s.nextLine());
            switch (choose) {
                case 1: {
                    if (x == 1) {
                        ql.nhapIt();
                    }
                    if (x == 2) {
                        ql.nhapBiz();
                    }
                    break;
                }
                case 2: {
                    if (x == 1) {
                        ql.xuatIt();
                    }
                    if (x == 2) {
                        ql.xuatBiz();
                    }
//                        ql.xuattt();
                    break;
                }
                case 3: {
                    if (x == 1) {
                        ql.gioiIt();
                    }
                    if (x == 2) {
                        ql.gioiBiz();
                    }
//                        ql.gioi();
                    break;
                }
                case 4: {
                    if (x == 1) {
                        ql.sxIt();
                    }
                    if (x == 2) {
                        ql.sxBiz();
                    }
                    break;
                }
                case 5: {
                    System.out.println("Ket thuc chuong trinh!");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Moi ban chon dung chuc nang!");
                    break;
                }
            }
        } while (choose != 5);
    }
}
