import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Weight: ");
        double w = scan.nextDouble();

        System.out.println("Enter Height: ");
        double h = scan.nextDouble();
        
        scan.close();

        Base obj = new Base.Child(w, h).build();

        System.out.println(obj.getBMI());
    }
}
