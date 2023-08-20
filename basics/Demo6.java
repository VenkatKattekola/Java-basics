package basics;

class Mobiles{
    String mobileName; //instance variable
    static String company; //static variable
    static void display(){
        System.out.println("This is a static method");

    }
    public void display(String mobileName){
        this.mobileName = mobileName;
        System.out.println("Mobile Name = " + mobileName);
        System.out.println("Company = " + company);
    }
    int display(int x){
        return 100 + x;
    }
}

public class Demo6 {
    public static void main(String[] args) {

        Mobiles.company ="samsung";
        Mobiles.display();  // classname.staticmethodname

        Mobiles m1 = new Mobiles();
        m1.display("zfold");


        Mobiles m2 = new Mobiles();
        m2.company="lava";
        m2.display("GalaxyS1");


    }
}
