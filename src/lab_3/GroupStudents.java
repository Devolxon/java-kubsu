package lab_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GroupStudents {
    private int groupId;              // Уникальный номер группы
    private List<Students> students;  // Массив объектов Students

    // Конструктор по умолчанию
    public GroupStudents() {
        this.students = new ArrayList<>();
    }

    // Конструктор, принимающий массив объектов
    public GroupStudents(List<Students> students) {
        this.students = new ArrayList<>(students);
    }

    // Геттеры и сеттеры
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    // Добавление объекта в массив
    public void addStudent(Students student) {
        this.students.add(student);
    }

    // Удаление объекта из массива по ID студента
    public void removeStudentById(int idStudenta) {
        this.students.removeIf(student -> student.getIdStudenta() == idStudenta);
    }

    // Сортировка массива по фамилии (по возрастанию)
    public void sortStudentsByFam() {
        this.students.sort(Comparator.comparing(Students::getFam));
    }

    // Печать всех студентов
    public void printStudents() {
        for (Students student : students) {
            System.out.println(student);
        }
    }
}