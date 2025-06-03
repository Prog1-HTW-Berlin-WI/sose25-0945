package university;

public class UniversityApp {

    public static void main(String[] args) {

        Student brian = new Student("Brian", "Miller");
        Student lusy = new Student("Lusy", "Teller");
        Professor maj = new Professor();
        maj.nachname = "Majuntke";
        
        Lehrbeauftragter gaertner = new Lehrbeauftragter();
        gaertner.nachname = "Gaertner";
        
        Veranstaltung prog1 = new Veranstaltung("Prog1", "A219", 170, maj);
        
        prog1.einschreiben(brian);
       
        prog1.einschreiben(lusy);
        prog1.printTeilnehmer();
        

       



        
        
    }
    
}
