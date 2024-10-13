package ValidParentheses;

import java.util.Stack;

public class IsValid {
    public static boolean isValid(String s){
        if (s.length() < 2) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
                continue;
            } else if (stack.isEmpty()){
                return false;
            } else if ((stack.peek() == '(' && c == ')') || (stack.peek() == '[' && c == ']')|| (stack.peek() == '{' && c == '}')){
                stack.pop();
                continue;
            }
            return false;
        }
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("([]"));
    }
}
