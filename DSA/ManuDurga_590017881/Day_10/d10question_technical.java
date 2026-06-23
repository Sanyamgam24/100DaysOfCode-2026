package Day_10;

import java.util.Scanner;

public class d10question_technical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();          // size of the input array
        boolean[] seen = new boolean[26];
        int count = 0;

        for (char c : s.toCharArray()) {
            int index = c - 'a';
            if (!seen[index]) {
                seen[index] = true;
                count++;}}
        if(count%2==0){System.out.println("CHAT WITH HER! ");}
        else{System.out.println("IGNORE HIM!");}
            }}