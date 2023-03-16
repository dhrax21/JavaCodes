package Extra;

import java.util.ArrayList;
import java.util.List;

//letterCombinations of a phone number
public class LCOMP {

    public List<String> letterCombinations(String digits) {  // 2 2

        String digitletter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<String>();

        if (digits.length()==0)
            return result;

        result.add("");
        for (int i=0; i<digits.length(); i++)
            result = combine(digitletter[digits.charAt(i)-'0'],result);

        return result;
    }

    public static List<String> combine(String digit, List<String> given) {
        List<String> result = new ArrayList<String>();

        for (int i=0; i<digit.length(); i++)
            for (String x : given)
                result.add(x+digit.charAt(i));

        return result;
    }
}

