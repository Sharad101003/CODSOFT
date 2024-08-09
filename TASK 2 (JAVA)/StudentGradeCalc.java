import java.util.Scanner;

public class StudentGradeCalc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects you have : ");
        int numOfSub = sc.nextInt();
        int []marksOfSub = new int[numOfSub];
        double totalMarks=0;

        for(int i=0;i<numOfSub;i++){
            System.out.println("Enter the Marks of " + (i+1) + " subject :");
            marksOfSub[i] = sc.nextInt();
            totalMarks += marksOfSub[i];
        }
        
        double avgPercentage = totalMarks/numOfSub;
        System.out.println(avgPercentage);

        String grade;

        if(avgPercentage>=90){
            grade = "A+";
        }
        else if(avgPercentage>=80 && avgPercentage<90){
            grade = "A";
        }
        else if(avgPercentage>=70 && avgPercentage<80){
            grade = "B";
        }
        else if(avgPercentage>=60 && avgPercentage<70){
            grade = "C";
        }
        else if(avgPercentage>=50 && avgPercentage<60){
            grade = "D";
        }
        else{
            grade = "Fail";
        }

        System.out.println("----YOUR RESULT----");
        System.out.println("-> Total Marks : " + totalMarks);
        System.out.println("-> Percentage : " + avgPercentage);
        System.out.println("-> Grade : " + grade);

        sc.close();
    }
}
