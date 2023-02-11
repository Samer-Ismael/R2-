import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int R1 = scan.nextInt();
        int S = scan.nextInt();
        int R2 = 0;
        /*
        R2 = (R1 + R2) / S;
        you can see in the example they give you in the website that R1 + R2 / S Always = 2;

        (R1 + R2) / S = 2;
        R1 + R2 = S * 2;
        :)

         */
        R2 = (S * 2) - R1;

        System.out.println(R2);
    }
}