import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        boolean drivingUnderAge;
        if (age >= 18) {
            drivingUnderAge = false;
        }
        else {
            drivingUnderAge = true;
        }

        System.out.println("Your age is " + age + ". Driving under age?: " + drivingUnderAge);



    }
}
