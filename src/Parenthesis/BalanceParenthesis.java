package Parenthesis;

import java.util.Stack;

public class BalanceParenthesis {

    public boolean isBal(String str){
        Stack<Character> stack = new Stack<Character>();

        for (char c : str.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
