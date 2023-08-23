package basics;

class Test {
    {
        System.out.println("instance block-1:logics");
    }

    Test() {
         this(10);
        //new Test(10);
        System.out.println("0-arg constructor:logics");
    }

    Test(int a) {
        System.out.println("1-arg constructor:logics");
    }

    public static void main(String[] args) {
       new Test();

    }
}