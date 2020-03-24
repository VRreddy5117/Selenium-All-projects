package POC_Constructive;

import com.fasterxml.jackson.core.JsonProcessingException;

public class JsonUtilMain {
    public static void main(String[] args) throws JsonProcessingException {

        JSONUtilBean jsn = new JSONUtilBean();
        jsn.setEmpNo(16001);
        jsn.setName("ramana");
        jsn.setSalary(2000.00);
       String jsonEmployee = JsonUtil.convertJavaToJson(jsn);
        System.out.println(jsonEmployee);
        System.out.println("===========================================");

        /*JSONUtilBean emp1=  JsonUtil.convertjsonTOjava(jsonEmployee, JSONUtilBean.class);
        System.out.println(emp1.getEmpNo() + " " + emp1.getSalary() + " " + emp1.getName());*/
    }
}
