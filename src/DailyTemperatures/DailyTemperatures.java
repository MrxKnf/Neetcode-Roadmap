package DailyTemperatures;

import java.util.Stack;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures){
        Stack<Integer> pila = new Stack<>();
        int[] answer = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            if (pila.isEmpty()){
                pila.push(i);
                continue;
            }

            while (!pila.isEmpty() && temperatures[i] > temperatures[pila.peek()]){
                answer[pila.peek()] = i - pila.peek();
                pila.pop();
            }
            pila.push(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(dailyTemperatures(new int[] {73,74,75,71,69,72,76,73}));
    }
}
