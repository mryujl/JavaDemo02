package com.mryujl.java;

/**
 * @author mryujl
 * @date 2019-04-30 15:12
 */
public class TestException {
    public static void main(String[] args){
        int i = 0;
        try{
            int j = 10/i;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println();
        }
    }
}
