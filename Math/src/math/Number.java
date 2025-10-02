/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package math;

import java.util.Scanner;

/**
 *
 * @author abcxy
 */
public class Number {
    protected double A;
    protected double B;
    protected Operation op;
    public Number(double A, double B,Operation op) {
        this.A = A;
        this.B = B;
        this.op=op;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }
    public void nhapthongtin(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap gia tri A: ");
        A=sc.nextDouble();
        System.out.println("Nhap gia tri B: ");
        B=sc.nextDouble();
    }
   public double getResult() {
    if (op == Operation.CONG) {
        return A + B;
    }
    if (op == Operation.TRU) {
        return Math.abs(A - B);
    }
    if (op == Operation.NHAN) {
        return A * B;
    }
    if (op == Operation.CHIA) {
        if (B == 0) {
            throw new ArithmeticException("Loi chia cho 0");
        } else {
            return A / B;
        }
    }
    if (op == Operation.UCLN) {
        int a = (int) A;
        int b = (int) B;
        while (b != 0) {
            int temp = (int) B;
            b = (int) a % b;
            a = temp;
        }
        return a;
    }
    return 0; 
 }
}

    

