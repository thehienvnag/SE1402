/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static util.MyToys.cF;
/**
 *
 * @author thehien
 */
public class MyToyTest {
    public MyToyTest() {
        //
    }    
    
    @Test
    public void testSuccessfulGreater10Cases(){
        //actual + call method
        assertEquals(3_628_800, cF(10)); //xay ra 2 tinh huong:
                                    //xu ly sai
                                    //ki vong sai
                                    //co do, kiem tra code di
                                    //Ngoai le Exception la 1 thu ko phai value de uoc luong
                                    //Vay ko the assert duoc vi no can value de so sanh
                                    //Xai them 1 ky thuat bat ngoai le. Coi ngoai xay ra co giong nhu ky vong ko       
    }
    
    @Test
    public void testSuccessfulLower10Cases(){
        //actual + call method
        assertEquals(10, cF(0));
        assertEquals(2, cF(2));
        assertEquals(6, cF(3));
        assertEquals(24, cF(4));
        assertEquals(120, cF(5));
        assertEquals(720, cF(6));   //xay ra 2 tinh huong:
                                    //xu ly sai
                                    //ki vong sai
                                    //co do, kiem tra code di
                                    //Ngoai le Exception la 1 thu ko phai value de uoc luong
                                    //Vay ko the assert duoc vi no can value de so sanh
                                    //Xai them 1 ky thuat bat ngoai le. Coi ngoai xay ra co giong nhu ky vong ko       
    }
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionNegativeCases(){
        //ko co value de assert do ham cF() nem ra ngoai le
        cF(-5);
        cF(-100);
        cF(-1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionUpperBoundCases(){
        //ko co value de assert do ham cF() nem ra ngoai le
        cF(16);
        cF(100);
    }
}
