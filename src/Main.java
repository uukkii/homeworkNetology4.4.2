import java.util.HashSet;
import java.util.Scanner;

public class Main {

    private static final HashSet<Students> studentsBase = new HashSet<>();
    private static final Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Добро пожаловать!");
        while (true) {
            System.out.println("Введите информацию о студенте в следующем формате: ФИО, № группы, ID студенческого билета.\n" +
                    "Для завершения введите 'end'");

            String input = console.nextLine();
            if ("end".equals(input)) {
                break;
            }
            String[] arrayInput = input.split(", ");
            String name = arrayInput[0], group = arrayInput[1], studentId = arrayInput[2];
            addStudent(name, group, studentId);
        }
        showStudentsBase();
    }

    public static void addStudent(String name, String group, String studentId) {
        Students newStudent = new Students(name, group, studentId);
        if (studentsBase.contains(newStudent)) {
            System.out.println("Введенный номер студенческого билета уже присвоен другому студенту!\n");
        } else studentsBase.add(newStudent);
    }

    public static void showStudentsBase() {
        System.out.println("Список студентов:");
        for (Students newStudent : studentsBase) {
            System.out.println(" - " + newStudent);
        }
    }
}