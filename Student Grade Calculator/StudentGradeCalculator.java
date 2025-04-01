import java.util.*;
import java.text.DecimalFormat;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the marks of each subject:");

        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        displayResult(arr);

    }
    public static int totalCalculator(int[] arr){

        int totalMarks = 0;
        for(int a : arr){
            totalMarks += a;
        }

        return totalMarks;
    }

    public static String averagePercentageCalculator(int totalMarks, int numberOfSubjects){

        DecimalFormat df = new DecimalFormat("#." + "0".repeat(2));
        double averagePercentage = (double) totalMarks/numberOfSubjects;
        return df.format(averagePercentage);
    }

    public static char gradeCalculator(double percentage){

        if(percentage >=90)
            return 'O';
        else if(percentage>=80)
            return 'E';
        else if(percentage>=70)
            return 'A';
        else if(percentage>=60)
            return 'B';
        else if(percentage>=50)
            return 'C';
        else if(percentage>=40)
            return 'D';
        else
            return 'F';
    }

    public static void displayResult(int[] arr){

        int totalMarks = totalCalculator(arr);
        String averagePercentage = averagePercentageCalculator(totalMarks, arr.length);
        char grade = gradeCalculator(Double.parseDouble(averagePercentage));

        System.out.println("Your Results:");
        System.out.println("Total Marks Obtained: "+totalMarks);
        System.out.println("Average Percentage Obtained: "+averagePercentage);
        System.out.println("Grade Obtained: "+grade);
    }

}
