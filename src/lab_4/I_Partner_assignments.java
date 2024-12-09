package lab_4;

import java.util.ArrayList;
import java.util.List;


class Employee {
    private final String name;
    private double salary;

    // Конструктор
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Метод отображения зарплаты
    public void displayInfo() {
        System.out.println("Employee: " + name + ", Salary: $" + salary);
    }
}

// Класс Manager
class Manager extends Employee {
    // Конструктор
    public Manager(String name, double salary) {
        super(name, salary);
    }

    // Метод для увеличения зарплаты
    public void increaseSalary(double percentage) {
        double newSalary = getSalary() * (1 + percentage / 100);
        setSalary(newSalary);
        System.out.println(getName() + "'s salary increased by " + percentage + "% to $" + getSalary());
    }
}

// Класс Intern
class Intern extends Employee {
    // Конструктор
    public Intern(String name, double salary) {
        super(name, salary);
    }

    // Метод обучения
    public void study() {
        System.out.println(getName() + " is studying hard.");
    }
}

// Класс Director
class Director extends Employee {
    // Конструктор
    public Director(String name, double salary) {
        super(name, salary);
    }

    // Метод принятия решений
    public void makeDecision(String decision) {
        System.out.println(getName() + " made a decision: " + decision);
    }
}

// Класс Company
class Company {
    private final List<Employee> employees;

    // Конструктор
    public Company() {
        employees = new ArrayList<>();
    }

    // Метод добавления сотрудника
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println(employee.getName() + " was added to the company.");
    }

    // Метод удаления сотрудника
    public void removeEmployee(String name) {
        employees.removeIf(employee -> employee.getName().equals(name));
        System.out.println("Employee " + name + " was removed from the company.");
    }

    // Подсчет сотрудников каждого типа
    public void countEmployees() {
        int managers = 0, interns = 0, directors = 0;

        for (Employee employee : employees) {
            if (employee instanceof Manager) managers++;
            else if (employee instanceof Intern) interns++;
            else if (employee instanceof Director) directors++;
        }

        System.out.println("Company has:");
        System.out.println("Managers: " + managers);
        System.out.println("Interns: " + interns);
        System.out.println("Directors: " + directors);
        System.out.println("Total employees: " + employees.size());
    }

    // Управление действиями сотрудников
    public void performActions() {
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager) employee).increaseSalary(10); // Увеличение зарплаты на 10%
            } else if (employee instanceof Intern) {
                ((Intern) employee).study();
            } else if (employee instanceof Director) {
                ((Director) employee).makeDecision("Expand the company");
            }
        }
    }

    // Вывод всей информации о сотрудниках
    public void displayAllEmployees() {
        System.out.println("Company Employees:");
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}

public class I_Partner_assignments {
    public static void main(String[] args) {
        // Создаем сотрудников
        Manager manager = new Manager("Alice", 5000);
        Intern intern = new Intern("Bob", 1500);
        Director director = new Director("Charlie", 10000);

        // Создаем компанию
        Company company = new Company();

        // Добавляем сотрудников
        company.addEmployee(manager);
        company.addEmployee(intern);
        company.addEmployee(director);

        // Вывод информации
        company.displayAllEmployees();

        // Выполнение действий
        company.performActions();

        // Подсчет сотрудников
        company.countEmployees();

        // Удаление сотрудника
        company.removeEmployee("Bob");

        // Вывод после удаления
        company.displayAllEmployees();
    }
}
