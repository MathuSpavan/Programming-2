package Generische_Klasse_Vorlesung_Übung1;

public class Main {
    public static void main(String[] args) {


        Pair<String, Integer> a = new Pair<>("Thomas", 30);
        System.out.println(a);

        a.setObjekt1("Gewischt");
        a.setObjekt2(40);
        System.out.println(a);
    }
}
