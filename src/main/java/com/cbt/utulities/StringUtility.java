package com.cbt.utulities;

public class StringUtility {
    public static void verifyEquals(String expected,String actual){
        if(expected.equalsIgnoreCase(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
        }
    }
}
