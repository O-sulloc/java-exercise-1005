package week3.day2.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        List<String> students = likeLion2th.getStudentList();
        List<Student> studentObjs = likeLion2th.getStudentObjs();

        //for each문이랑 깥은거.. iter쓰면 바로 자동완성뜸 대박이다.
        for(String student:students){
            System.out.println(student);
        }

        // list에 몇 개 들억아ㅣㅆ는지 세기.
        System.out.println(students.size());

    }
}
