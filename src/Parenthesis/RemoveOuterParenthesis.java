package Parenthesis;

import java.util.Stack;

public class RemoveOuterParenthesis {

    public String removeParenthesis(String s) {
        Stack<Character> st = new Stack<>();
        // (())
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if(st.size()>=1)
                result += '(';

                st.push(ch);
            }
            else {
                if (st.size() > 1) {
                    result += ')';
                    }
                st.pop();
            }
        }

        return result;
    }
}
