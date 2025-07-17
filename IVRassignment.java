package com.java.assignments;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IVRassignment {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean choice = true;
        while (choice) {
            System.out.println("\nSelect the number from (1 to 6)");
            System.out.println("1:- Prime Number");
            System.out.println("2:- Even/Odd Number");
            System.out.println("3:- Leap Year");
            System.out.println("4:- Armstrong Number");
            System.out.println("5:- Reverse Number");
            System.out.println("6:- Exit From the program");

            int userChoice = -1;
            try {
                userChoice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid Integer input");
                sc.nextLine();
            }

            switch (userChoice) {
                case 1: primeNumber(); break;
                case 2: evenOdd(); break;
                case 3: leapYear(); break;
                case 4: armstrongNumber(); break;
                case 5: reverseNumber(); break;
                case 6: 
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Select a valid number between 1 and 6.");
            }
        }
    }

    public static void primeNumber() {
        int again = 1;
        while (again == 1) {
            System.out.println("\nYou chose to check whether a number is Prime:");
            System.out.print("Enter a Number: ");

            int primeNum = -1;
            boolean validInput = true;

            try {
                primeNum = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, Please enter a valid integer.");
                validInput = false;
                sc.nextLine();
            }

            if (validInput) {
                if (primeNum <= 1) {
                    System.out.println(primeNum + " is not a Prime Number.");
                } else {
                    boolean isPrime = true;
                    for (int i = 2; i <= primeNum / 2; i++) {
                        if (primeNum % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    System.out.println(primeNum + (isPrime ? " is a Prime Number." : " is not a Prime Number."));
                }
            }

            System.out.println("Enter 1 to check another number, or 0 to return to the main menu:");
            try {
                again = sc.nextInt();
                if (again != 0 && again != 1) {
                    again = 0;
                }
            } catch (InputMismatchException e) {
            	System.out.println("Enter a valid Integer either 0 or 1");
                System.out.println("Invalid input. Returning to main menu.");
                sc.nextLine();
                again = 0;
            }
        }
    }

    public static void evenOdd() {
        int again = 1;
        while (again == 1) {
            System.out.println("\nYou chose to check whether a number is Even or Odd:");
            System.out.print("Enter a Number: ");

            int num = 0;
            boolean validInput = true;

            try {
                num = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, Please enter a valid integer.");
                validInput = false;
                sc.nextLine();
            }

            if (validInput) {
                System.out.println(num + (num % 2 == 0 ? " is an Even Number." : " is an Odd Number."));
            }

            System.out.println("Enter 1 to check another number, or 0 to return to the main menu:");
            try {
                again = sc.nextInt();
                if (again != 0 && again != 1) {
                    System.out.println("Invalid choice. Returning to main menu.");
                    again = 0;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Returning to main menu.");
                sc.nextLine();
                again = 0;
            }
        }
    }

    public static void leapYear() {
        int again = 1;
        while (again == 1) {
            System.out.println("\nYou chose to check whether a year is Leap Year:");
            System.out.print("Enter a Year: ");

            int year = 0;
            boolean validInput = true;

            try {
                year = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, Please enter a valid integer.");
                validInput = false;
                sc.nextLine(); 
            }

            if (validInput) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                }
            }

            System.out.println("Enter 1 to check another year, or 0 to return to the main menu:");
            try {
                again = sc.nextInt();
                if (again != 0 && again != 1) {
                    System.out.println("Invalid choice. Returning to main menu.");
                    again = 0;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Returning to main menu.");
                sc.nextLine();
                again = 0;
            }
        }
    }

    public static void armstrongNumber() {
        int again = 1;
        while (again == 1) {
            System.out.println("\nYou chose to check whether a number is Armstrong:");
            System.out.print("Enter a Number: ");

            int num = 0;
            boolean validInput = true;

            try {
                num = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, Please enter a valid integer.");
                validInput = false;
                sc.nextLine();
            }

            if (validInput) {
                int temp = num, sum = 0, count = 0;

                while (temp != 0) {
                    temp /= 10;
                    count++;
                }

                temp = num;
                while (temp != 0) {
                    int rem = temp % 10;
                    sum += Math.pow(rem, count);
                    temp /= 10;
                }

                System.out.println(num + (sum == num ? " is an Armstrong Number." : " is not an Armstrong Number."));
            }

            System.out.println("Enter 1 to check another number, or 0 to return to the main menu:");
            try {
                again = sc.nextInt();
                if (again != 0 && again != 1) {
                    System.out.println("Invalid choice. Returning to main menu.");
                    again = 0;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Returning to main menu.");
                sc.nextLine();
                again = 0;
            }
        }
    }

    public static void reverseNumber() {
        int again = 1;
        while (again == 1) {
            System.out.println("\nYou chose to reverse a number:");
            System.out.print("Enter a Number: ");

            int num = 0;
            boolean validInput = true;

            try {
                num = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, Please enter a valid integer.");
                validInput = false;
                sc.nextLine();
            }

            if (validInput) {
                int reversed = 0;
                int original = num;

                while (num != 0) {
                    int rem = num % 10;
                    reversed = reversed * 10 + rem;
                    num /= 10;
                }

                System.out.println("Reversed Number of " + original + " is: " + reversed);
            }

            System.out.println("Enter 1 to check another number, or 0 to return to the main menu:");
            try {
                again = sc.nextInt();
                if (again != 0 && again != 1) {
                    System.out.println("Invalid choice. Returning to main menu.");
                    again = 0;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Returning to main menu.");
                sc.nextLine();
                again = 0;
            }
        }
    }
}