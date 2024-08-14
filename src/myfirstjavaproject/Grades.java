
package myfirstjavaproject;

import java.util.Scanner;


public class Grades {
    
    public void getGrade(){
      
        Scanner input = new Scanner(System.in);
                
        String name;
        int math, sci, eng, comp;
          
        System.out.print("Enter your complete name: ");
        name = input.nextLine();
        
        System.out.println("Enter your Marks");
        System.out.print("\nMath:");
        math = input.nextInt();
        System.out.print("Science:");     
        sci = input.nextInt();
        System.out.print("English:");
        eng = input.nextInt();
        System.out.print("Computer:");
        comp = input.nextInt();
        
        int totalMarks = math + sci + eng + comp;
        double averageMarks = totalMarks / 4.0;
        
        System.out.println("Grade Detail");
        
        System.out.println("Your complete name:"+name);
        System.out.println("Total Marks:"+totalMarks);
        System.out.println("Total Average"+averageMarks);
        
