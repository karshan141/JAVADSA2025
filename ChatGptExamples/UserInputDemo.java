package ChatGptExamples;
import java.util.Scanner;;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name :");
        String name = sc.nextLine();

        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();

        System.out.println("Hello : " + name);
        System.out.println("your age is : " + age);
    }
}
