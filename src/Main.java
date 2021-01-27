public class Main {
    public static void main(String[] args){
     Specialist first = new Specialist("Steave Mark", 25, 3620.2, 5);
     Specialist second = new Specialist("Amanda Jonson", 34, 5230.2, 3);
     Specialist third = new Specialist("Marcus Jackson", 44, 56324.25, 4);

     Developer markZuckerberg = new Developer("Mark Zuckerberg", 36, 2000.5, "Middle");
     Developer billGates = new Developer("Bill Gates", 50, 5000.5, "First");
     Developer adaLovelace = new Developer("Ada Lovelace", 30, 3000.4, "Second");
     Developer dennisRitchie = new Developer("Dennis Ritchie", 30, 5500.4, "High");
     Developer jamesGosling  = new Developer("James Gosling ", 65, 6000.5, "High");
     Manager aliceDjon = new Manager("Alice Djon", 20, 1000.5, true);
     Manager kennLary = new Manager("Kenn Lary", 50, 200.3, true);

     CEO alexaChack = new CEO("Alexsander Chack", 35, 5000.6, true);

     first.print();
     first.workWithClients();
     second.print();
     second.workWithClients();
     third.print();
     third.workWithClients();
     markZuckerberg.print();
     billGates.print();
     adaLovelace.print();
     dennisRitchie.print();
     aliceDjon.writeProcedures();
     aliceDjon.print();
     kennLary.writeProcedures();
     kennLary.print();
     alexaChack.isHasCompanyCar();
     alexaChack.print();
     jamesGosling.print();
    jamesGosling.quoteGosling();
    }
}
