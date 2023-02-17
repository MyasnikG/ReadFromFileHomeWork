package service;

import model.Student;

public class StudentService {


    public static Student[] convert(String [] infoFromFile){

        Student [] students = new Student [infoFromFile.length];
        for (int i = 0; i < infoFromFile.length; i++) {
            Student student = new Student(infoFromFile[i]);
            students[i] = student;
        }
        return students;
    }

    public static void sortByAge(String [] infoFromFile){
        Student [] students = StudentService.convert(infoFromFile);

        for (int i = 0; i < infoFromFile.length-1; i++) {
            for (int j = i+1; j < infoFromFile.length; j++) {
                if(students[i].getAge()<students[j].getAge()){
                    Student temp = students[j];
                    students[j]=students[i];
                    students[i]=temp;
                }
            }
        }

        for (int i = 0; i < students.length; i++) {
            students[i].studentPrint();
        }

        System.out.println();
        System.out.print("Oldest student: ");
        students[0].studentPrint();

    }
}
