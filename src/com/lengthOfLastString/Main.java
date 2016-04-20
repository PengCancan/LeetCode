package com.lengthOfLastString;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int i;
        // System.out.println("请输入字符串：");  
        Scanner scStr = new Scanner(System.in); //从键盘获取字符串
        String str = scStr.nextLine();          //将Scanner对象中的内容以字符串的形式取出来
        char arr[]=str.toCharArray();
        for( i=arr.length-1;i>=0;i--){
            if(arr[i]==' ')
                break;
        }
        int length=arr.length-i;
        System.out.println(length-1);
        char shuchu[]=new char[length-1]  ;int k=0;

        for(int j=i+1;j<=arr.length-1;j++){
            shuchu[k]=arr[j];    k++;
        }
        System.out.println(k);
    }
}