package com.javarush.task.task14.task1409;

/* 
Мосты
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    static public void println(Bridge bridge)
    {
        System.out.println(bridge.getCarsCount());
    }
}

