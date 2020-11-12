package oop.lab03.bank.interfaces;

import oop.lab03.bank.*;

public final class TestBankAccount {

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Mario Rossi con id 1
         */
        AccountHolder elviraVoccia = new AccountHolder("Elvira", "Voccia", 1);
        /*
         * 2) Creare l' AccountHolder relativo a Luigi Bianchi con id 2
         */
        AccountHolder gaiaNeri = new AccountHolder("Gaia", "Neri", 2);
        /*
         * 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
         * rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di Mario
         * Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount per il conto di
         * Luigi Bianchi (ammontare iniziale = 0)
         */
        BankAccount voccia = new SimpleBankAccount(elviraVoccia.getUserID(), 0);
        BankAccount neri = new StrictBankAccount(gaiaNeri.getUserID(), 0);
        /*
         * 4) Prima riflessione: perché è stato possibile fare la new di due classi
         * diverse in variabili dello stesso tipo? Perchè entrambi i tipi di conto fanno parte della 
         * interfaccia BankAccount
         */
        voccia.deposit(elviraVoccia.getUserID(), 10000);
        neri.deposit(gaiaNeri.getUserID(), 10000);
        /*
         * 5) Depositare €10000 in entrambi i conti
         */
        voccia.withdraw(elviraVoccia.getUserID(), 15000); //10000-15000, no controllo saldo
        neri.withdraw(gaiaNeri.getUserID(), 15000); //non viene eseguito il prelievo di soldi saldo insuff.
        /*
         * 6) Prelevare €15000 da entrambi i conti
         */
        System.out.println(voccia.getBalance()); //-5000 (withdraw), -5001 (withdraw atATM)
        System.out.println(neri.getBalance()); //10000
        /*
         * 7) Stampare in stdout l'ammontare corrente
         */
        /*
         * 8) Qual è il risultato e perché?
         */
        voccia.deposit(elviraVoccia.getUserID(), 10000); //10000-5001 = 4999
        neri.deposit(gaiaNeri.getUserID(), 10000); //20000
        /*
         * 9) Depositare nuovamente €10000 in entrambi i conti
         */
        voccia.chargeManagementFees(elviraVoccia.getUserID()); //non fa nulla
        neri.chargeManagementFees(gaiaNeri.getUserID()); //20000-5-(0.1*nTransaction)
        
        /*
         * 10) Invocare il metodo computeManagementFees su entrambi i conti
         */
        System.out.println(voccia.getTransactionsCount() + " transazioni " + "Bilancio:€" 
                            + voccia.getBalance());
        System.out.println(neri.getTransactionsCount() + " transazioni " + " Bilancio:€" + neri.getBalance());
        /*
         * 11) Stampare a video l'ammontare corrente
         */
        /*
         * 12) Qual è il risultato e perché?
         */

    }
}
