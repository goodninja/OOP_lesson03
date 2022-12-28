package Lesson03;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {

    protected int index = 0;
    private StudentGroupList studentGroupList;

    public StudentGroupIterator(StudentGroupList studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.studentGroupList.sizeStudentList();
    }

    @Override
    public Student next() {
        return Student.nextStudent(index++);
    }

}