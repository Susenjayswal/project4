import java.util.InputMismatchException;
import java.util.Scanner;

class Average {
    double avg = 0;
    int n[] = new int[5];

    void get_input() {
        Scanner s = new Scanner(System.in);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter number");
                n[i] = s.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Non-Integer Value is not acceptable");
        }
    }

    void display() {
        double sum = 0;
        for (int j = 0; j < 5; j++) {
            sum += n[j];
        }
        avg = sum / 5.0;
        System.out.println("Average of given 5 numbers -- " + avg);
    }
}

public class Main {
    public static void main(String[] args) {
        Average ca = new Average();
        ca.get_input();
        ca.display();
    }
}