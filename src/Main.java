import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        tester c = new tester();
        System.out.println();
        System.out.println(c.Electro()+"    E");
        System.out.println(c.Amortiza()+"   A");

        System.out.println();
        Kruglomer k = new Kruglomer();
        System.out.println();
        System.out.println(k.Electro()+"    E");
        System.out.println(k.Amortiza()+"   A");

        System.out.println();
        verDlin v = new verDlin();
        System.out.println();
        System.out.println(v.Electro()+"    E");
        System.out.println(v.Amortiza()+"   A");

        System.out.println();
        Otver o = new Otver();
        System.out.println();
        System.out.println(o.Electro()+"    E");
        System.out.println(o.Amortiza()+"   A");

        System.out.println();
        Sum3 z = new Sum3();
        z.ZZ();


    }
}

