package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Input your color's hexadecimal value without #");
        Scanner kb = new Scanner(System.in);
        String input = kb.next();
        String rgb;
        convert test = new convert();
        rgb = test.conversion(input);
        System.out.println(rgb);
    }
}
