public class Division{
	private ArrayList<Subjects> subjectList;
	Timetable timeTableref;
	private String className;
	public HashMap<Subject,Teacher> subjectTeacher;
	public Division(Timetable timeTableref,HashMap<Subject,Teacher>){
		this.timeTableref = timeTableref;
		this.subjectTeacher = new HashMap<>();
		ArrayList<Subject> subjects = new ArrayList<>();
		subjects.add(new Subject("C Programming Language",125,5));
        subjects.add(new Subject("Java Programming language",150,6));
        subjects.add(new Subject("Data Structures",150,6));
        subjects.add(new Subject("Discrete Mathematics",125,6));
        subjects.add(new Subject("Computer Networks",100,4));
        subjects.add(new Subject("Python Programming Language",125,61));

        this.subjectList = subjects;
	}
	public Division( HashMap<Subject,Teacher>){
		ArrayList<Subject> subjects = new ArrayList<>();
		subjects.add(new Subject("C Programming Language",125,5));
		subjects.add(new Subject("Java Programming language",150,6));
		subjects.add(new Subject("Data Structures",150,6));
		subjects.add(new Subject("Discrete Mathematics",125,6));
		subjects.add(new Subject("Computer Networks",100,4));
		subjects.add(new Subject("Python Programming Language",125,61));

		this.subjectList = subjects;
		this.subjectTeacher = new HashMap<>();
	}

	public void setTeacherList(ArrayList<Teacher> teacherList){
		this.teacherList = teacherList;
	}
	public ArrayList<Teacher> getTeacherList(){
		return this.teacherList;
	}

	public void setTimeTableRef(Timetable timeTableref){
		this.timeTableref = timeTableref;	
	}

	public Timetable getTimeTableRef(){
		return this.timeTableref;
	}

	public void setClassName(String className){
		this.classname = className;
	}

	public String getClassNAme(){
		return this.className;
	}
}