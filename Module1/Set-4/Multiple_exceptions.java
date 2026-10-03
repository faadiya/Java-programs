import java.util.Scanner;

class Multiple_exeptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {10, 20, 30};

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        try {
            System.out.println("Value = " + a[index]);
            System.out.println("Result = " + (100 / a[index]));
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println("Exception handling completed");
        }
    }
}
