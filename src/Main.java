import java.util.Scanner;

class Main {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student st1 = new Student(18, "Беляев Никита Александрович", 856432, 2, "Программист", 2024);
        Student st2 = new Student(17, "Солиев Данила Денисович", 646235, 2, "Автомеханик", 2026);
        Student st3 = new Student(17, "Рашевский Даниил Юрьевич", 657536, 17, "Вор", 2008);

        Student[] st = {st1, st2, st3};
        System.out.println("ФИО и возраст всех студентов: ");
        for (Student student : st) {
            System.out.println(student.FIO + " " + student.getAge());
        }
        System.out.print("Введите факультет: ");
        String fact = scan.next();
        for (Student f : st) {
            if (f.faculty.equals(fact)) {
                System.out.println(f.FIO);
            }
        }
        System.out.println("Введите год поступления: ");
        int age = scan.nextInt();
        for (Student a : st) {
            if (a.getDate() > age) {
                System.out.println(a.FIO);
            }
        }
    }
}

class Person {
    private int age;
    public String FIO;
    public int number;

    public Person(int age, String FIO, int number) {
        this.age = age;
        this.FIO = FIO;
        this.number = number;
    }

    public int getAge() {
        return this.age;
    }
}

class Student extends Person {
    public int course;
    public String faculty;
    private int date;

    public Student(int age, String FIO, int number, int course, String faculty, int date) {
        super(age, FIO, number);
        this.course = course;
        this.faculty = faculty;
        this.date = date;
    }

    public int getDate() {
        return this.date;
    }
}