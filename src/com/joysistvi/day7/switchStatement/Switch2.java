package com.joysistvi.day7.switchStatement;

public class Switch2 {
    public static void main(String[] args) {
        String sizeCode = "C";
        String sizeDescription = "";

        switch (sizeCode) {
            case "XS":
                sizeDescription = "Extra Small";
                break;
            case "S":
                sizeDescription = "Small";
                break;
            case "M":
                sizeDescription = "Medium";
                break;
            case "L":
                sizeDescription = "Large";
                break;
            case "XL":
                sizeDescription = "Extra Large";
                break;
            case "XXL":
                sizeDescription = "Double Extra Large";
                break;
            default:
                sizeDescription = "Invalid size code: Pls Write XS, S, M, L, XL, XXL";
                break;
        }

        System.out.println("Size Code: " + sizeCode);
        System.out.println("Size Description: " + sizeDescription);

    }
}
