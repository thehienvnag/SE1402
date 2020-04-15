/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author thehien
 */
public class MyToys {
    //cF: compute factorial, tinh n giai thua! = 1.2.3....N
    //0! = 1
    public static long cF(int n){
        if(n < 0 || n > 15)
            throw new IllegalArgumentException("Sorry, n must be >= 0");
        if(n == 0)
            return 1;
        //phan con lai la hop le
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
    //Moi doan code ban viet ra phai dam bao rang no co chat luong
    //Ham tra ve xu ly dung nhu ky vong
    //expected
    //Ta phai chuan bi bo du lieu de test tung ham, dam bao no xu ly dung
    //Ham xu ly dung, class xu ly dung
    //Dam bao cho tung class, module, tung don the, tung ham chay dung
    //Song song viec viet code
    //Qua trinh nay goi la Unit Testing
    //Lam sao test ham() chay dung ko
    //Chuan bi data -> dua data -> goi ham -> nhin ket qua -> so voi du kien
    //Nhin ket qua: mat
    //                  -> khop mong doi -> XANH
    //                  -> Khong khop -> DO
    //mat -> sout(), JOPtionPane, Popup, ghi LOG -> Xem va luan
    //mau -> JUnit, TestNG, xUnit, NUnit, CPPUnit, PHPUnit
    //      bo thu vien, .dll, .jar, giup chung ta luan theo mau
    
    //CODE KO BI LOI CU PHAP, THAM CHIEU THU VIEN, LUON CLEAN AND BUILD RA FILE JAR
    //BUILD JAR, .JAVA -> .CLASS, NEN .CLASS .CLASS -> .JAR
    //TIEM AN RUI RO LON, CODE SAI LOGIC, KO SAI CU PHAP
    //Neu Test sai -> eo cho ra .jar
    //Junit ket hop voi ant de app ko ra doi neu test sai
}
