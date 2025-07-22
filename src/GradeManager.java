
public class GradeManager {
    // Method to reverse student names in an array
    //public static String[] reverseStudentNames(String[] names) {
        //for(int i = 0; i < names[i].length; i++){
        //    cha = names.charAt(i);
        //}
// Reverse each individual name (like "John" becomes "nhoJ")
// Keep the array order the same
// Return the modified array
   // }
    // Method to calculate letter grades
    public static String getLetterGrade(int score) {
// Use if-else conditions:
        String grade ;
        if(score >= 90 && score <= 100){
            grade = "A";
        }else if(score >=80 && score <=89){
            grade = "B";
        }if(score >= 70 && score <= 79){
            grade = "C";
        }else if(score >=60 && score <=69){
            grade = "D";
        }else{
            grade = "F";
        }
        return grade;
    }
    // Method to find students who need to retake exam
    public static String[] findFailingStudents(String[] names, int[] scores)
    {
        for(int i=0;i<scores.length;i++){
            if (scores[i]<60){
                return names;
            }
        }
        return names;
    }
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
        int[] scores = {95, 67, 45, 78};
// Test all your methods
// Display results clearly
    }
}