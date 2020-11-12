package oop.lab03.bank;

//import oop.lab03.encapsulation.AccountHolder;

public final class TestSimpleBankAccount {

    private TestSimpleBankAccount() { }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Mario Rossi con id 1 2) Creare
         * l' AccountHolder relativo a Luigi Bianchi con id 2 3) Creare i due
         * SimpleBankAccount corrispondenti 4) Effettuare una serie di depositi e
         * prelievi 5) Stampare a video l'ammontare dei due conti e verificare
         * la correttezza del risultato 6) Provare a prelevare fornendo un idUsr
         * sbagliato 7) Controllare nuovamente l'ammontare
         */
        SimpleBankAccount marioRossi = new SimpleBankAccount(12, 1000.50);
        marioRossi.deposit(13, 30);
        System.out.println(marioRossi.getBalance());
        marioRossi.depositFromATM(12, 40);
        marioRossi.withdrawFromATM(12, 39.0);
        System.out.println(marioRossi.getBalance());
        System.out.println(marioRossi.getTransactionsCount());
    }
}
