package basics;


class Test1{

    static{
        System.out.println("This is a static block");
    }
    Test1(){
        System.out.println("This is a defualt constructor");
    }

    static {
        System.out.println("This is static 2");
    }

    public void show(){
        System.out.println("This is show method ");
    }


    {
        System.out.println("This is an instance block"); //instance method
    }
    {
        System.out.println("instance block2");
    }

}
public class Demo9 {
    public static void main(String[] args) {

        Test1 test = new Test1();
        Test1 test1 = new Test1();
        Test1 test2 = new Test1();
        Test1 test3 = new Test1();
        Test1 test4 = new Test1();
        Test1 test5 = new Test1();
        Test1 test6 = new Test1();
        Test1 test7 = new Test1();
        Test1 test8 = new Test1();
        Test1 test9 = new Test1();

        test.show();
    }
}
