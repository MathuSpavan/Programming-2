package Übung_4_Matrix;

public class Matrix <T extends Number> {

    private int zeile;
    private int spalte;
    private Number[][] matrix;          //Number als Datentyp von T; wird als array benutzt

    public Matrix(int zeile, int spalte ){
        this.spalte = spalte;
        this.zeile = zeile;
        matrix = new Number[zeile][spalte];
    }

    public Number get(int zeile, int spalte){
        return matrix[zeile][spalte];
    }

    public void set(int zeile, int spalte, T zahl){
        matrix[zeile][spalte] = zahl;
    }

    public Matrix<Number> addieren( Matrix<? extends Number> matrix2){
        Matrix <Number>  neueMatrix = new Matrix<>(zeile, spalte);
        for(int i = 0; i < zeile; i++ ){
            for(int j=0; j < spalte; j++){
                double erbenis = get(i, j).doubleValue() + matrix2.get(i,j).doubleValue();
                neueMatrix.set(i,j, erbenis);
            }
        }
        return neueMatrix;
    }

    public Matrix<Number> skalarmultiplikation(T zahl) {
        Matrix<Number> neueMatrix = new Matrix<>(zeile, spalte);
        for (int i = 0; i < zeile; i++) {
            for (int j = 0; j < spalte; j++) {
                double produkt = this.get(i, j).doubleValue()  * zahl.doubleValue();
                neueMatrix.set(i, j, produkt);
            }
        }
        return neueMatrix;
    }



    public String ausgabe() {
        StringBuilder ausgabe = new StringBuilder();
        for (int i = 0; i < zeile; i++) {
            for (int j = 0; j < spalte; j++) {

                ausgabe.append(get(i, j).doubleValue());
                ausgabe.append(" ");
            }
            ausgabe.append("\n");
        }
        return ausgabe.toString();

    }

}