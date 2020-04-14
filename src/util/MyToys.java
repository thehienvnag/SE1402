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
}
