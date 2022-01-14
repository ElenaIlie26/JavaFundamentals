package curs4V2;

public class Client {

    //fields
    private int sumaDeBani;
    public String nume;

    // constructor
    public Client(int bani, String numeClient) {
        sumaDeBani = bani;
        nume = numeClient;

    }

    public void cumpara() {
        //scriem ce trebuie sa faca metoda nostra
        System.out.println("Clientul: " + nume + " a cumparat");
    }

    public void cumparaFruct(Fruct frcutDeCumparat) {
        System.out.println("Clientul: " + nume + " a cumparat fructul " + frcutDeCumparat.numeFruct);

    }


}
