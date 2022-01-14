package curs4V2;

public class Fruct {


    public String culoare;
    public int pret;
    public String numeFruct;

    public Fruct(String fruitName, String color, int dinero) {
        culoare = color;
        pret = dinero;
        numeFruct = fruitName;

    }

    public void achizitioneaza() {
        System.out.println("Culoarea este : " + culoare + " si costa " + pret + " lei si este " + numeFruct);
    }
}
