package com.example.assignment2java;
import java.util.*;
public class HelloApplicationModel {
    public static int points = 0;
    public static HashMap<String, Integer> points2 = new HashMap<>();
    public static HashMap<String, Integer> count2 = new HashMap<>();

    public static PriorityQueue<String> words = new PriorityQueue<>();
//
//    int A = 9, B = 2, C = 2, D = 4, E = 12, F = 2, G = 3, H = 2, I = 8, J = 1,
//            K = 1, L = 4, M = 2, N = 6, O = 8, P = 2, Q = 1, R = 6,
//            S = 4, T = 6, U = 4, V = 2, W = 2, X = 1, Y = 2, Z = 1;
    public static void InitializeCount() {
        count2.put("A", 9);
        count2.put("B", 2);
        count2.put("C", 2);
        count2.put("D", 4);
        count2.put("E", 12);
        count2.put("F", 2);
        count2.put("G", 3);
        count2.put("H", 2);
        count2.put("I", 8);
        count2.put("J", 1);
        count2.put("K", 1);
        count2.put("L", 4);
        count2.put("M", 2);
        count2.put("N", 6);
        count2.put("O", 8);
        count2.put("P", 2);
        count2.put("Q", 1);
        count2.put("R", 6);
        count2.put("S", 4);
        count2.put("T", 6);
        count2.put("U", 4);
        count2.put("V", 2);
        count2.put("W", 2);
        count2.put("X", 1);
        count2.put("Y", 2);
        count2.put("Z", 1);
    }
    public static HashMap getCountMap(){
        return count2;
    }
    public static void Counter(StringBuilder sb){
        String string = sb.toString().toUpperCase();
        for(int i=0; i< sb.length(); i++){
            char c = string.charAt(i);
            StringBuilder s = new StringBuilder();
            s.append(c);
            String t = s.toString();

            int value = count2.get(t);
            if(count2.containsKey(t)){
               count2.replace(t,value,value -1);
            }
            s.setLength(0);
        }
    }
    public static boolean getValid(StringBuilder sb){
        boolean valid = true;
        String s = sb.toString().toUpperCase();

        for (int i = 0; i < sb.length(); i++) {
            char c = s.charAt(i);
            StringBuilder b = new StringBuilder();
            b.append(c);
            String string = b.toString();
            if (HelloApplicationModel.count2.get(string) <= 0) {
                valid = false;
            }
        }
        return valid;
    }
    public static boolean getAllValues(HashMap count2){
        boolean allValues = true;
        int counter = 0;
        Collection al = count2.values();
        for(Object a: al){
            int b = (int) a;
            if(b == 0){
                counter++;
            }
        }
        if(counter >24) {
            allValues = false;
        }
        return allValues;
    }
    public static String getCounter(){
        return count2.toString();
    }
    public static String PointsValues(){
        points2.put("A",1);
        points2.put("B",3);
        points2.put("C",3);
        points2.put("D",2);
        points2.put("E",1);
        points2.put("F",4);
        points2.put("G",2);
        points2.put("H",4);
        points2.put("I",1);
        points2.put("J",8);
        points2.put("K",5);
        points2.put("L",1);
        points2.put("M",3);
        points2.put("N",1);
        points2.put("O",1);
        points2.put("P",3);
        points2.put("Q",10);
        points2.put("R",1);
        points2.put("S",1);
        points2.put("T",1);
        points2.put("U",1);
        points2.put("V",4);
        points2.put("W",4);
        points2.put("X",8);
        points2.put("Y",4);
        points2.put("Z",10);
        return points2.toString();
    }
    public static String Points(StringBuilder sb){
        String string = sb.toString().toUpperCase();
        String finalPoints = "";
        for(int i=0; i< sb.length(); i++){
            char c = string.charAt(i);
            StringBuilder q = new StringBuilder();
            q.append(c);
            String p = q.toString();

            if(points2.containsKey(p)){
                int pointsValue = points2.get(p);
                points = points + pointsValue;
                System.out.println(points);
                finalPoints = String.valueOf(points);
            }
            q.setLength(0);
        }
        return finalPoints;
    }
    public static String words(StringBuilder sb){
        words.add(String.valueOf(sb));
        return words.toString();
    }
    public static String getWords() {
        return words.toString().toUpperCase();
    }
}
