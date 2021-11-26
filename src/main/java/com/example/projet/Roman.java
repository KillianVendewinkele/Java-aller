package com.example.projet;

import java.util.Arrays;
import java.util.List;

public class Roman {
    public static String RomanNumber(int n) {
        List T_unit = Arrays.asList(" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX");
        List T_diz = Arrays.asList(" ", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC");
        List T_cent = Arrays.asList(" ", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM");

        String our_int_in_str = String.valueOf(n);
        String our_int_in_str_reversed = "";
        String our_number_in_Romain_str = "";

        for (int count = 0; count < our_int_in_str.length(); count++) {
            our_int_in_str_reversed = our_int_in_str.substring(count, (count + 1)) + our_int_in_str_reversed;
        }
        if (our_int_in_str.length() > 3) {
            our_number_in_Romain_str = "ERROR too long";
        } else {
            if (our_int_in_str.length() >= 1) {
                our_number_in_Romain_str = T_unit.get(Integer.parseInt(our_int_in_str_reversed.substring(0, 1))) + our_number_in_Romain_str;
                if (our_int_in_str.length() >= 2) {
                    our_number_in_Romain_str = T_diz.get(Integer.parseInt(our_int_in_str_reversed.substring(1, 2))) + our_number_in_Romain_str;
                    if (our_int_in_str.length() >= 3) {
                        our_number_in_Romain_str = T_cent.get(Integer.parseInt(our_int_in_str_reversed.substring(2, 3))) + our_number_in_Romain_str;
                    }

                }
            }
        }
        return our_number_in_Romain_str;
    }
}