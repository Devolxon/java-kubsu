package lab_3;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Students student1 = new Students(1, "Иванов", "Иван", "Группа1", "Крутая", "Математика", 4.5, "Петров");
        Students student2 = new Students(2, "Петрова", "Мария", "Группа1", "Для умных", "Физика", 5.0, "Сидоров");
        Students student3 = new Students(3, "Сидоров", "Алексей", "Группа1", "Ботаны", "Информатика", 3.8, "Иванов");

        // Используем ArrayList для изменяемого списка
        List<Students> students = new ArrayList<>(Arrays.asList(student1, student2, student3));
        GroupStudents group = new GroupStudents(students);

        // Удаление студента по ID
        group.removeStudentById(1);

        // Печать оставшихся студентов
        System.out.println("Список студентов после удаления:");
        group.printStudents();
    }
}