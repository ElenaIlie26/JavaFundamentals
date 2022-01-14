package bank;

public class DebitCard {
    //properties:
    //1. Card own No.
    //2. a PIN code

    String nume;
    Integer cod;

    public DebitCard (String numeUtilizator, Integer codPin){
        nume = numeUtilizator;
        cod = codPin;
    }

    public DebitCard(){

    }

    // overwrite toString to change the print behavior.
    public String toString(){
        return "DebitCard {Numele este " + nume + " si codul pin este " + cod + "}";
    }

}
