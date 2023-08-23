package basics;
class StaticDemo{
      static void add(int a , int b){
         System.out.println(a+b);
     }
    static void add(int a , int b,int c){
        System.out.println(a+b+c);
    }
    static void add(int a ,char ch ,char c){
        System.out.println(a+c+ch);
    }


}
public class Demo7 {
    public static void main(String[] args) {
      StaticDemo.add(10,20);
      StaticDemo.add(10,20,30);
      StaticDemo.add(10, (int) 67.5, (int) 90.6);
    }
}
