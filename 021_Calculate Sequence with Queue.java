import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        Deque<Long> progres = new ArrayDeque<>();
        progres.add(num);
        for (int i = 0; i < 50; i++) {
            Long element = progres.poll();
            System.out.printf("%d ",element);
            long s2 = element +1;
            long s3 = 2*element + 1;
            long s4 = element +2;
            progres.add(s2);
            progres.add(s3);
            progres.add(s4);
        }
    }
}