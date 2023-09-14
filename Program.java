package geek_java_oop_lesson3;

import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();

    public static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salaryIndex = random.nextInt(200, 500);
        int age = random.nextInt(18, 65);  // случайная генерация возраста

        // Случайная генерация либо "Worker", либо "Freelancer"
        if (random.nextBoolean()) {
            return new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], 100 * salaryIndex, age);
        } else {
            return new Freelancer(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], random.nextDouble() * 100, random.nextInt(160), age);
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        System.out.println("Неотсортированный список:");
        for (Employee employee : employees) {
            System.out.println(employee + " - Возраст: " + employee.age);
        }

        Arrays.sort(employees, new AgeComparator());

        System.out.println("Отсортированный по возрасту список:");
        for (Employee employee : employees) {
            System.out.println(employee + " - Возраст: " + employee.age);
        }
    }
}
