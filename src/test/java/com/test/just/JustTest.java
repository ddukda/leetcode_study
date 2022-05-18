package com.test.just;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;

public class JustTest {
    @Test
    void test1() {
        int[] arr1 = new int[]{1, 2};
        int[] arr2 = new int[]{2, 1};
        System.out.println(arr1.equals(arr2));
        System.out.println(arr1 == arr2);

    }

    @Test
    void wow() {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {

        if(x < 0) return false;
        String strX = String.valueOf(x);
        int length = strX.length();
        if(length == 1) return true;
        for(int i=0; i<length; i++) {
            System.out.println(i + "  " + strX.substring(i, i+1) + "  " + strX.substring(length-i-1, length-i));
            if(!strX.substring(i, i+1).equals(strX.substring(length-i-1, length-i))) {
                return false;
            }
        }
        return true;
    }
}
