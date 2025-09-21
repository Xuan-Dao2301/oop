public class FunctionGrowth {
    public static void main(String[] args) {
        System.out.println("ln(n)\tn\tn.ln(n)\tn^2\tn^3\t2^n");
        for (int i = 16; i <= 2048; i *= 2) {
            double lnn = Math.log(i);
            double nlnn = i * lnn;
            double n2 = Math.pow(i,2);
            double n3 = Math.pow(i,3);
            double pow2n = Math.pow(2,i);

            System.out.println(lnn + "\t" + i + "\t" + nlnn + "\t" + n2 + "\t" + n3 + "\t" + pow2n);
        }
    }
}
