package EvaluateReversePolishNotation;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();

        for (String i : tokens) {
            if (!i.equals("+") && !i.equals("-") && !i.equals("*") && !i.equals("/")) {
                nums.push(Integer.parseInt(i));
                continue;
            }
            int a = nums.pop();
            int b = nums.pop();
            switch (i) {
                case "+":
                    nums.push(a + b);
                    break;
                case "-":
                    nums.push(b - a);
                    break;
                case "*":
                    nums.push(a * b);
                    break;
                case "/":
                    nums.push(a / b);
                    break;
            }
        }
        return nums.peek();
    }

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }
}
