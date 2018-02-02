package com.company;

import java.awt.Color;

public class convert {
    public String conversion(String inp) {
        if (inp.length() != 6) {
            System.out.println("This is not a proper hexadecimal value");
            return "This is not a proper hexadecimal value";
        }

        int j = 0;
        int[] convertedValue = new int[6];
        String rgb="";

        for (int i = 0; i < 6; i++) {
            j = getValue(inp.charAt(i));

            if (j == -1) {
                return "This is not a proper hexadecimal value";
            }

            convertedValue[i] = j;
        }

        int red;
        int green;
        int blue;
        red = convertedValue[0] * 16 + (convertedValue[1]);
        green = convertedValue[2] * 16 + (convertedValue[3]);
        blue = convertedValue[4] * 16 + (convertedValue[5]);

        rgb = "RGB(" + red + "," + green + "," + blue + ")";

        return rgb;
    }

    private int getValue(Character character)
    {
        String letters = "ABCDEF";
        String input = Character.toString(character).toUpperCase();

        if (Character.isLetter(character)) {
            if (letters.contains(input)) {
                if (input.equals("A")) {
                    return 10;
                } else if (input.equals("B")) {
                    return 11;
                } else if (input.equals("C")) {
                    return 12;
                } else if (input.equals("D")) {
                    return 13;
                } else if (input.equals("E")) {
                    return 14;
                } else if (input.equals("F")) {
                    return 15;
                }
            }
            else
            {
                return -1;
            }

        }
        else
        {
            return Integer.valueOf(input);
        }
        return -1;
    }
}
