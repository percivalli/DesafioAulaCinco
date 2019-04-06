package br.com.digitalhouse;

public class Principal {

    public static void main(String[] args) {
        Filho filho1 = new Filho();
        Filho filho2 = new Filho();

        filho1.setMae("Maria");
        filho1.setPai("José");
        filho2.setMae("Maria");
        filho2.setPai("João");

        System.out.println("Tem a mesma mãe?" + temAMesmaMae(filho1, filho2));
        System.out.println("Tem o mesmo pai?" + temOMesmoPai(filho1, filho2));
        System.out.println("São meio irmãos?" + saoMeioIrmaos(filho1, filho2));


    }

    public static String maeDe(Filho filho) {
        return filho.getMae();
    }

    public static String paiDe(Filho filho) {
        return filho.getPai();
    }

    public static boolean temAMesmaMae(Filho filho1, Filho filho2) {
        return maeDe(filho1) == maeDe(filho2);
    }

    public static boolean temOMesmoPai(Filho filho1, Filho filho2) {
        return paiDe(filho1) == paiDe(filho2);
    }

    public static boolean saoMeioIrmaos(Filho filho1, Filho filho2) {
        return temAMesmaMae(filho1, filho2) && !temOMesmoPai(filho1, filho2)
                || !temAMesmaMae(filho1, filho2) && temOMesmoPai(filho1, filho2);
    }
}
