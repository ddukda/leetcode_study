package com.test.study_leetcode.palindrome;

import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {
    @Test
    void test() {
        isPalindrome(10);
    }

    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        int _x = x;
        int res = 0;
        int length = String.valueOf(x).length();
        for(int i=0; i<length; i++) {
            res = res*10 + _x%10;
            _x = _x/10;
        }
        return x == res;
    }
}
