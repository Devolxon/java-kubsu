package lab_3;

public class Students {
    private int idStudenta;       // Номер зачетной книжки
    private String fam;           // Фамилия
    private String name;          // Имя
    private String groupa;        // Группа
    private String department;    // Кафедра
    private String discipline;    // Дисциплина
    private double mark;          // Оценка
    private String nameTeacher;   // Фамилия преподавателя

    // Конструктор
    public Students(int idStudenta, String fam, String name, String groupa, String department, String discipline, double mark, String nameTeacher) {
        this.idStudenta = idStudenta;
        this.fam = fam;
        this.name = name;
        this.groupa = groupa;
        this.department = department;
        this.discipline = discipline;
        this.mark = mark;
        this.nameTeacher = nameTeacher;
    }

    // Геттеры и сеттеры
    public int getIdStudenta() {
        return idStudenta;
    }

    public void setIdStudenta(int idStudenta) {
        this.idStudenta = idStudenta;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupa() {
        return groupa;
    }

    public void setGroupa(String groupa) {
        this.groupa = groupa;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    // Перекрытый метод toString()
    @Override
    public String toString() {
        return String.format(
                "ID студента: %d\nФамилия: %s\nИмя: %s\nГруппа: %s\nКафедра: %s\nДисциплина: %s\nОценка: %.2f\nПреподаватель: %s\n",
                idStudenta, fam, name, groupa, department, discipline, mark, nameTeacher
        );
    }
}