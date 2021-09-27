package Beforejava8;

import java.util.*;

public class LambdaExpression {
    public static void main(String[] args) {
        Student student=new Student("vishwa",99);
        Student student1=new Student("Abishek",9);
        Student student2=new Student("mohan",959);
        Student student3=new Student("Amit",989);
        Student student4=new Student("kirti",990);
        List<Student>students=new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        Collections.sort(students,(s1,s2)->s1.getName().compareTo(s2.getName()));
       for(Student std:students){
           System.out.println(std);
       }
    }
}
class Student{
    private String name;
    private int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
