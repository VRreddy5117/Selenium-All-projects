package com.readNcompare;


import org.json.JSONArray;

import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class Example1 {

    public static void main(String[] args) {

        JSONParser pp = new JSONParser();
        try {

            Object ob1 = pp.parse(new FileReader("src/test/java/com/readNcompare/Ecom.json"));
            Object obj2 = pp.parse(new FileReader("src/test/java/com/readNcompare/shopping.json"));

           org.json.simple. JSONArray ar = (org.json.simple.JSONArray) ob1;
            System.out.println("array in file is : " + ar);
            JSONArray ar1 = (JSONArray) obj2;
            System.out.println("array in file2 is :" +ar1);
            JSONArray arr1 = (JSONArray) ob1;
            System.out.println(arr1);
            JSONArray POJO2 = new JSONArray();
            JSONArray POJO1 = new JSONArray();
            System.out.println(POJO2);
            System.out.println(POJO1);

             } catch (Exception e) {
         e.printStackTrace();
        }
    }
}

   /* String jsonArrayString = "src/test/java/com/readNcompare/Ecom.json";
    JsonArray arrayFromString = JSONParser.parse(jsonArrayString).getAsJsonArray();
            System.out.println(arrayFromString.toString());*/