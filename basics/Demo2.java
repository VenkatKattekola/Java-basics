package basics;

public class Demo2 {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.enterDetails("A10b5","venkat",15000);
        b1.showDetails(); 
        Bank b2=new Bank();
        b2.enterDetails("b121l", "giri", 10000);
        b2.showDetails();
        Bank b3=new Bank();
        b3.enterDetails("h13aD","Venky" , 150000);
        b3.showDetails();
    }
    
}
class Bank{
    String accountNumber;
    String customerName;
    double accountBalance;
    public void enterDetails(String accountNumber,String customerName,double accountBalance){
        this.accountNumber = accountNumber;
        this.customerName  = customerName;
        this.accountBalance= accountBalance;
    }
    public void showDetails(){
       System.out.println("Bank details are:");
       System.out.println("accountNumber="+accountNumber);
       System.out.println("customerName="+customerName);
       System.out.println("accountBalance="+accountBalance);
    }
}