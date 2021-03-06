package com.json.departments;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonComparison {

    public void jsonComparison(String res1, String res2) {

            JSONObject obj1 = new JSONObject(res1);
            JSONObject obj2 = new JSONObject(res2);
            System.out.println("************* JSON Comparison ******************");
            try {

                if (obj1 instanceof JSONObject && obj2 instanceof JSONObject) {


                    //file-2
                    JSONArray arr2 = obj2.getJSONArray("departments");
                    for (int j = 0; j <= arr2.length() - 1; j++) {
                        JSONObject jsonObj2 = arr2.getJSONObject(j);

                        //file-1
                        JSONArray arr1 = obj1.getJSONArray("departments");
                        int i = 0;
                        for (i = 0; i <= arr1.length() - 1; i++) {
                            JSONObject jsonObj1 = arr1.getJSONObject(i);
                            if (jsonObj2.getString("shortDesc").equals(jsonObj1.getString("id"))){
                                System.out.println("Id : shortDesc : "+jsonObj2.getString("shortDesc")+ ", Names and Images are same in both files");
                            }
                        }
                        if(j>=i){
                            System.out.println("Id : shortDesc : "+jsonObj2.getString("shortDesc"));
                        }

                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
}
