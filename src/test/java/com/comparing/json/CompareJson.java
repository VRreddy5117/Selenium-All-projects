package com.comparing.json;

import com.google.gson.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class CompareJson {
    public static void main(String[] args) throws FileNotFoundException {
     int i = 18;
        JsonElement ele1 = new JsonParser().parse(new FileReader("src/test/java/com/comparing/json/shopping.json"));
        JsonObject object = ele1.getAsJsonObject().get("shopping_list").getAsJsonObject();

        Gson gson = new Gson();
        for (Map.Entry<String, JsonElement> entry : object.entrySet()) {
            ShoppingList shoppingList = gson.fromJson(entry.getValue(), ShoppingList.class);
            System.out.println(shoppingList.getLabel());
        }



    }
}


 /*   JSONParser parser = new JSONParser();
        try {
                Object comp1 = parser.parse(new FileReader("src/test/java/com/comparing/json/First.json"));
                Object comp2 = parser.parse(new FileReader("src/test/java/com/comparing/json/Second.json"));

                Gson g = new Gson();
                Type mapType = new TypeToken<Map<String, Object>>(){}.getType();
        Map<String, Object> firstMap = g.fromJson((JsonElement) comp1, mapType);
        Map<String, Object> secondMap = g.fromJson((JsonElement) comp2, mapType);
        System.out.println(Maps.difference(firstMap, secondMap));

        Map<Object, Object> mrng = g.fromJson((JsonElement) comp1,mapType);
        System.out.println(Maps.difference(firstMap,secondMap));
        } catch (Exception e) {
        e.printStackTrace();
        }*/