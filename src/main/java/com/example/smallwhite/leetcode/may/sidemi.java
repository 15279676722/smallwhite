package com.example.smallwhite.leetcode.may;/** * 101 * @author: yangqiang * @create: 2021-05-31 17:58 */public class sidemi {    public static void main(String[] args) {        System.out.println(isPowerOfFour(2));    }    public static boolean isPowerOfFour(int num) {        if (num <= 0) {            return false;        }        while (num >0 ){            for (int i = 0; i < 2; i++) {                if (num % 2 == 1 && num / 2 == 0 && i == 0) {                    return true;                }                if(num%2 == 1){                    if( num/2 !=0){                        return false;                    }                    if(i != 0 ){                        return false;                    }                }                num = num >> 1;            }        }        return true;    }}