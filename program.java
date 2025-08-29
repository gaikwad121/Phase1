import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Welcome " + name + " to KG Coding!");

        sc.close(); // good practice to close Scanner
    }
}
