import java.util.*;

class Fibonacci implements Runnable {
    int l;

    Fibonacci(int n) {
        l = n;
    }

    public void run() {
        int c;
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        System.out.print(a + " " + b);
        for (int i = 2; i < l; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}

class Even implements Runnable {
    int l;

    Even(int n) {
        l = n;
    }

    public void run() {
        System.out.println("Even Numbers:");
        for (int i = 0; i < l; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Limit: ");
        int l = sc.nextInt();

        Fibonacci f = new Fibonacci(l);
        Even e = new Even(l);

        Thread T1 = new Thread(f);
        Thread T2 = new Thread(e);

        T1.start();
        T2.start();
    }
}
