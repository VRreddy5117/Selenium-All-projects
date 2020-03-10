package POC_Constructive;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class JsonToCollection {


        public static void main(String[] args) {

            ObjectMapper mapper = new ObjectMapper();
          //  String json = "C:\\Users\\rannem\\Downloads\\data.json";

           // String json =     "C:\\Users\\rannem\\IdeaProjects\\Selenium\\src\\data.json";

            try {

                Map<String, String> map = mapper.readValue("C:\\Users\\rannem\\IdeaProjects\\Selenium\\src\\data.json", Map.class);

                // it works
                //Map<String, String> map = mapper.readValue(json, new TypeReference<Map<String, String>>() {});

                System.out.println(map);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

