package basics;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int x = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number ");

        try {
           //  x = s.nextInt();
            x = Integer.parseInt(s.next());
        }
        catch(Exception e){
            //e.printStackTrace();
            System.out.println(e);
        }
        finally{
            System.out.println("x=" + x);

        }


    }
}
