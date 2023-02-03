package ExceptionHandling;

import MultiThreading.Example;
public class Implement {

    public static void main(String[] args) {
        int a=8;
        int b=0;
        int[] arr=new int[2];
        String s=null;

        try {
            System.out.println(s.length());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("1");
        }
        catch (Exception e){
            System.out.println("2");
            e.printStackTrace();
            System.exit(0);
        }

        finally {
            System.out.println("definite");
        }

        Example e=new Example();
        e.run();
    }
}
