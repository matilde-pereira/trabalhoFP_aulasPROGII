public class MainAutomovel {
    public static void main (String[]args) {
        Automovel a1 = new Automovel("11-11-AA", "Toyota", 1400);
        System.out.println(a1.toString());
        System.out.println(a1.getMatricula());
        System.out.println(Automovel.getTotalAutomoveis());

        Automovel a2 = new Automovel("22-22-BB", "Fiat");
        System.out.println(a2.getMatricula());
        a2.setCilindrada(1800);
        System.out.println(a2.toString());
        System.out.println(Automovel.getTotalAutomoveis());

        System.out.println(a1.calcularDiferencaCilindrada(a2));
        if (a1.isCilindradaMaior(a2)) {
            System.out.println(a1.getMatricula());
        }else {
            System.out.println(a2.getMatricula());
        }
        System.out.println(a1.isCilindradaMaior(2000));
    }
}