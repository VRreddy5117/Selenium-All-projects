package com.json.products;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonComparison1 {

    public void jsonComparison1(String res1, String res2) {

        JSONObject obj1 = new JSONObject(res1);

        JSONObject productObj = new JSONObject(res2);
        JSONObject jsonObj = new JSONObject();
        JSONArray productArr = productObj.getJSONArray("products");


        JSONArray responseArr = new JSONArray();

        for (int j = 0; j <= productArr.length() - 1; j++) {
            JSONObject depObj = productArr.getJSONObject(j);

            jsonObj.put("id", depObj.getString("id"));


            JSONObject department = depObj.getJSONObject("department");
            if(department instanceof JSONObject){
                jsonObj.put("departmentId", department.getString("id"));
                jsonObj.put("departmentName", department.getString("name"));
                jsonObj.put("departmentShortDesc", department.getString("shortDesc"));
                jsonObj.put("departmentImage", department.getString("image"));

            }
            JSONObject shelf = depObj.getJSONObject("shelf");
            if(shelf instanceof JSONObject){
                jsonObj.put("shelfShortDesc", shelf.getString("shortDesc"));
                jsonObj.put("shelfName", shelf.getString("name"));
                jsonObj.put("shelfImage", shelf.getString("image"));
                jsonObj.put("shelfId", shelf.getString("id"));
            }

            JSONObject aisle = depObj.getJSONObject("aisle");
            if(aisle instanceof JSONObject){
                jsonObj.put("aisleShortDesc", aisle.getString("shortDesc"));
                jsonObj.put("aisleName", aisle.getString("name"));
                jsonObj.put("aisleImage", aisle.getString("image"));
                jsonObj.put("aisleid", aisle.getString("id"));
            }
            JSONObject promotion = depObj.getJSONObject("promotion");
            if(promotion instanceof JSONObject){
                jsonObj.put("promotionpromoDescription", promotion.getString("promoDescription"));
                jsonObj.put("promotionpromoEndDate", promotion.getString("promoEndDate"));
                jsonObj.put("promotionpromoType", promotion.getString("promoType"));
                jsonObj.put("promotionpromoText", promotion.getString("promoText"));
                jsonObj.put("promotionTriggerQuantity", promotion.getInt("triggerQuantity"));
            }

            JSONObject priceInfo = depObj.getJSONObject("priceInfo");
            if(priceInfo instanceof JSONObject){
                jsonObj.put("priceInfoPrice", priceInfo.getString("price"));
                jsonObj.put("priceInfoBasePrice", priceInfo.getString("basePrice"));
                jsonObj.put("priceInfoPricePer", priceInfo.getString("pricePer"));
                jsonObj.put("priceInfoSellByWeight", priceInfo.getString("sellByWeight"));
                jsonObj.put("priceInfoAverageWeight", priceInfo.getString("averageWeight"));
                jsonObj.put("priceInfoMaxWeight", priceInfo.getString("maxWeight"));
            }

            JSONObject organization = depObj.getJSONObject("organization");
            if(organization instanceof JSONObject) {
                jsonObj.put("organizationRogCd", organization.getString("rogCd"));
                jsonObj.put("organizationDivisionId", organization.getString("divisionId"));
            }

            JSONObject dimension = depObj.getJSONObject("dimension");
            if(dimension instanceof JSONObject) {
                jsonObj.put("dimensionWidth", dimension.getDouble("width"));
                jsonObj.put("dimensionDepth", dimension.getDouble("depth"));
                jsonObj.put("dimensionHeight", dimension.getDouble("height"));
            }

            JSONObject prop65 = depObj.getJSONObject("prop65");
            if(prop65 instanceof JSONObject) {
                jsonObj.put("prop65Prop65WarningTypeCD", prop65.get("prop65WarningTypeCD"));
                jsonObj.put("prop65Prop65WarningText", prop65.get("prop65WarningText"));
                jsonObj.put("prop65Prop65WarningIconRequired", prop65.getBoolean("prop65WarningIconRequired"));
            }

        }
       JSONObject pagination =  productObj.getJSONObject("pagination");
        if(pagination instanceof  JSONObject){
            jsonObj.put("page", pagination.getLong("page"));
            jsonObj.put("pageSize" , pagination.getLong("pageSize"));
            jsonObj.put("productsCount",pagination.getLong("productsCount"));
        }

        Object proferr = productObj.get("productErrors");
        jsonObj.put("productErrors", proferr);
        responseArr.put(jsonObj);
        JSONObject prodRes = new JSONObject();
        prodRes.put("products", responseArr);
        System.out.println(prodRes);
            }
        }