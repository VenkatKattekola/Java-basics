package basics;
class Book{
    String name;
    double cost;
    int pages;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    
}
public class Demo1 {
    public static void main(String[] args) {
        Book b = new Book();
        b.setCost(80);
        b.setName("Wings of fire");
        b.setPages(100);
        System.out.println("Book details:"+ b.getCost()+"\t"+ b.getName()+"\t"+b.getPages());
    }
}
