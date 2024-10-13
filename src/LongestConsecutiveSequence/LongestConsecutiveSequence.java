package LongestConsecutiveSequence;

import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutiveSequece(int[] nums){
        Set<Integer> numeros = new HashSet<>();
        int counter = 1;
        int maxLength = 0;
        for (int numero : nums){
            numeros.add(numero);
        }

        for (int num : numeros) {
            counter = 1;
            if (numeros.contains(num-1)) {
                continue;
            }

            int current = num;
            while (numeros.contains(current + 1)) {
                counter += 1;
                current = current+1;
            }
            if (counter > maxLength){
                maxLength = counter;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutiveSequece(new int[] {9,1,4,7,3,-1,0,5,8,-1,6}));
    }
}
