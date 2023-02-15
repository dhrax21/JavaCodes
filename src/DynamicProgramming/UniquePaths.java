package DynamicProgramming;

public class UniquePaths {

    public int uniqPath(int m,int n){
        if(m==0 ||n==0)
            return 1;

        return uniqPath(m,n-1) + uniqPath(m-1,n);
    }
}
