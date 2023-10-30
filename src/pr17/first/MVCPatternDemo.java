package pr17.first;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student student = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        System.out.println("Before:");
        controller.updateView();
        controller.setStudentName("NonEgor");
        controller.setStudentRollNo("NonRoll");
        System.out.println("After:");
        controller.updateView();
    }


    public static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Egor");
        student.setRollNo("Roll");
        return student;
    }
}
