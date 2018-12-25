public class Division{
	private ArrayList<Teacher> teacherList;
	Timetable timeTableref;

	public Division(ArrayList<Teacher> teacherList, timeTableref){
		this.teacherList = teacherList;
		this.timeTableref = timeTableref;
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
}