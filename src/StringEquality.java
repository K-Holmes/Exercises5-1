import java.util.Scanner;
public class StringEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        String kingOfRockAndRoll = "Moe";

        if (name.equals(kingOfRockAndRoll)){
            System.out.println("You are the King of rock and roll");
        }
        else {
            System.out.println("You are not the king");
        }
    }

}

