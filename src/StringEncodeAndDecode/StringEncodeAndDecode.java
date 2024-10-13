package StringEncodeAndDecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEncodeAndDecode {
    public static String encode(List<String> strs){
        if (strs.size() == 1 && strs.get(0) == "") {
            return "";
        } else if (strs.size() == 0){
            return "flagged";
        }

        StringBuilder sb = new StringBuilder();
        for (String str : strs){
            sb.append(str + " ");
        }
        return sb.toString();
    }

    public static List<String> decode(String str){
        if (str == ""){
            List<String> words = new ArrayList<>();
            words.add("");
            return words;
        } else if (str.equals("flagged")){
            List<String> words = new ArrayList<>();
            return words;
        }
        String[] words = str.split(" ");
        return Arrays.asList(words);

    }

    public static void main(String[] args) {
        String[] caso = {""};
        String str = encode(Arrays.asList(caso));
        decode(str);
    }

}
