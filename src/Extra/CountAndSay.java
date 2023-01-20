package Extra;

public class CountAndSay {

    public String countSay(int n){
        if(n==1)
            return "1";

        String s=countSay(n-1);
        int c=1,i=1;
        int num=Integer.parseInt(s.charAt(0)+"");
        StringBuilder sb=new StringBuilder();

        while(i<s.length()){
            if(s.charAt(i)-'0'==num){
                c++;
            }else{
                sb.append(c).append(num);
                num=s.charAt(i)-'0';
                c=1;
            }
            i++;
        }
        sb.append(c).append(num);
        return sb.toString();
    }
}
