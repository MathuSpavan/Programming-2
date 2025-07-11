package Übung_4_Matrix;

public class Main {
    public static void main(String[] args) {
        // 1) Matrix<Number> benutzen, nicht rohen Typ
        Matrix<Number> a = new Matrix<>(2, 2);
        // 2) erst alle Zellen setzen…
        a.set(0, 0, 2);
        a.set(0, 1, 23);
        a.set(1, 0, 20);
        a.set(1, 1, 0.321);

        // 3) Skalarmultiplikation aufrufen und Ergebnis in eigene Variable packen
        Matrix<Number> skaliert = a.skalarmultiplikation(5);
        // 4) Resultat ausgeben – ACHTUNG: ausgabe() hat keinen Parameter!
        System.out.println("Skaliert ×5:\n" + skaliert.ausgabe());

        // 5) und noch ein Beispiel für Addition
        Matrix<Number> b = new Matrix<>(2, 2);
        b.set(0, 0, 1);
        b.set(0, 1, 1);
        b.set(1, 0, 1);
        b.set(1, 1, 1);

        Matrix<Number> summe = a.addieren(b);
        System.out.println("Summe:\n" + summe.ausgabe());
    }
}
