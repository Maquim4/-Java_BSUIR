import java.util.Scanner;

public class Student {
    private int id, phoneNumber, course, group, dateOfBorn;
    private String lastName, name, middleName, address, faculty;

    public Student(int id, String name, String lastName, String middleName, int dateOfBorn, String address, int phoneNumber, String faculty, int course, int group) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBorn = dateOfBorn;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student() {
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setDateOfBorn(int dateOfBorn) {
        this.dateOfBorn = dateOfBorn;
    }

    public int getDateOfBorn() {
        return dateOfBorn;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    public static String toString(Student stud) {
        return "Student\n id = " + stud.id + "\n Group = " + stud.group + " Course = " + stud.course + "\n Name = " + stud.name + " Last Name = " + stud.lastName + " Middle Name = " + stud.middleName
                + "\n Date = " + stud.dateOfBorn + "\n Address = " + stud.address + "\n Phone = " + stud.phoneNumber + "\n Faculty = " + stud.faculty ;
    }

    @Override //переопределенный метод toString
    public String toString() {
        return "Student\n id = " + id + "\n Group = " + group + " Course = " + course + "\n Name = " + name + " Last Name = " + lastName + " Middle Name = " + middleName
                + "\n Date = " + dateOfBorn + "\n Address = " + address + "\n Phone = " + phoneNumber + "\n Faculty = " + faculty ;
    }

    public void show() {
        System.out.println("Student\n id = " + id + "\n Group = " + group + " Course = " + course + "\n Name = " + name + " Last Name = " + lastName + " Middle Name = " + middleName
                + "\n Date = " + dateOfBorn + "\n Address = " + address + "\n Phone = " + phoneNumber + "\n Faculty = " + faculty );
    }

    public static Student[] studentsArrayCreation(int n) {
        Student studentArray[] = new Student[n];
        studentArray[0] = new Student(1, "Карина", "Пунько", "Алексеевна", 2000, "ул.Маяковского, д2кв2", 1234567, "ФИК", 3, 963101);
        studentArray[1] = new Student(2, "Анна", "Ромашко", "Владимировна", 2000, "Улица Б, д4кв9", 7654321, "ФИТУ", 2, 962101);
        studentArray[2] = new Student(3, "Михаил", "Борисов", "Александрович", 1999, "ул.Щенкова, д3кв78", 2222223, "ФКСИС", 1, 031021);
        studentArray[3] = new Student(4, "Владислав", "Пурыль", "Романович", 2001, "ул.Марынено, д8кв1", 1010101, "ФКП", 2, 890763);
        return studentArray;
    }

    public static void facultyStudentList(Student[] studentArray) {
        Scanner sc = new Scanner(System.in);
        String facultySearch = " ";
        int foundCounter = 0;
        System.out.println("Введите название факультета:");
        if (sc.hasNextLine()) {
            facultySearch = sc.nextLine();
            facultySearch = facultySearch.toUpperCase();
        }
        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i].faculty.equals(facultySearch)) {
                studentArray[i].show();
                foundCounter++;
            }
        }
        if (foundCounter == 0) {
            System.out.println("Студентов данного факультета нет");
        }
    }

    public static void facultyCourseStudentList(Student[] studentArray) {
        int b = 0;
        System.out.println("ФИК");
        for (int j = 1; j <= 4; j++) {
            System.out.println(j + " курс");
            for (int i = 0; i < studentArray.length; i++) {
                if (studentArray[i].getCourse() == j) {
                    if (studentArray[i].faculty.equals("ФИК")) {
                        studentArray[i].show();
                        b++;
                    }
            }
        }
        if (b == 0) {
            System.out.println("Студентов на этом курсе нет");
        }
            b = 0;
        }
        System.out.println("ФКСИС");
        for (int j = 1; j <= 4; j++) {
            System.out.println(j + " курс");
            for (int i = 0; i < studentArray.length; i++) {
                if (studentArray[i].getCourse() == j) {
                    if (studentArray[i].faculty.equals("ФКСИС")) {
                        studentArray[i].show();
                        b++;
                    }
                }
            }
            if (b == 0) {
                System.out.println("Студентов на этом курсе нет");
            }
            b=0;
        }
        System.out.println("ФИТУ");
        for (int j = 1; j <= 4; j++) {
            System.out.println(j + " курс");
            for (int i = 0; i < studentArray.length; i++) {
                if (studentArray[i].getCourse() == j) {
                    if (studentArray[i].faculty.equals("ФИТУ")) {
                        studentArray[i].show();
                        b++;
                    }
                }
            }
            if (b == 0) {
                System.out.println("Студентов на этом курсе нет");
            }
            b=0;
        }
        System.out.println("ФКП");
        for (int j = 1; j <= 4; j++) {
            System.out.println(j + " курс");
            for (int i = 0; i < studentArray.length; i++) {
                if (studentArray[i].getCourse() == j) {
                    if (studentArray[i].faculty.equals("ФКП")) {
                        studentArray[i].show();
                        b++;
                    }
                }
            }
            if (b == 0) {
                System.out.println("Студентов на этом курсе нет");
            }
            b=0;
        }
        System.out.println();
    }


    public static void studentWasBornAfterYear (Student[] studentArray){
        Scanner sc = new Scanner(System.in);
        int year = 0;
        System.out.println("Введите год");
        while (!sc.hasNextInt()) {
            System.out.println("введите целое число");
            sc.next();
        }
        year = sc.nextInt();
        for (int i = 0; i < studentArray.length; i++){
            if (studentArray[i].dateOfBorn>year){
                studentArray[i].show();
            }
        }
    }

    public static void groupList (Student[] studentArray){
        Scanner sc = new Scanner(System.in);
        int groupNumber=0;
        System.out.println("Введите номер группы:");
        while (!sc.hasNextInt()) {
            System.out.println("введите целое число");
            sc.next();
        }
        groupNumber = sc.nextInt();
        for (int i = 0; i < studentArray.length; i++){
            if (studentArray[i].group==groupNumber){
                studentArray[i].show();
            }
        }
    }

    public static void list (Student[] studentArray){
        for (int i = 0; i < studentArray.length; i++)
        {
            System.out.println(studentArray[i].toString());
        }
    }

}
