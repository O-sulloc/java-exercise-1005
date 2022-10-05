package week3.day2.collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {

    private List<String> students = new ArrayList<>(); //list 구현시 arraylist를 많이 사용한다.
    private List<Student> studentObjs = new ArrayList<>();

    public LikeLion2th(){
        Names names = new Names();
        this.students = names.names();
        this.studentObjs = names.getStudentObjs();
    }

    //멋사 2기 학생의 이름이 들어있는 list를 리턴하는 메서드
    public List<String> getStudentList() {
        return this.students;
    }

    public List<Student> getStudentObjs(){
        return this.studentObjs;
    }
}
