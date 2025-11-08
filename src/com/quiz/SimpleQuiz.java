package com.quiz;

import java.util.Scanner;

public class SimpleQuiz {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        String[] questions = {
	            "1. Which keyword is used to inherit a class in Java?",
	            "2. Which of the following is not a Java primitive data type?",
	            "3. Which method is the entry point of a Java program?",
	            "4. Which of the following is used to handle exceptions in Java?",
	            "5. Which keyword is used to create an object in Java?",
	            "6. Which of these is not an OOP concept in Java?",
	            "7. Which package is automatically imported in every Java program?"
	        };

	       
	        String[][] options = {
	            {"A. super", "B. this", "C. extends", "D. implements"},
	            {"A. int", "B. float", "C. boolean", "D. String"},
	            {"A. start()", "B. main()", "C. run()", "D. init()"},
	            {"A. goto", "B. try-catch", "C. if-else", "D. for loop"},
	            {"A. object", "B. new", "C. create", "D. construct"},
	            {"A. Encapsulation", "B. Polymorphism", "C. Compilation", "D. Inheritance"},
	            {"A. java.io", "B. java.util", "C. java.lang", "D. java.awt"}
	        };

	       
	        char[] answers = {'C', 'D', 'B', 'B', 'B', 'C', 'C'};

	        double score = 0; 

	        
	        for (int i = 0; i < questions.length; i++) {
	            System.out.println("\n" + questions[i]);
	            for (int j = 0; j < 4; j++) {
	                System.out.println(options[i][j]);
	            }

	            System.out.print("Enter your answer (A/B/C/D): ");
	            char userAnswer = sc.next().toUpperCase().charAt(0);

	            if (userAnswer == answers[i]) {
	                System.out.println("Correct!");
	                score += 1;
	            } else {
	                System.out.println("Wrong! Correct answer: " + answers[i]);
	                score -= 0.25;
	            }
	        }

	        
	        double percentage = (score / questions.length) * 100;

	        System.out.println("\n==============================");
	        System.out.println("          QUIZ RESULT");
	        System.out.println("==============================");
	        System.out.println("Total Questions: " + questions.length);
	        System.out.println("Final Score: " + score);
	        System.out.printf("Percentage: %.2f%%\n", percentage);
	        System.out.println("===============================");

	        sc.close();
	        
	    }
	}

