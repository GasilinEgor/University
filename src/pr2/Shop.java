package pr2;
import java.util.Objects;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Computer[] computers = new Computer[0];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в магазин! Если Вы захотите выйти, напишите exit в главном меню");
        String command = "";
        while (!Objects.equals(command, "exit")) {
            System.out.println("Главное меню" + "\n" + "Команды:");
            System.out.println("print - вывод информации о всех компьютерах");
            System.out.println("add - добавление компьютера");
            System.out.println("delete - удаление компьютера");
            System.out.println("search - поиск компьютера");
            System.out.print("Введите комманду: ");
            command = scanner.next();
            if (Objects.equals(command, "print")) {
                print_computers(computers);
            }
            else if (Objects.equals(command, "add")) {
                computers = add_Computer(computers);
            }
            else if (Objects.equals(command, "delete")) {
                computers = delete_Computer(computers);
            }
            else if (Objects.equals(command, "search")) {
                search_computer(computers);
            }
            else if (Objects.equals(command, "exit")) {
                System.out.println("Завершение работы комманды");
            }
            else {
                System.out.println("Комманда не найдена!");
            }
        }
    }


    public static Computer[] add_Computer(Computer[] computers) {
        Scanner scanner = new Scanner(System.in);
        Computer computer = new Computer();
        System.out.print("Введите название компьютера: ");
        computer.setName(scanner.nextLine());
        System.out.print("Введите цвет компьютера: ");
        computer.setColour(scanner.next());
        System.out.print("Введите цену компьютера: ");
        computer.setCost(scanner.nextInt());
        System.out.print("Введите размеры компьютера (длину, ширину, высоту) через пробел: ");
        computer.setSize(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        Computer[] new_computers = new Computer[computers.length + 1];
        for (int i = 0; i < computers.length; i++) {
            new_computers[i] = computers[i];
        }
        new_computers[computers.length] = computer;
        return new_computers;
    }


    public static Computer[] delete_Computer(Computer[] computers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер компьютера, который хотите удалить: ");
        int index = scanner.nextInt();
        Computer[] computers1 = new Computer[computers.length - 1];
        for (int i = 0; i < index; i++) {
            computers1[i] = computers[i];
        }
        for (int i = index + 1; i < computers.length; i++) {
            computers1[i - 1] = computers[i];
        }
        return computers1;
    }


    public static void search_computer(Computer[] computers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название компьютера");
        String name = scanner.next();
        System.out.println("Все найденные компьютеры:");
        for (int i = 0; i < computers.length; i++) {
            if (computers[i].getName().contains(name)) {
                computers[i].print();
            }
        }
    }


    public static void print_computers(Computer[] computers) {
        System.out.println("Сведения о компьютерах в магазине");
        for (int i = 0; i < computers.length; i++) {
            computers[i].print();
        }
    }
}


class Computer {
    private String name;
    private String colour;
    private int cost;
    private int sizeX;
    private int sizeY;
    private int SizeZ;


    public Computer(String name, String colour, int cost, int sizeX, int sizeY, int sizeZ) {
        this.name = name;
        this.colour = colour;
        this.cost = cost;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.SizeZ = sizeZ;
    }


    public Computer() {
        this.name = "NaN";
        this.colour = "NaN";
        this.cost = 0;
        this.sizeX = 0;
        this.sizeY = 0;
        this.SizeZ = 0;
    }


    public String getName() {
        return name;
    }


    public String getColour() {
        return colour;
    }


    public int getCost() {
        return cost;
    }


    public int getSizeX() {
        return sizeX;
    }


    public int getSizeY() {
        return sizeY;
    }


    public int getSizeZ() {
        return SizeZ;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setColour(String colour) {
        this.colour = colour;
    }


    public void setCost(int cost) {
        this.cost = cost;
    }


    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }


    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }


    public void setSizeZ(int sizeZ) {
        this.SizeZ = sizeZ;
    }


    public void setSize(int sizeX, int sizeY, int sizeZ) {
        this.setSizeX(sizeX);
        this.setSizeY(sizeY);
        this.setSizeZ(sizeZ);
    }


    public void print() {
        System.out.println();
        System.out.println("Информация о компьютере:");
        System.out.println("Название: " + getName());
        System.out.println("Цвет: " + getColour());
        System.out.println("Цена: " + getCost());
        System.out.println("Размер: " + getSizeX() + " x " + getSizeY() + " x " + getSizeZ());
        System.out.println();
    }


    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", cost=" + cost +
                ", sizeX=" + sizeX +
                ", sizeY=" + sizeY +
                ", SizeZ=" + SizeZ +
                '}';
    }
}
