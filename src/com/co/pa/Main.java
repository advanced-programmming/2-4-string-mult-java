package com.co.pa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        int repeat = scanner.nextInt();
        System.out.println(multiString(value, repeat));
    }

    public static String multiString(String value, int repeat){
        StringBuilder result = new StringBuilder();
        if(repeat == 0 || value == "") return "";
        String newValue = repeat > 0 ? value : revertString(value);

        for(int i = 0; i < Math.abs(repeat); i++)
            result.append(newValue);


        return result.toString();
    }

    public static String revertString(String value){
        StringBuilder result = new StringBuilder();

        for(int i = value.length() - 1; i >= 0; i--) {
            result.append(value.charAt(i));
        }
        return result.toString();
    }


}
