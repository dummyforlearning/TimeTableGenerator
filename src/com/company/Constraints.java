public class Constraints{
    private String constraintName;
    public Constraints(String constraintName){

        this.constraintName= constraintName;
        initComponents();

    }
    private void initComponents(){
        Subject c = new Subject("C Programming Language",125,5);
        Subject java = new Subject("Java Programming language",150,6);
        Subject das = new Subject("Data Structures",150,6);
        Subject dis = new Subject("Discrete Mathematics",125,6);
        Subject cn = new Subject("Computer Networks",100,4);
        Subject python = new Subject("Python Programming Language",125,61);
        Subject sel = new Subject("Skill Enhancement Lecture");


        private static ArrayList<Subject> subject = new ArrayList<>();

        subject.add(c);
        subject.add(java);
        subject.add(das);
        subject.add(dis);
        Teacher lifna = new Teacher(subject,1,"Lifna","8:10");

        subject = new ArrayList<>();
        subject.add(cn);
        Teacher kanade = new Kanade(subject,2,"Kanade","8:10");

        subject = new ArrayList<>();
        subject.add(java);
        subject.add(python);
        subject.add(das);
        Teacher abha = new Teacher(subject,3,"Abha","10:10");

        subject = new ArrayList<>();
        subject.add(java);
        subject.add(python);
        Teacher pooja = new Teacher(subject,4,"Pooja","10:10");

        subject = new ArrayList<>();
        subject.add(java);
        Teacher nupur = new Teacher(subject,5,"Nupur","11:25");

        subject = new ArrayList<>();
        subject.add(dis);
        subject.add(cn);
        subject.add(c);
        Teacher richard = new Teacher(subject,6,"Richard","10:10");




    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    private lectureAllocation(){



    }
}