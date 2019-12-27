package com.example.lib;

public class MyClass {

    public static void main(String args[]){
        int temp=0;
        for(int i=0;i<=100;i+=2){
            temp=add3(i,temp);
        }
        System.out.println(temp);



    }
    static private int add3(int i,int sum){

        sum=sum+i;
        return sum;
    }
}