package basics;
class Demo{
    int x;
    public void show(Demo d){
        System.out.println("x value is " + d.x);
    }
}
public class Demo8 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.x = 100;

        Demo d2 = new Demo();
        d2.x=350;

        d1.show(d1);
        d2.show(d2);


    }

}
