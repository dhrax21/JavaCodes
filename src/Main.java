import Extra.PascalTriangle;
import immutableClass.Database;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        PascalTriangle p=new PascalTriangle();
        p.printPascal(5);
        List<Integer> list = p.getList();
        System.out.println(list);
    }
}