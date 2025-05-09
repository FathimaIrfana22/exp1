/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fathi
 */
 import java.util.Scanner;  // Import the Scanner class

public class NewClass {
  public static void main(String[] args) {
    int x, y, sum;
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Type a number:");
    x = myObj.nextInt(); // Read user input

    System.out.println("Type another number:");
    y = myObj.nextInt(); // Read user input

    sum = x + y;
    System.out.println("Sum is: " + sum); // Output user input
  }
} 
    