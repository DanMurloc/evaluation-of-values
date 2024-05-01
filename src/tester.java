public class tester
{
    Double Rel= 0.5;
    Double K3 = 0.88;
    Double C1 = 0.0;
    Integer Cbalanc = 7000000;
    Double KRemont = 0.03;
    Integer Nrabday = 248;
    Integer Nrabcha=8;
    Double Sk1WT = 6.42;
    Integer T_mash = 2;

    tester()
    {
        double dop = 0.0016;   //мм
        double dop1 = 0.0063;  //мм
        double pog = 0.000001; //мм
        double v1 = dop/pog;
        double v2 = dop1/pog;
        System.out.println(v1+" допуск/погрешность");
        System.out.println(v2+" допуск/погрешность");
    }

    //Электроэнергия не технологические нужды
    public Double Electro()
    {
        Double sum = Rel*K3*T_mash*Sk1WT;
        return sum;
    }

    public Double Amortiza()
    {
        Double sum = ((Cbalanc*KRemont)/Nrabday/Nrabcha)*T_mash;
        return sum;
    }

}

