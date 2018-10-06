import java.util.Scanner;

public class Even {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println("even");
        else
            System.out.println("invalid");
    }
}
