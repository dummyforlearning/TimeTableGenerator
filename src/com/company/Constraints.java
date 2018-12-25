package com.company;
import com.company.Subject;
import com.company.Teacher;

import java.util.ArrayList;
import java.util.HashMap;

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


        ArrayList<Subject> subject = new ArrayList<>();

        subject.add(c);
        subject.add(java);
        subject.add(das);
        subject.add(dis);
        Teacher lifna = new Teacher(subject,1,"Lifna","8:10");

        subject = new ArrayList<>();
        subject.add(cn);
        Teacher kanade = new Teacher(subject,2,"Kanade","8:10");

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

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(lifna);
        teachers.add(kanade);
        teachers.add(abha);
        teachers.add(pooja);
        teachers.add(nupur);
        teachers.add(richard);

        HashMap<Subject,Teacher> subjectTeacher = new HashMap<>();
        subjectTeacher.put(c,null);
        subjectTeacher.put(java,null);
        subjectTeacher.put(das,null);
        subjectTeacher.put(dis,null);
        subjectTeacher.put(cn,null);
        subjectTeacher.put(python,null);

        Division classA = new Division(subjectTeacher);
        System.out.println(classA.subjectList.get(0));

    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }


}