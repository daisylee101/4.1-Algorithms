import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twos = twos();
        int least = least();
        int big500s = big500s();
        System.out.println(odds);
        System.out.println(evens);
        System.out.println(twos);
        System.out.println(big500s);
        System.out.println(least);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }

    public static int twos() throws FileNotFoundException{
        s = new Scanner(f);
        int twos = 0;
        while (s.hasNext()) {
            if (s.nextInt() >= 10 && s.nextInt() <= 99)
                twos++;
        }
        return twos;
    }

    public static int big500s() throws FileNotFoundException{
        s = new Scanner(f);
        int big500s = 0;
        while (s.hasNext()) {
            if (s.nextInt() >= 501)
                big500s++;
        }
        return big500s;
    }

    public static int least() throws FileNotFoundException{
        s = new Scanner(f);
        int least = 0;
        while (s.hasNext()) {
            if (s.nextInt() < 1)
                least = 0;
        }
        return least;
    }
}

