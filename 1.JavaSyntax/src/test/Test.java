package test;

public class Test {
    public static void main(String[] args) {
        double a = 1.000001;
        double b = 1.000002;
        if ( Math.abs(b - a) < 0.0001 )
            System.out.println("Числа равны");
        else
            System.out.println("Числа не равны");
    }
}
