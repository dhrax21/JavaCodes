package Extra;

import java.util.*;

public class LargestNumber {

    public String largestNum(int[] nums){
        if(nums.length==0)
            return "";

        String[] conv=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            conv[i]=String.valueOf(nums[i]);
        }

//        Arrays.sort(conv,(a,b) -> (b+a).compareTo(a+b));

        Arrays.sort(conv, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
            }
        });
        StringBuilder res=new StringBuilder();
        //after sorting if the array starts with 0
        if(conv[0].equals("0"))
            return "0";

        // else
        for(int i=0;i<conv.length;i++)
        {
            res.append(conv[i]);
        }
        return res.toString();
    }
}
