package question1.et.edu.aau;

import java.util.Scanner;



public class ElementCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter its size: ");
        
        
        int size = sc.nextInt();
        int[] myArray = new int[size];

        System.out.print("Enter the elements one by one separated with space or enter: ");
        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }

        System.out.print("What is the number you want to search?: ");
        int target = sc.nextInt();
        sc.close();
        
        int elementCount = 0;
        
        for (int num : myArray) {
            if (num == target) {
                elementCount++;
            }
        }

        if (elementCount == 0) {
        	System.out.println(target + " is not present in the array.");
        } else {
            System.out.println(target +" is present "+elementCount+" times");
        }
       
    }
}
