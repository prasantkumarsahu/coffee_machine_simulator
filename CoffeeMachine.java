public class CoffeeMachine{
    private int water;
    private int milk;
    private int beans;
    private int money;
    private int totalCoffeeSold;
    private int totalAmountEarned;
    private int totalIngredientsConsumed;

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }
    
    public int getMoney() {
        return money;
    }

    public void fill(int water, int milk, int beans){
        this.water += water;
        this.milk += milk;
        this.beans += beans;

        System.out.println("Ingredients are added!");
        System.out.println();
    }

    public void buy(Coffee coffee) throws Exception{
        if(coffee.getWater() > water || coffee.getMilk() > milk || coffee.getBeans() > beans){
            throw new Exception("Insufficient ingredients!");
        }

        water -= coffee.getWater();
        milk -= coffee.getMilk();
        beans -= coffee.getBeans();
        money += coffee.getPrice();
        totalCoffeeSold++;
        totalAmountEarned += coffee.getPrice();
        totalIngredientsConsumed += (coffee.getWater()+coffee.getMilk()+coffee.getBeans());

        System.out.println("Your coffee is dispensed!");
        System.out.println();
    }

    public void take(int amount) throws Exception{
        if(amount > money){
            throw new Exception("Invalid amount, please retry!");
        }

        money -= amount;

        System.out.println("You withdraws "+amount+" amounts of money.");
        System.out.println();
    }

    public void show(){
        System.out.println("Available water in machine is : "+water);
        System.out.println("Available milk in machine is : "+milk);
        System.out.println("Available beans in machine is : "+beans);
        System.out.println();
    }

    public void analytics(){
        System.out.println("Count of total coffee sold : "+totalCoffeeSold);
        System.out.println("Total amont earned : "+totalAmountEarned);
        System.out.println("Total ingredients consumed : "+totalIngredientsConsumed);
        System.out.println();
    }
}