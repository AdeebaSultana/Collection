package com.collection.oracle;



import java.util.*;

public class Collection {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<String>();

        strings.add("Adeeba");
        strings.add("Adeeba");

        System.out.println("List = "+strings);

        Set<String> strings2 = new HashSet<String>();

        Set<Student> students = new HashSet<Student>();

        List<Student> strings1 = new ArrayList<Student>();

        Student student = new Student("Adeeba", 1, "Math", 2000);
        Student student1 = new Student("Adizaan", 2, "Science", 1998);
        Student student2 = new Student("Faizaan", 3, "Social", 1996);

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);

        students.add(student);
        students.add(student1);
        students.add(student2);

        strings1.add(student);
        strings1.add(student1);
        strings1.add(student2);

        System.out.println("strings1 = "+strings1);
        System.out.println(students);

        strings2.add("Adeeba");
        strings2.add("Adizaan");
        strings2.add("Faizaan");

        System.out.println("Set = "+strings2);

        System.out.println("Set = "+strings1);

        Map<String, Student> map = new HashMap<String, Student>();

        map.put("Faizaan",student2);
        map.put("Adeeba", student);

        System.out.println(map.get("Adizaan"));
        System.out.println(map);
    }
}

