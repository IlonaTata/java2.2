public class Main {
    public static void main(String[] args) {
        int check = 200;
        int amount = 1100;
        int bonus = amount/100;


        int balance;
        if (amount >=- 1000) {
             balance = check + amount + bonus;
        }
        else {
             balance = check + amount;
    }
        System.out.println(balance);
    }
}