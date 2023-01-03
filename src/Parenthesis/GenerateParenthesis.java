package Parenthesis;

import java.util.ArrayList;

public class GenerateParenthesis {

    public ArrayList<String> generate(int n){
         ArrayList<String> ans=new ArrayList<>();
         helper(1,0,n,"(",ans);
         return ans;
    }

    private void helper(int open, int close, int n, String s,ArrayList<String> ans) {
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(open<n){
             helper(open+1,close,n,s+"(",ans);
        }
        if(close<open){
            helper(open,close+1,n,s+")",ans);
        }
    }
}
