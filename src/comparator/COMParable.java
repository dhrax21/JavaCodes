package comparator;

import Extra.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class COMParable implements Comparable<Student>{

//    Student s1=new Student(30,"yogi");
//    Student s2=new Student(34,"dhrax");
//    Student s3=new Student(10,"aman");
//    Student s4=new Student(22,"arvind");
//    Student s5=new Student(10,"abar");
//
//
//    List<Student> list=new ArrayList<>();
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        list.add(s4);
//        list.add(s5);
//
//        Collections.sort(list, new Comparator<Student>() {
//        @Override
//        public int compare(Student o1, Student o2) {
//            if(o1.getMarks()==o2.getMarks()){
//                return o1.getName().compareTo(o2.getName());
//            }else {
//                return o1.getMarks()-o2.getMarks();
//            }
//        }
//    });
//
//        for(Student st : list){
//        System.out.println(st.getName());

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}

