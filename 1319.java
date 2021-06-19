package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader inObj = new BufferedReader(new InputStreamReader(System.in));
        String fileName = inObj.readLine();

        BufferedWriter outObj = new BufferedWriter(new FileWriter(fileName));

        String writingString = "";

        while (!writingString.equals("exit")) {
            writingString = inObj.readLine();
            outObj.write(writingString);
            if (!writingString.equals("exit")) outObj.write("\n");
        }

        outObj.close();
        inObj.close();
    }
}
