package GroupAnagrams;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class GroupAnagrams {
    public static List<List<String>> GroupAnagrams(String[] strs){
        if (strs.length == 0){
            return new ArrayList<>();
        }

        HashMap<String,ArrayList<String>> tabla = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] i_array = strs[i].toCharArray();
            Arrays.sort(i_array);
            if (!tabla.containsKey(String.valueOf(i_array))) {
                tabla.put(String.valueOf(i_array), new ArrayList<>());
            }
            tabla.get(String.valueOf(i_array)).add(strs[i]);

        }
        List<List<String>> lista = new ArrayList<>();
        for (String clave : tabla.keySet()){
            lista.add(tabla.get(clave));
        }
        return lista;
    }

    public static void main(String[] args) {
        GroupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"});
    }
}
