package oop.lab03.acme;

public final class Testing {

    private Testing() { }

    public static void main(final String[] args) {
        /*
         * 1) Creare 3 studenti a piacere 2) Creare 2 docenti a piacere 3)
         * Creare due aulee di esame, una con 100 posti una con 80 posti 4)
         * Creare due esami, uno con nMaxStudents=10, l'altro con nMaxStudents=2
         * 5) Iscrivere tutti e 3 gli studenti agli esami 6) Stampare in stdout
         * la rapresentazione in stringa dei due esami
         */
        final Student elvira = new Student(906990, "Elvira", "Sboccia", "Eskere", 2019);
        final Student eva = new Student(901109, "Eva", "Alpi", "GinnasticaFelice", 2018);
        final Student manuel = new Student(696969, "Manuel", "Frabbo", "Nonlaindovinerai", 2010);

        final Professor alessandro = new Professor(10390, "Alessandro", "Magno", "Pssword1234!!",
                                new String[] {"Storia orientale", "Storia info", "Storia Mondiale"});
        final Professor federico = new Professor(10380, "Fedez", "Lucia", "ChiaraLeone",
                                new String[] {"History of P.C.", "Programmazione", "Italiano"});

        final ExamRoom room2 = new ExamRoom(100, "Aula Magna", true, false);
        final ExamRoom room5 = new ExamRoom(80, "Laboratorio", true, true);
        
        final Exam appello1 = new Exam(1560, 10, "Scienze Info", alessandro, room2);
        final Exam appello2 = new Exam(1560, 2, "Biologia", federico, room5);

        appello1.registerStudent(elvira);
        appello1.registerStudent(eva);
        appello1.registerStudent(manuel);

        appello2.registerStudent(elvira);
        appello2.registerStudent(eva);
        appello2.registerStudent(manuel);
        
        System.out.println(appello1.toString());
        System.out.println(appello2.toString());
        

    }
}
