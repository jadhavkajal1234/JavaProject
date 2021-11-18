package com.app.code3;

import java.util.ArrayList;

import java.util.List;

public class StudentUtil {

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) throws Exception {
        // your code
        double [] grades = new double[studentIdList.length];
        int i = 0;

       for(char[] studentGrade : studentsGrades) {
    	   double sumGrades = 0.0;
    	   
    	   for(char grade : studentGrade) {
    		   
    		   if(grade == 'A') {
    			   sumGrades += 4;
    		   }
    		   else if(grade == 'B')
    		   {
    			   sumGrades += 3;
    		   }
    		   else {
    			   sumGrades += 2;
    		   }
    		   
    	   }
    	   grades[i++] = sumGrades/(studentGrade.length);
       }
        
        
        return grades;
    }

    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) throws Exception {
        // perform parameter validation. Return null if passed parameters are not valid
        if(lower < 0 || higher < 0 || lower > higher)
        {
            return null;
        }
        if(studentIdList == null || studentsGrades == null) {
            throw new NullPointerException("cannot be null");
        }

        // invoke calculateGPA
        
        double [] gpa = calculateGPA(studentIdList, studentsGrades);
        List<Integer> students = new ArrayList<>();
        
        for(int i = 0; i < studentIdList.length; i++) {
        	if (gpa[i] >= lower && gpa[i] <= higher) {
        		students.add(studentIdList[i]);
        	}
        	System.out.println("***"+gpa[i]);
        
        }
  
       int [] ret = new int[students.size()];
       for (int i = 0; i < ret.length; i ++) {
    	   ret[i] = students.get(i);
       }

        return ret;
        
     
    }

    public static void main(String[] args) {
        double lower = 3.2;
        double higher = 3.5;
        int[] studentList = {1001, 1002};
        char[][] studentGrades = {{'A', 'A', 'A','B'}, {'A','B', 'B'}};
        try {
            int[] studentsByGPA = getStudentsByGPA(lower, higher, studentList, studentGrades);
            for(int studentId: studentsByGPA)
            {
                System.out.println("Student Id : " + studentId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}