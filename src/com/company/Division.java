package com.company;
import com.company.Subject;
import com.company.Teacher;
import com.company.TimeTable;

import java.util.ArrayList;
import java.util.HashMap;

public class Division{
	public ArrayList<Subject> subjectList;
	TimeTable timeTableref;
	private String className;
	public HashMap<Subject, Teacher> subjectTeacher;
	public Division(TimeTable timeTableref,HashMap<Subject,Teacher> subjectTeacher){
		this.timeTableref = timeTableref;
		this.subjectTeacher = subjectTeacher;
		ArrayList<Subject> subjects = new ArrayList<>();
		subjects.add(new Subject("C Programming Language",125,5));
        subjects.add(new Subject("Java Programming language",150,6));
        subjects.add(new Subject("Data Structures",150,6));
        subjects.add(new Subject("Discrete Mathematics",125,6));
        subjects.add(new Subject("Computer Networks",100,4));
        subjects.add(new Subject("Python Programming Language",125,61));

        this.subjectList = subjects;
	}
	public Division( HashMap<Subject,Teacher> subjectTeacher){
		ArrayList<Subject> subjects = new ArrayList<>();
		subjects.add(new Subject("C Programming Language",125,5));
		subjects.add(new Subject("Java Programming language",150,6));
		subjects.add(new Subject("Data Structures",150,6));
		subjects.add(new Subject("Discrete Mathematics",125,6));
		subjects.add(new Subject("Computer Networks",100,4));
		subjects.add(new Subject("Python Programming Language",125,61));

		this.subjectList = subjects;
		this.subjectTeacher = subjectTeacher;
	}

	public void setsubjectList(ArrayList<Subject> subjectList){
		this.subjectList = subjectList;
	}
	public ArrayList<Subject> getsubjectList(){
		return this.subjectList;
	}

	public void setTimeTableRef(TimeTable timeTableref){
		this.timeTableref = timeTableref;	
	}

	public TimeTable getTimeTableRef(){
		return this.timeTableref;
	}

	public void setClassName(String className){
		this.className = className;
	}

	public String getClassNAme(){
		return this.className;
	}
}