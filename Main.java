import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a fuel type:");
        int fuelType = scanner.nextInt();
        System.out.println("Enter an amount of liters");
        int amount = scanner.nextInt();
        double fuel92 = 48.81;
        double fuel95 = 55.89;
        double fuel98 = 62.37;
        double fuel100 = 61.35;
        double price = 0;
        if (fuelType == 92){
            price = fuel92*amount;
        } else if (fuelType == 98) {
            price = fuelType*amount;
        } else if (fuelType == 95){
            price = fuel95*amount;
        } else if (fuelType == 100) {
            price = fuel100*amount;
        } else{
            System.out.println("Incorrect value");
        }
        System.out.println("Total price is "+price);
/*
        System.out.println("Enter a name:");
        String name = scanner.nextLine();
        System.out.println("You are welcome, "+name);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Your age is "+age);
        if (age <= 10){
            System.out.println("Вы учитесь в начальной школе");
        } else if (age <= 15) {
            System.out.println("Вы учитесь в средней школе");
        } else if (age <= 18) {
            System.out.println("Вы учитесь в старшей школе");
        } else {
            System.out.println("Поздравляю, вы прошли игру");
        }
*/
        /*
        int number = scanner.nextInt();
        String help = scanner.nextLine();
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        System.out.println("You entered a word - "+word);
        System.out.println("You entered - "+number);
        */
        /*
        int a = 70;
        int b = 70;
        if (a<b){
            System.out.println("a > b");
        }
        else if (b<a){
            System.out.println("b > a");
        }
        else{
            System.out.println("a is equal to b");
        }
        */
    }
}