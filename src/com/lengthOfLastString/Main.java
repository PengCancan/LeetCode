package com.lengthOfLastString;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int i;
        // System.out.println("�������ַ�����");  
        Scanner scStr = new Scanner(System.in); //�Ӽ��̻�ȡ�ַ���
        String str = scStr.nextLine();          //��Scanner�����е��������ַ�������ʽȡ����
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