package bank;

import java.util.Scanner;

public class AtmMachine {
    // Should have the following
    //1. A method for accepting a debit card object - this will start the user interaction
    //2. During the interaction, accept the following actions:
    //2.1. Check PIN code
    //2.2 Check current balance ( amount of money/int/double)
    //2.3 Take out money(decrease balance)
    //2.4. Add money (increase money)

    //2.5. Optional action - also ask "Do you want to perform another action?"
    public void insertCard(DebitCard card) {
        // atm.insertCard(myCard), echivalent cu o initializare in functia de aici
        // DebitCard card = myCard;
        boolean isValid = checkPinCode(card);
        if (isValid) {
            System.out.println("Codul PIN introdus este corect");
            selectAction(card);
        } else {
            System.out.println("Introduceti un nou cod PIN");
        }
    }

    private void selectAction(DebitCard card) {
        System.out.println("Alegeti una din urmatoarele actiuni: ");
        System.out.println("1 - Retragere Numerar");
        System.out.println("2 - Consultare Debit");
        System.out.println("3 - Depunere Numerar");

        Scanner scanner = new Scanner(System.in);
        int actiune = scanner.nextInt();
        switch (actiune) {
            case 1:
                retrageNumerar(card);
                break;
            case 2:
                consultareDebit(card);
                break;
            case 3:
                depunereNumerar(card);
                break;
            default:
                System.out.println("Optiune invalida");
        }
    }

    private void depunereNumerar(DebitCard card) {
        System.out.println("Depunem numerar");
    }

    private void consultareDebit(DebitCard card) {
        System.out.println("Consultam debitul");
    }

    private void retrageNumerar(DebitCard card) {
        System.out.println("Retragem numerar");
    }

    private boolean checkPinCode(DebitCard card) {
        System.out.println("Introduceti cod PIN = ");
        Scanner scanner = new Scanner(System.in);
        int codPin = scanner.nextInt();
        return codPin == card.cod;

    }


}

