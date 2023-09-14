package geek_java_oop_lesson3;

public class Freelancer extends Employee {
    private int hoursWorked; // отработанные часы
    private double hourlyRate; // почасовая ставка

    public Freelancer(String name, String surName, double hourlyRate, int hoursWorked, int age) {
        super(name, surName, hourlyRate * hoursWorked, age); // общая заработная плата за месяц
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата (по часам) %.2f",
                surName, name, salary);
    }
}
