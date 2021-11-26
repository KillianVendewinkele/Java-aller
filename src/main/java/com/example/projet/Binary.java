package com.example.projet;

import java.util.List;
import java.util.ArrayList;
public class Binary {
    public static String binaryNum(int n){
        String our_number_in_binary_str = "";
        //Add in a string the binary number one digit by one digit.
        while( n > 0){
            int r = n % 2;
            our_number_in_binary_str = String.valueOf(r) + our_number_in_binary_str ;
            n = (n-r)/2;

        }
        return our_number_in_binary_str;
    }
}