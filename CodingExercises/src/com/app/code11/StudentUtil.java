package com.app.code11;

public class StudentUtil {    
    
    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) throws MissingGradeException {
        // Your code: throw IllegalArgumentException with the message that lengths of input arrays are out-of-sync
                
        double[] gpaList = new double[studentIdList.length];
        
        if(studentIdList == null || studentsGrades == null) {
            throw new NullPointerException("The StudentList/StudentGrade cannot be null");
        }

        if(studentIdList.length != studentsGrades.length)
        {
            throw new IllegalArgumentException("studentList and studentGrades are out-of-sync." + "\n" +
                    "studentList.length : "+ studentIdList.length + ", studentGrades.length : " +studentsGrades.length);
        }
        for (int i = 0; i < studentsGrades.length; i++) {
            double gpa = 0.0;
            
            for (int j = 0; j < studentsGrades[i].length; j++) {
                if (studentsGrades[i][j] == 'A') {
                    gpa += 4.0;
                } else if (studentsGrades[i][j] == 'B') {
                    gpa += 3.0;
                } else if (studentsGrades[i][j] == 'C') {
                    gpa += 2.0;
                } else if (studentsGrades[i][j] == ' ') {
                    // student is yet to receive a grade
                    // Your code: throw checked exception MissingGradeException with student ID
                	throw new MissingGradeException(studentIdList[i]);
                	
                }
            }
            
            gpaList[i] = gpa/studentsGrades[i].length;
        }
        
        return gpaList;
    }    
    
    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) throws MissingGradeException {
        if (lower < 0 || higher < 0 || lower > higher) {
            return null;
        }
        
        double[] gpaList = new double[studentIdList.length];
        // Your code: catch MissingGradeException and re-throw runtime exception InvalidDataException initialized with the cause MissingGradeException
        gpaList = calculateGPA(studentIdList, studentsGrades);
        
        try{
            gpaList = calculateGPA(studentIdList, studentsGrades);
        }
        catch (MissingGradeException e)
        {
            e.printStackTrace();
            throw new InvalidDataException(e);
        }
       
        int count = 0;
        for (double gpa : gpaList) {
            if (gpa >= lower && gpa <= higher) {
                count++;
            }
        }
        
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i <  gpaList.length; i++) {
            if (gpaList[i] >= lower && gpaList[i] <= higher) {
                result[index++] = studentIdList[i];
            }
        }
        
        return result;
    }        
    public static void main(String[] args) throws MissingGradeException {
        double lower = 3.2;
        double higher = 3.5;
        int[] studentList = {1001, 1002};
        char[][] studentGrades = {{'A', 'A', 'A', 'B'},{'A', 'B',' '}};
        try {
            int[] studentsByGPA = getStudentsByGPA(lower, higher, studentList, studentGrades);
            for(int studentId: studentsByGPA)
            {
                System.out.println("Student Id : " + studentId);
            }
        } catch (InvalidDataException e) {
            e.printStackTrace();
        }
    }
}
