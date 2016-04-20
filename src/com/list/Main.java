package com.list;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Shadow on 2016/4/8.
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        Main main = new Main();
        for (int i = 0; i < t; i++) {
            String name = s.next();
            System.out.println(main.checkBea(name));
        }
        s.close();
    }

    public  int checkBea(String name){
        char[] n = name.toCharArray();
        for (int j = 0; j < name.length(); j++) {
            if(n[j]>='A'&&n[j]<='Z') {
                n[j] += 32;
            }
        }
        int[] bea = new int[26];
        int sum=0;
        for(int i=0;i < n.length;i++){
            bea[n[i] - 'a']++;
        }
        Arrays.sort(bea,0,bea.length);
        for (int i = bea.length-1; i >=0; i--) {
            sum += (i+1)*bea[i];
        }
        return sum;
    }
}
