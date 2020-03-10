package com.json.products;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonComparison1 {

    public void jsonComparison1(String res1, String res2) {

        JSONObject obj1 = new JSONObject(res1);
        JSONObject obj2 = new JSONObject(res2);
        System.out.println("************* JSON Comparison ******************");
        try {

            if (obj1 instanceof JSONObject && obj2 instanceof JSONObject) {


                //file-2
                JSONArray arr2 = obj2.getJSONArray("products");
                for (int j = 0; j <= arr2.length() - 1; j++) {
                    JSONObject jsonObj2 = arr2.getJSONObject(j);
                    JSONArray array = (JSONArray) arr2 ;

                    //file-1
                    JSONArray arr1 = obj1.getJSONArray("products");
                    int i = 0;
                    for (i = 0; i <= arr1.length() - 1; i++) {
                        JSONObject jsonObj1 = arr1.getJSONObject(i);
                        JSONArray jsonarray = arr1. getJSONArray(i);
                       /* if (jsonObj2.getString("aisleName").equals(jsonObj1.getString("aisleName"))){
                            System.out.println(" aisleName: aisleName : "+jsonObj2.getString("aisleName"));
                        }*/
                        if (jsonarray.getString(8).equals(jsonarray.getString(9))){
                            System.out.println("index 8: index 9 : " + jsonarray.get(9));
                        }
                    }
                    if(j>=i){
                        System.out.println("aisleName : aisleName  : "+jsonObj2.getString("aisleName"));
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            }
        }