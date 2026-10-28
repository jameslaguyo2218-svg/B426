import java.util.Scanner;

public class Activity9_LaguyoJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Header
        System.out.println("==================================================");
        System.out.println("           Average Calculator");
        System.out.println("==================================================");

        // Input number of students and subjects
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.println();

        // Input subject names
        String[] subjects = new String[numSubjects];
        System.out.println("Enter subject names:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine();
        }

        System.out.println();

        // Arrays to store student details
        String[] studentNames = new String[numStudents];
        double[][] grades = new double[numStudents][numSubjects];
        double[] averages = new double[numStudents];

        // Input details for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Name of Student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.println("Enter grades for each subject:");
            double sum = 0;
            for (int j = 0; j < numSubjects; j++) {
                System.out.print(subjects[j] + ": ");
                grades[i][j] = scanner.nextDouble();
                sum += grades[i][j];
            }
            scanner.nextLine(); // Consume newline character

            averages[i] = sum / numSubjects;
            System.out.println();
        }

        // Grades Report Output Header
        System.out.println("==================================================");
        System.out.println("           Grades Report");
        System.out.println("==================================================");

        // Print table header matching sample alignment
        System.out.printf("%-18s", "Student");
        for (int j = 0; j < numSubjects; j++) {
            System.out.printf("%-10s", subjects[j]);
        }
        System.out.printf("%-10s%n", "Average");

        // Print horizontal separator line matching header width
        System.out.println("------------------------------------------------------------------");

        // Print student data rows
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-18s", studentNames[i]);
            for (int j = 0; j < numSubjects; j++) {
                if (grades[i][j] == (long) grades[i][j]) {
                    System.out.printf("%-10d", (long) grades[i][j]);
                } else {
                    System.out.printf("%-10.2f", grades[i][j]);
                }
            }
            System.out.printf("%-10.2f%n", averages[i]);
        }

        scanner.close();
    }
}