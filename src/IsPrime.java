import java.util.Scanner;

public class IsPrime {
    public static int findValue(int index){
        if (index < 3)
            return 1;
        return findValue(index - 2) + findValue(index - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an index in the fibonacci range: ");
        int N = input.nextInt();
        int result = findValue(N);
        System.out.println("The value at position :" + N + " in the fibonacci range is:" + result);
    }
}
