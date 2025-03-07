public class Main {
    public static void main(String[] args) {
        metodo();
        metodo3(1,2.0);
        metodo3(1);

    }

    public static void metodo3(int x, double y) {
        System.out.println("x ="+x);
    }
    public static void metodo3(double  x) {
        System.out.printf("x ="+x);
    }
    public static int metodo2() {
        return 0;
    }

    public static void metodo() {
        System.out.println("Dento do método");
    }
}
