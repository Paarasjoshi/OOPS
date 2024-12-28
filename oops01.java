// creating a class and a object
//class is a named group of properties and functions
//object is an instance of the class, class is not a real world entity, it is just a structure of that entity
//object is a real wold entity

public class oops01 {
    public static void main(String[] args) {
        Student paras = new Student();
        paras.name = "Paras";
        paras.rollno = 1;
        paras.rollno = 1;
        Student Rahul = new Student();
// dot operator ( . ) = it is used to link reference variable to the instance variable
//reference variable = name of the object eg: paras ; Rahuk
//instance variable = name of the variable inside the class eg: name , rollno
        System.err.println(paras.name);
        Rahul.name="rahul";
        System.out.println(Rahul.name);
    }
    static class Student{
        int rollno;
        String name;
    }
}
