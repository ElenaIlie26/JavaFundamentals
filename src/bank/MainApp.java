package bank;

public class MainApp {
    public static void main(String[] args) {
        // interact with ATM
        //1.Create a DebitCard object
        //2.Create an ATM machine (ATM object)
        //2.Send the DebitCard to the ATM to start the interaction

        // 1. create debit card
        DebitCard emptyCard = new DebitCard();
        DebitCard myCard = new DebitCard("ion", 225);
        System.out.println(myCard);
        System.out.println(emptyCard);

        // 2. create an ATM
        AtmMachine atmnou = new AtmMachine();

        // 3. insert card

        atmnou.insertCard(myCard);
    }
}
