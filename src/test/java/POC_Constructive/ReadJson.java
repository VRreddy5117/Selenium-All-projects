package POC_Constructive;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.*;

public class ReadJson {

        public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("C:\\Users\\rannem\\IdeaProjects\\Selenium\\src\\data.json"));
            JSONObject jsonObject = (JSONObject) obj;

            System.out.println("JSON Response :: "+jsonObject);
            JSONArray companyList = (JSONArray) jsonObject.get("departments");
           Map<String, Object> map = new LinkedHashMap<>();
            String id = "";
            String name = "";
            String img = "";
            for(int i = 0; i <= companyList.size()-1; i++){
                JSONObject productDetail = (JSONObject) companyList.get(i);
                map.put("id" , productDetail.get("id"));
                map.put("name" , productDetail.get("name"));
                map.put("image" , productDetail.get("image"));

            }
            JSONObject json = new JSONObject();

            json.putAll(map);
            System.out.println(json);

        } catch (Exception e) {
            e.printStackTrace();
        }

        }
}
