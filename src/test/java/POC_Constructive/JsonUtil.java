package POC_Constructive;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtil {

    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
    }

    public static String convertJavaToJson(Object object) throws JsonProcessingException {

        String JSONResult = "";

        try {

            JSONResult = mapper.writeValueAsString(object);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
            System.out.println("exception handling :" +e.getMessage());
        } catch (JsonMappingException e) {
            e.printStackTrace();
            System.out.println("exception handling :" +e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("exception handling :" +e.getMessage());

        }
        return JSONResult;
    }
    public static <T> T convertjsonTOjava  (String jsonString, Class<T> cls) throws JsonProcessingException {
        T result = null;
        try {
     result = mapper.readValue(jsonString, cls);
    } catch (JsonGenerationException e) {
        e.printStackTrace();
        System.out.println("exception handling :" +e.getMessage());
    } catch (JsonMappingException e) {
        e.printStackTrace();
        System.out.println("exception handling :" +e.getMessage());
    } catch (IOException e) {
        e.printStackTrace();
        System.out.println("exception handling :" +e.getMessage());

    }

     return  result;
    }
}
