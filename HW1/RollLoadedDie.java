import java.util.Random;

public class RollLoadedDie {
    public static void main(String[] args) {
        Random rand = new Random();

        int res = rand.nextInt(8) + 1;
        int result;
        if (res <= 5) {
            result = res;
        } else {
            result = 6;
        }
        System.out.println("Kết quả: " + result);
    }
}
