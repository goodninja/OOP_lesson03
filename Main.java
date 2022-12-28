// 1. Класс Группа содержит в себе коллекцию Студентов.
// По группе можно перемещаться с помощью итератора. (Это повторяет 1-ю задачу из классной работы).
// Остальные задачи надстраиваются поверх неё.
// 2. Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях.
// Он реализует интерфейс ListIterator<Student>.
// Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.
// 3. Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
// • Он отслеживает текущую позицию в переборе
// • Он изначально выставлен на конечную позицию
// • Он движется справа налево
// Проверьте, как он работает.

package Lesson03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>(Arrays.asList(
                new Student(100, "Аркадьев Аркадий", "30.05.1996", 4.3f),
                new Student(101, "Мишина Маша", "22.12.1995", 4.2f),
                new Student(102, "Пашин Паша", "14.05.1998", 4.8f),
                new Student(103, "Аннова Анна", "26.08.1996", 4.7f),
                new Student(104, "Васильев Василий", "10.10.1997", 3.9f)));

        StudentGroupList studentGroup = new StudentGroupList(list);

        System.out.println("************");
        System.out.println("Test StudentGroupIterator => ");
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("************");
        System.out.println("Test GroupListIterator => ");
        System.out.println("Backward -> ");
        Iterator<Student> listIteratorPrevious = studentGroup.listIterator(2);
        while (((ListIterator<Student>) listIteratorPrevious).hasPrevious()) {
            System.out.println(((ListIterator<Student>) listIteratorPrevious).previous());
        }
        System.out.println("Forward -> ");
        Iterator<Student> listIteratorNext = studentGroup.listIterator(2);
        while (((ListIterator<Student>) listIteratorNext).hasNext()) {
            System.out.println(((ListIterator<Student>) listIteratorNext).next());
        }

        System.out.println("************");
        System.out.println("Test ReverseIterator => ");
        Iterator<Student> reverseIterator = studentGroup.reverseIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

    }

}