import java.util.*;

class windenergy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double v = s.nextDouble();
        double a = s.nextDouble();
        double p = 0.5 * 1.225 * a * v * v * v;
        System.out.println(p + " W");
    }
}
