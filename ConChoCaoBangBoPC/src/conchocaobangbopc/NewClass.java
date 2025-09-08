/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conchocaobangbopc;

import java.util.Scanner;

/**
 *
 * @author AGuyJustWantToCode
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap dong m: ");
        int m = sc.nextInt();
        System.out.print("Nhap cot n: ");
        int n = sc.nextInt();

        int[][] a = new int[m][n];

        System.out.println("Nhap phan tu:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }

       
        System.out.println("Ma tran vua nhap:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        
        long tong = 0;
        long tich = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                tong += a[i][j];
                tich *= a[i][j];
            }
        }

        System.out.println("Tong cac phan tu = " + tong);
        System.out.println("Tich cac phan tu = " + tich);
    }
}
