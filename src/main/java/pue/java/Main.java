package pue.java;
public class Main {
    public static void main(String[] args) {
        Raices r1 = new Raices(1,6,9);
        Raices r2 = new Raices(4,10,2);
        Raices r3 = new Raices(4,2,9);

        System.out.println("r1");
        Soluciones s = r1.calcular();
        System.out.println(s);
        System.out.println("r2");
        Soluciones s2 = r2.calcular();
        System.out.println(s2);
        System.out.println("r3");
        Soluciones s3 = r3.calcular();
        System.out.println(s3);

    }
}