/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1402;

import util.MyToys;

/**
 *
 * @author thehien
 */
public class SE1402 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("5! = " + MyToys.cF(5)); //120
            System.out.println("6! = " + MyToys.cF(6)); //720
            System.out.println("0! = " + MyToys.cF(1)); //1
            System.out.println("Exception: " + MyToys.cF(-5)); //exception
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
