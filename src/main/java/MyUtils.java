import java.io.*;
import java.nio.charset.StandardCharsets;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MyUtils {
    public static String readJsonFile(String filename) {
        StringBuilder sb = new StringBuilder();
        File jsonFile = new File(filename);
        if(!jsonFile.exists()){
            System.err.println("File does not exist!");
        }
        try{
            FileInputStream fis = new FileInputStream(filename);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String str;
            while((str = br.readLine()) != null){
                sb.append(str);
            }
            br.close();
            isr.close();
            fis.close();
        } catch(IOException e){
            e.getStackTrace();
        }
        return sb.toString();
    }

    public static VerificationRule ruleString2RuleObj(String ruleString) throws JsonProcessingException {
        final ObjectMapper MAPPER = new ObjectMapper();
        return MAPPER.readValue(ruleString, VerificationRule.class);
    }

}
