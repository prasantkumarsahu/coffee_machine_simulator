import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CoffeeMachine cm = new CoffeeMachine();
        while(true){
            System.out.println("Money : "+cm.getMoney());
            System.out.println("1. Buy");
            System.out.println("2. Fill");
            System.out.println("3. Take");
            System.out.println("4. Show");
            System.out.println("5. Analytics");
            System.out.println("6. Exit");
            System.out.println("Choose an option from above (1 - 6)");
            int choice = sc.nextInt();
            System.out.println();

            if(choice == 6){
                break;
            }
            else if(choice == 1){
                System.out.println("Choose Your Coffee (1 - 3) : ");
                System.out.println("1. Espresso");
                System.out.println("2. Latte");
                System.out.println("3. Cappuccino");
                int ch = sc.nextInt();
                try {
                    if(ch == 1){
                        cm.buy(new Espresso());
                    }
                    else if(ch == 2){
                        cm.buy(new Latte());
                    }
                    else if(ch == 3){
                        cm.buy(new Cappuccino());
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println();
                }
            }
            else if(choice == 2){
                System.out.println("Enter water amount in ml : ");
                int water = sc.nextInt();
                System.out.println("Enter milk amount in ml : ");
                int milk = sc.nextInt();
                System.out.println("Enter beans amount : ");
                int beans = sc.nextInt();

                cm.fill(water, milk, beans);
            }
            else if(choice == 3){
                System.out.println("Enter amount of money you want to take : ");
                int amont = sc.nextInt();
                try {
                    cm.take(amont);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println();
                }
            }
            else if(choice == 4){
                cm.show();
            }
            else if(choice == 5){
                cm.analytics();
            }
            else{
                System.out.println("Invalid choice, try again!");
                System.out.println();
            }
        }
        sc.close();
    }
}
