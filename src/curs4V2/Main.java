package curs4V2;

public class Main {
    public static void main(String[] args) {

        Client abc = new Client(3000, "Dan");
//        System.out.println(abc.nume);
//        abc.cumpara();
        Fruct banana = new Fruct("Banana", "galbena", 5);
//        System.out.println(banana.culoare);
//        System.out.println(banana.pret);
        banana.achizitioneaza();

        abc.cumparaFruct(banana);


    }

}
