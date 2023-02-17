package model;

public class Student {

    private String name;
    private int age;


    public Student(String fullName){
        String [] splitString = fullName.split("-");
        name = splitString[0];
        age=Integer.parseInt(splitString[1]);
    }


    public void studentPrint(){
        System.out.println("Student name: " + name + ", Student age: " + age);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
