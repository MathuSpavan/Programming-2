package Generische_Klasse_Vorlesung_Übung1;

public class Pair <T,U> {

    private T objekt1;
    private U objekt2;

    public Pair(T objekt1, U objekt2){
      this.objekt1 = objekt1;
      this.objekt2 = objekt2;
    }

    public T getT(){
        return objekt1;
    }

    public U getU(){
        return objekt2;
    }

    public void setObjekt1(T objekt1) {
        this.objekt1 = objekt1;
    }

    public void setObjekt2(U objekt2) {
        this.objekt2 = objekt2;
    }
    @Override
    public String toString(){
        return "Pair{" + "objekt1=" + objekt1 + ", objekt2=" + objekt2 + '}';}
    }



