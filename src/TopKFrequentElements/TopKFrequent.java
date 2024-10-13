package TopKFrequentElements;

import java.util.*;

public class TopKFrequent {
    public static int count(int num, int[] arr){
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                counter++;
            }
        }
        return counter;
    }

    public static HashSet<Integer> toSet(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr){
            set.add(i);
        }
        return set;
    }

    public static int[] topKFrequent(int[] nums, int k){
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        Set<Integer> nums_set = toSet(nums);
        for (int num : nums_set){
            int count = count(num,nums);
            if (map.containsKey(count)){
                if (map.get(count) != null){
                    map.get(count).add(num);
                    continue;
                }
            } else {
                map.put(count,new ArrayList<>());
                map.get(count).add(num);
            }

        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort(Comparator.reverseOrder());
        List<Integer> solution = new ArrayList<>();
        for (int i = 0; i < k; i++){
            if (solution.size() == k){
                break;
            }
            if (map.get(keys.get(i)).size() >= k){
                solution = map.get(keys.get(i)).subList(0,k);
                return solution.stream().mapToInt(Integer::intValue).toArray();
            }
            for (int num : map.get(keys.get(i))){
                solution.add(num);
            }

        }
        return solution.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] output = topKFrequent(new int[] {1,1,1,2,2,3},2);
        for (int num : output){
            System.out.println(num);
        }
    }
}
