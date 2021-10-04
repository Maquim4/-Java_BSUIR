import java.util.Scanner;

class Student {
    public String id, patronymic, name, surName, address, number, faculty;
    int dateOfBirthDay, dateOfBirthMonth, dateOfBirthYear;
    public int course, group;

    public Student() {
    }

    public void create() {
        Scanner sc;
        System.out.print("введите имя: ");
        sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            name = sc.nextLine();
        }
        System.out.print("введите отчество: ");
        sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            patronymic = sc.nextLine();
        }
        System.out.print("введите фамилию: ");
        sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            surName = sc.nextLine();
        }
//        System.out.println("___введите день рождения___");
//        System.out.print("день: ");
//        sc = new Scanner(System.in);
//        while (!sc.hasNextInt()) {
//            System.out.println("введите целое число");
//            sc.next();
//        }
//        dateOfBirthDay  = sc.nextInt();
//        System.out.print("месяц: ");
//        sc = new Scanner(System.in);
//        while (!sc.hasNextInt()) {
//            System.out.println("введите целое число");
//            sc.next();
//        }
//        dateOfBirthMonth  = sc.nextInt();
        System.out.print("год: ");
        sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("введите целое число");
            sc.next();
        }
        dateOfBirthYear  = sc.nextInt();
//
//        System.out.print("введите адрес: ");
//        sc = new Scanner(System.in);
//        if (sc.hasNextLine()) {
//            address = sc.nextLine();
//        }
//        System.out.print("введите номер телефона: ");
//        sc = new Scanner(System.in);
//        if (sc.hasNextLine()) {
//            number = sc.nextLine();
//        }
        System.out.print("введите факультет: ");
        sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            faculty = sc.nextLine();
        }
        System.out.print("введите номер курса: ");
        sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("введите целое число");
            sc.next();
        }
        course  = sc.nextInt();
        System.out.print("введите номер группы: ");
        while (!sc.hasNextInt()) {
            System.out.println("введите целое число");
            sc.next();
        }
        group  = sc.nextInt();
        int randomNum = (int) (Math.random() * 2001) - 1000;
        id = randomNum + surName + group;
    }

    public void show() {
        System.out.printf("%5s %30s %20s %20s %5s %10s %10s",
                id, name, surName, faculty, course, group, dateOfBirthYear);
        System.out.println('\n');
    }

    public static Student[] createMas(int n) {
        Student[] mas = new Student[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = new Student();
            mas[i].create();
        }
        return mas;
    }

    public static void showFaculty(Student[] mas, String faculty) {
        System.out.printf("%5s %30s %20s %20s %5s %10s %10s",
                "id", "Имя", "Фамилия", "Факультет", "Курс", "Группа", "Год рождения");
        System.out.println('\n');
        for (Student ma : mas) {
            if (ma.faculty.equals(faculty)) {
                ma.show();
            }
        }
    }
    public static void showFacultyCourse(Student[] mas, String faculty, int course) {
        System.out.printf("%5s %30s %20s %20s %5s %10s %10s",
                "id", "Имя", "Фамилия", "Факультет", "Курс", "Группа", "Год рождения");
        System.out.println('\n');

        for (Student ma : mas) {
            if (ma.faculty.equals(faculty) && ma.course == course) {
                ma.show();
            }
        }
    }
    public static void showDB(Student[] mas, int year) {
        System.out.printf("%5s %30s %20s %20s %5s %10s %10s",
                "id", "Имя", "Фамилия", "Факультет", "Курс", "Группа", "Год рождения");
        System.out.println('\n');

        for (Student ma : mas) {
            if (ma.dateOfBirthYear > year) {
                ma.show();
            }
        }
    }
    public static void showAllGroup(Student[] mas, int group) {
        System.out.printf("%5s %30s %20s %20s %5s %10s %10s",
                "id", "Имя", "Фамилия", "Факультет", "Курс", "Группа", "Год рождения");
        System.out.println('\n');

        for (Student ma : mas) {
            if (ma.group == group) {
                ma.show();
            }
        }
    }
}

public class ex1 {
    public static void main(String[] args) {
        Student[] mas = Student.createMas(2);
        Scanner sc;
        String faculty;
        int course;
        int year;
        int group;
        boolean exit = false;
        while (!exit) {
            System.out.println("Выбирите, что хотите вывести:");
            System.out.println("1) список студентов заданного факультета;");
            System.out.println("2) списки студентов для каждого факультета и курса;");
            System.out.println("3) список студентов, родившихся после заданного года;");
            System.out.println("4) список учебной группы.");
            System.out.println("5) выход");
            sc = new Scanner(System.in);
            while (!sc.hasNextInt()) {
                System.out.println("Введите номер желаемого вывода");
                sc.next();
            }
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Введите желаемый факультет");
                    sc = new Scanner(System.in);
                    if (sc.hasNextLine()) {
                        faculty = sc.nextLine();
                        Student.showFaculty(mas, faculty);
                    }
                    break;
                case 2:
                    System.out.println("Введите желаемый факультет");
                    sc = new Scanner(System.in);
                    if (sc.hasNextLine()) {
                        faculty = sc.nextLine();
                        System.out.println("Введите желаемый курс");
                        sc = new Scanner(System.in);
                        while (!sc.hasNextInt()) {
                            System.out.println("введите целое число");
                            sc.next();
                        }
                        course = sc.nextInt();
                        Student.showFacultyCourse(mas, faculty, course);
                    }
                    break;
                case 3:
                    System.out.print("Введите желаемый год: ");
                    sc = new Scanner(System.in);
                    while (!sc.hasNextInt()) {
                        System.out.println("введите целое число");
                        sc.next();
                    }
                    year = sc.nextInt();
                    Student.showDB(mas, year);
                    break;
                case 4:
                    System.out.print("Введите желаемую группу: ");
                    sc = new Scanner(System.in);
                    while (!sc.hasNextInt()) {
                        System.out.println("введите целое число");
                        sc.next();
                    }
                    group = sc.nextInt();
                    Student.showAllGroup(mas, group);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Вы точно ввели верное число?");
                    break;

            }
        }
    }
}
