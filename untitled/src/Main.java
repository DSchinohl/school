import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class student{

    String name, surname;
    ArrayList<Integer> grades = new ArrayList<>();

    public void adder(String nameEntered, String surnameEntered){

        this.name = nameEntered;
        this.surname = surnameEntered;

    }
    public void put(int enteredGrade){

        grades.add(enteredGrade);

    }

    public float getGrades(){
        float sumOfGRades = 0;
        int numberOfGrades = 0;
        for(int x : grades){
            sumOfGRades += x;
            numberOfGrades++;
        }
        return sumOfGRades/numberOfGrades;
    }
}

public class Main {
    public static void main(String[] args) {

        HashMap<String, ArrayList<student>> studentsClass = new HashMap<>();
        ArrayList<student> studentArrayList = new ArrayList<>();

        student ID = new student();
        student ID1 = new student();
        student ID2 = new student();

        ID.name = "Jack";
        ID.surname = "Smith";
        ID.put(3);
        ID.put(5);
        ID.put(6);

        ID1.name = "John";
        ID1.surname = "Doe";
        ID1.put(4);

        ID2.name = "Andrew";
        ID2.surname = "Black";
        ID2.put(4);

        studentArrayList.add(ID);
        studentArrayList.add(ID1);
        studentArrayList.add(ID2);

        studentsClass.put("5T",studentArrayList);

        ArrayList<student> name = studentsClass.get("5T");

        System.out.println("5T\n");
        for(student students : name){
            System.out.println(students.name +" "+students.getGrades());
        }
    }
}