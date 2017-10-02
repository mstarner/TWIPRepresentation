package com.company;
import java.util.*;
//this project is impossible
public class Main {

    public static void main(String[] args) {
        Scanner prompt1 = new Scanner(System.in);
        System.out.println("Please type in a word. I will convert it into binary, octal, decimal, hexadecimal, and ASCII character codes.");
        String word = prompt1.nextLine();

        String hexadecimal, octal, binary;
        int decimal;
        double rando = Math.random();
        double rando2 = Math.random();

        char[] sortWord = word.toCharArray();


        int length = sortWord.length;

        int percent = (int)(length * rando2);

        int nextPos = percent;
        char nextVal = sortWord[nextPos];

        int correlation = (int)(rando * 5);

        for ( int charVal = percent; charVal < length; correlation++){
            if (correlation == 1) {
                int binVal = (int) nextVal;
                binary = Integer.toBinaryString(binVal);
                System.out.println(binary);
                charVal++;
                nextPos++;
            } else if (correlation == 2) {
                int octVal = (int) nextVal;
                octal = Integer.toOctalString(octVal);
                System.out.println(octal);
                charVal++;
                nextPos++;
            } else if (correlation == 3) {
                decimal = (int) nextVal;
                System.out.println(decimal);
                charVal++;
                nextPos++;
            } else if (correlation == 4) {
                decimal = (int) nextVal;
                System.out.println(decimal);
                charVal++;
                nextPos++;
            } else if (correlation == 5) {
                System.out.println(nextVal);
                charVal++;
                nextPos++;
            }
        }

    }
}
