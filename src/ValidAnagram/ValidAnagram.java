package ValidAnagram;

import java.util.ArrayList;
import java.util.Comparator;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }

        ArrayList<Character> s_arr = new ArrayList<>();
        ArrayList<Character> t_arr = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            s_arr.add(s.charAt(i));
            t_arr.add(t.charAt(i));
        }
        s_arr.sort(Comparator.naturalOrder());
        t_arr.sort(Comparator.naturalOrder());

        if (s_arr.equals(t_arr)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(ValidAnagram.isAnagram(s,t));
    }
}
