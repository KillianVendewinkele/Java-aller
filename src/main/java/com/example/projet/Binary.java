package com.example.projet;

import java.util.List;
import java.util.ArrayList;
public class Binary {
    public static List binary(int n, int n2, int n3) {
        List tab = new ArrayList();
        short ten = 0;

        //Recovery of the length of the number.
        while(n2 >= -1) {
            ten += 1;
            n2 = n2 / 10;
        }

        //Add in a list the binary number one digit by one digit.
        for(int count = 0; count < ten; count++) {
            while(n > 1) {
                n = n / 2;
            }
            if(n == 1) {
                tab.add(1);
            }
            else if(n == 0) {
                tab.add(0);
            }
            n = n3 / 2;
            n3 = n3 / 2;
        }
        return tab;
    }
}