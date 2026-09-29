package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int waterRecipe = 200;
        int milkRecipe = 50;
        int coffeeRecipe = 15;
        int numberOfCoffeeCupsRequired;
        int availableWater, availableMilk, availableCoffee, availableCups = 0;

        System.out.println("Write how many ml of water the coffee machine has:");
        availableWater = scan.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        availableMilk = scan.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        availableCoffee = scan.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        numberOfCoffeeCupsRequired = scan.nextInt();

        availableCups = Math.min(availableMilk/milkRecipe,Math.min(availableWater/waterRecipe, availableCoffee/coffeeRecipe));

        if(availableCups > numberOfCoffeeCupsRequired){
            System.out.println("Yes, I can make that amount of coffee (and even " + (availableCups-numberOfCoffeeCupsRequired) + " more than that)");
        }else if(availableCups < numberOfCoffeeCupsRequired){
            System.out.println("No, I can make only " + availableCups +" cup(s) of coffee");
        }else{
            System.out.println("Yes, I can make that amount of coffee");
        }

//        Stage 2---------------------------
//        System.out.println("For " + numberOfCoffeeCups + " cups of coffee you will need:");
//        System.out.println(waterRecipe*numberOfCoffeeCups + " ml of water");
//        System.out.println(milkRecipe*numberOfCoffeeCups + " ml of milk");
//        System.out.println(coffeeRecipe*numberOfCoffeeCups + " g of coffee beans");

//        Stage1----------------------------
//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");

        scan.close();
    }

}