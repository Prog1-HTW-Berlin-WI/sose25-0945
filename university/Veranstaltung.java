package university;

public class Veranstaltung {
    //Attribute
    String name;
    String ort;
    int maxTeilnehmerAnzahl;
    Dozent dozent;
    Student[] students;


    //Konstruktor(en)
    public Veranstaltung(String na, String o, int tAnz, Dozent doz){
        this.name = na;
        this.ort = o;
        this.maxTeilnehmerAnzahl = tAnz;
        this.dozent = doz;
        this.students = new Student[maxTeilnehmerAnzahl];
    }

    //Operation(en)

    public void einschreiben(Student student){
        for (int i = 0; i < students.length; i++){
            if (students[i] == null){
                students[i] = student;
                break;
            }
        }

    }

    public void printTeilnehmer(){
        for (Student student : students){
            System.out.println(student);
        }
    }
    
}
