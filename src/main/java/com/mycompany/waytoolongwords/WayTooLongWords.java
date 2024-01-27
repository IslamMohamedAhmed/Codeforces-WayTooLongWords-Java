/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.waytoolongwords;

/**
 *
 * @author Islam Mohamed
 */
import java.util.*;

public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        String[] str = new String[105];
        String[] str2 = new String[105];

        n = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            str[i] = scan.nextLine();
            char one, two;
            String three;

            if (str[i].length() > 10) {
                one = str[i].toCharArray()[0];
                two = str[i].toCharArray()[str[i].length() - 1];
                three = str[i].substring(1, str[i].length() - 1);
                str2[i] = one + "" + three.length() + "" + two;
            } else {
                str2[i] = str[i];
            }

        }
        for (int j = 1; j <= n; j++) {
            System.out.println(str2[j]);
        }

    }
}
