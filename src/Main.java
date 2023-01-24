import Extra.Student;
import Genereks.GenerecsImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        GenerecsImpl<String> g=new GenerecsImpl<>();
        g.setObj("hi");
        g.show();

    }
}