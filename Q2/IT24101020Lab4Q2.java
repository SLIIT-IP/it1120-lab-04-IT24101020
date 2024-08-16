import java.util.Scanner;

public class IT24101020Lab4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = sc.nextDouble();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = sc.nextDouble();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }

        System.out.print("Please enter the exam percentage given for the exam: ");
        double examPercentage = sc.nextDouble();
        if (examPercentage < 0 || examPercentage > 100) {
            System.out.println("Invalid input for exam percentage. Terminating program.");
            return;
        }

        System.out.print("Please enter the percentage given for lab submission: ");
        double labPercentage = sc.nextDouble();
        if (labPercentage < 0 || labPercentage > 100) {
            System.out.println("Invalid input for lab percentage. Terminating program.");
            return;
        }

        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentage must add up to 100. Terminating program.");
            return;
        }

        double finalMarks = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
        System.out.println("Final Exam Mark is: " + finalMarks);
    }
}
