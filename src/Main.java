public class Main {
    public static void main(String[] args){
     Employee[] employees = new Employee[10];
     Employee first = new Specialist("Steave Mark", 25, 3620.2, 5);
     Employee second = new Specialist("Amanda Jonson", 34, 5230.2, 3);
     Employee third = new Specialist("Marcus Jackson", 44, 56324.25, 4);
     Employee markZuckerberg = new Developer("Mark Zuckerberg", 36, 2000.5, "Middle");
     Employee billGates = new Developer("Bill Gates", 50, 5000.5, "First");
     Employee adaLovelace = new Developer("Ada Lovelace", 30, 3000.4, "Second");
     Employee dennisRitchie = new Developer("Dennis Ritchie", 30, 5500.4, "High");
     Employee aliceDjon = new Manager("Alice Djon", 20, 1000.5, true);
     Employee kennLary = new Manager("Kenn Lary", 50, 200.3, true);
     Employee alexaChack = new CEO("Alexsander Chack", 35, 5000.6, true);


     employees[0] = first;
     employees[1] = second;
     employees[2] = third;
     employees[3] = markZuckerberg;
     employees[4] = billGates;
     employees[5] = adaLovelace;
     employees[6] = dennisRitchie;
     employees[7] = aliceDjon;
     employees[8] = kennLary;
     employees[9] = alexaChack;
     for(Employee person: employees){
      person.goToVacation();
     }
    }
}
