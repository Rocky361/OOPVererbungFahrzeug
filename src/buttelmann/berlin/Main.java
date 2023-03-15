package buttelmann.berlin;

public class Main {
    public static void main(String[] args) {
        Pkw pkw = new Pkw(4, 60);
        pkw.allesAusgeben();
        System.out.println(pkw.geschwindigkeit);
        pkw.geschwindigkeit = 10;
        System.out.println(pkw.geschwindigkeit);

    }
}