package basics;

public class Test2 {
    public static void main(String[] args) {

        int a = 10;
        int  b =0;
        int res =0;
        try{
             res = a/b;
        }catch(ArithmeticException e){
            //e.printStackTrace();
            System.out.println(e);
            //System.out.println(e.getMessage());


        }
        finally {
            System.out.println("res = " + res);

        }



    }
}
