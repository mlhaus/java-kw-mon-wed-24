package edu.kirkwood.demo_2;

public class IfElse {
    public static void main(String[] args) {
        int x = 15;
        if (x < 10) {
            System.out.println("lt 10");
        } else if (x < 20) {
            System.out.println("lt 20");
        } else {
            System.out.println("gte 20");
        }

        // Ternary operator
        // condition ? trueValue : falseValue
        System.out.println(x < 10 ? "lt 10" : x < 20 ? "lt 20" : "gte 20");

        double score = 91;
        String grade = getGrade(score);
        System.out.println(grade);
        grade = getGrade2(score);
        System.out.println(grade);
        grade = getGrade3(score);
        System.out.println(grade);

    } // end main method


    /**
     * Get a grade assigned to an assignment
     * @param score an int between 0 and 100, representing the assignment score
     * @return a String, A to F
     */
    public static String getGrade(double score) {
        if(score >= 90) {
            return "A";
        } else if(score >= 80) {
            return "B";
        } else if(score >= 70) {
            return "C";
        } else if(score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static String getGrade2(double score) {
        if(score < 60) {
            return "F";
        } else if(score < 70) {
            return "D";
        } else if(score < 80) {
            return "C";
        } else if(score < 90) {
            return "B";
        } else {
            return "A";
        }
    }

    public static String getGrade3(double score) {
        return score >= 90 ? "A" : 
                score >= 80 ? "B" : 
                score >= 70 ? "C" : 
                score >= 60 ? "D" : "F";
    }


}
