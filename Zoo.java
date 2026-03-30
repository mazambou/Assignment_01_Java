
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter animal name:");
        String name = input.nextLine();

        System.out.print("Enter animal color:");
        String color = input.nextLine();

        System.out.print("Enter animal age:");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter animal food:");
        String favFood = input.nextLine();

            //animal Objet
        Animal animal1 = new Animal(name, color, age, favFood);

            // print details 
        System.out.print("\nAnimal Details:");
        animal1.printDetails();

        input.close();
    }
}