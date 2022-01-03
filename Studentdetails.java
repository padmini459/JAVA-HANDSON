import java.util.Scanner;


    public class Main {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    public Main(int studentId, String studentName, String studentAddress, String collegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }

    public Main(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Students's Id:");
        int id = scanner.nextInt();

        System.out.println("Enter Students' Name:");
        String name = scanner.next();

        System.out.println("Enter Students' Address:");
        String address = scanner.next();

        boolean isFromNIT = false;
        String collageName = "";

        while (true) {
            System.out.println("Whether the student is from NIT(Yes/No):");
            String input = scanner.next();

            if (input.equals("YES") || input.equals("yes")) {
                isFromNIT = true;
                break;
            } else if (input.equals("NO") || input.equals("no")) {
                System.out.println("Enter the collage name:");
                collageName = scanner.next();

                break;
            }
        }

        Main student;

        if (isFromNIT) {
            student = new Main(id, name, address);
        } else {
            student = new Main(id, name, address, collageName);
        }

        System.out.println("Student id:" + student.getStudentId());
        System.out.println("Student name:" + student.getStudentName());
        System.out.println("Address:" + student.getStudentAddress());
        System.out.println("Collage name:" + student.getCollegeName());
    }
}