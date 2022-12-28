package Lesson03;

public class ReverseIterator extends StudentGroupIterator {

    public ReverseIterator(StudentGroupList studentGroup) {
        super(studentGroup);
        index = studentGroup.sizeStudentList() - 1;
    }

    public boolean hasNext() {
        return index > - 1;
    }

    public Student next() {
        return Student.nextStudent(index--);
    }

}