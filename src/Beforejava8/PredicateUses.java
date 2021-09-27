package Beforejava8;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public  class PredicateUses {
    public static boolean isPersonEligible(Student student, Predicate<Student> pre){
        return pre.test(student);
        //return student.getAge()>19;
    }
    public static void main(String[] args) {
        Student student=new Student("vishwa",99);
        Student student1=new Student("Abishek",9);
        Student student2=new Student("mohan",959);
        Student student3=new Student("Amit",989);
        Student student4=new Student("kirti",990);
        List<Student> students=new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        /**
         * FInd the list of the people who can drink in the bar
         */
        Predicate<Student>predicate=s->s.getAge()>19;
        System.out.println(isPersonEligible(student1,predicate));
        Predicate<Student>lowerAge=s-> s.getAge()>16;
        Predicate<Student>upperage=s->s.getAge()<21;
        Predicate<Student>predicateInsurence=lowerAge.and(upperage);
        System.out.println(isPersonEligible(student2,predicateInsurence));
        /**
         * Free care
         * age <16 or age >60
         */
        Predicate<Student>lowAge=s->s.getAge()<16;
        Predicate<Student>highAge=s->s.getAge()>60;
        Predicate<Student>FreeCarePredicate=lowAge.or(highAge);
        System.out.println(isPersonEligible(student1,FreeCarePredicate));
    }
    }


