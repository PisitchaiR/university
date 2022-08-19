class Student {
    public String name;
    public double mScore;
    public double fScore;
    public void showGrade(){
        char grade;
        double score = (mScore*0.4) + (fScore*0.4) + 20;
        if (score >= 80){grade = 'A';}
        else if (score >= 70) {grade = 'B';}
        else if (score >= 60) {grade = 'C';}
        else if (score >= 50) {grade = 'D';}
        else {grade = 'F';}
        System.out.println("Your grade is "+ grade);
    }
}

public class Main5 {
    public static void main(String[] agrs) {
        Student s = new Student();
        s.mScore = 80;
        s.fScore = 80;
        s.showGrade();

    }
}
