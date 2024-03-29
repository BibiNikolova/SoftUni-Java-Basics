import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        double fivePlus = 0;
        double good = 0;
        double average = 0;
        double bad = 0;
        double sumGrade = 0;

        for (int i = 0; i < students; i ++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if(grade >= 2.0 && grade <= 2.99) {
                bad ++;
            } else if(grade >= 3.0 && grade <= 3.99) {
                average ++;
            } else if(grade >= 4.0 && grade <= 4.99) {
                good ++;
            } else {
                fivePlus ++;
            }
            sumGrade += grade;
        }


        System.out.printf("Top students: %.2f%%\n",fivePlus/students * 100 );
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n",good/students * 100 );
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", average/students * 100);
        System.out.printf("Fail: %.2f%%\n", bad/students * 100 );
        System.out.printf("Average: %.2f", sumGrade/students);

    }
}
