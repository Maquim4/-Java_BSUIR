import java.util.Scanner;
public class Car {
    private int id, year, number;
    private String brand, type, color;
    private double cost;
    public Car() {}

    public Car(int id, String brand, String type, int year, String color, double cost, int number) {
        this.id = id;
        this.year = year;
        this.number = number;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car \nid=" + id + "\nyear=" + year + "\nnumber=" + number + "\nbrand=" + brand + " type=" + type +
                " color=" + color + "\ncost=" + cost + "]";
    }

    public void show() {
        System.out.println("id: " + id + ", brand: " + brand + ", type: " + type + ", year: " + year + ", color: " + color + ", cost: " + cost + ", number: " + number);
    }
    public static Car[] createMas(int n) {
        Car mas[] = new Car[n];
        mas[0] = new Car(1, "AUDI", "t", 2019, "black", 23400, 6708);
        mas[1] = new Car(2, "FORD", "p", 2018, "white", 2131, 6668);
        return mas;
    }
    public static void showMas(Car[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
        System.out.println();
    }
    public static void spisA(Car[] mas) {
        int b = 0;
        String a = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("?????????????? ??????????: ");
        if (sc.hasNextLine()) {
            a = sc.nextLine();
            a = a.toUpperCase();

            for (int i = 0; i < mas.length; i++) {
                if (a.equals(mas[i].brand)) {
                    mas[i].show();
                    b++;
                }
            }
        }
        if (b == 0) {
            System.out.println("?????????? ??????????????????????  ??????");
        }
        System.out.println();
    }

    public static void spisB(Car[] mas) {
        int a, b = 0, c = 2019;
        Scanner sc = new Scanner(System.in);
        System.out.print("?????????????? ???????????????????? ?????? ????????????????????????: ");
        while (!sc.hasNextInt()) {
            System.out.println("?????????????? ?????????? ??????????");
            sc.next();
        }
        a = sc.nextInt();

        for (int i = 0; i < mas.length; i++) {
            if (a <= (c - mas[i].getYear())) {
                mas[i].show();
                b++;
            }
        }

        if (b == 0) {
            System.out.println("?????????????????????? ??????");
        }
        System.out.println();
    }

    public static void spisC(Car[] mas) {
        int a, c = 0;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.print("?????????????? ?????? ??????????????: ");
        while (!sc.hasNextInt()) {
            System.out.println("?????????????? ?????????? ??????????");
            sc.next();
        }
        a = sc.nextInt();

        System.out.print("?????????????? ?????????????????????? ????????: ");
        while (!sc.hasNextInt()) {
            System.out.println("?????????????? ?????????? ??????????");
            sc.next();
        }
        b = sc.nextInt();
        for (int i = 0; i < mas.length; i++) {
            if (a == mas[i].year && mas[i].cost > b) {
                mas[i].show();
                c++;
            }
        }

        if (c == 0) {
            System.out.println("?????????????????????? ??????");
        }

        System.out.println();
    }

}
