package university;

public class Student{

    //Attribute
    private int matrikelNr;
    private String nachname;
    private String vorname;
    //alter bzw. Datum --> Date
    private String studiengang;
    private int semester;


    //Konstruktor(en)
    public Student(String vName, String nName){
        this.nachname = nName;
        this.vorname = vName;
    }

    public Student(int mNr, String nName, String vName, String sgang, int semester){
        this.matrikelNr = mNr;
        this.nachname = nName;
        this.vorname = vName;
        this.studiengang = sgang;
        this.semester = semester;

    }


    //Operationen
    public void printDetails(){
        System.out.println(this.matrikelNr);
        System.out.println(this.vorname);
        System.out.println(this.nachname);
        System.out.println(this.studiengang);
        System.out.println(this.semester);
    }

    public void setMatrikelNr(int mNr){
        if (mNr <1 || mNr > 10000){
            System.out.println("Keine gültige Matrikelnummer");
            return;
        }
        this.matrikelNr = mNr;
    }

    public int getMatrikelNr(){
        return this.matrikelNr;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }





}