package com.json.products;

import com.json.departments.Departments;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MissingData {

    public void getStringRes(String res1, String res2) {
        JSONObject obj1 = new JSONObject(res1);
        JSONObject obj2 = new JSONObject(res2);

        try {

            if (obj1 instanceof JSONObject && obj2 instanceof JSONObject) {

                //file-1
                JSONArray arr1 = obj1.getJSONArray("products");
                List list1 = new ArrayList();
                List<ProductInfo> dept_1 = new ArrayList<>();
                for (int i = 0; i <= arr1.length() - 1; i++) {
                    JSONObject jsonObj1 = arr1.getJSONObject(i);
                    list1.add(jsonObj1.getString("id"));
                    String id = (String) jsonObj1.getString("id");
                    String name = (String) jsonObj1.getString("name");
                    String img = (String) jsonObj1.getString("image");
                    String message = (String) jsonObj1.getString("message");
                    double price = (double) jsonObj1.getDouble("price");
                    double basePrice = (double) jsonObj1.getDouble("basePrice");
                    String promoEndDate = (String) jsonObj1.getString("promoEndDate");

                    dept_1.add(new ProductInfo(id, name, img, price, basePrice));

                    System.out.println(dept_1);
                }
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}