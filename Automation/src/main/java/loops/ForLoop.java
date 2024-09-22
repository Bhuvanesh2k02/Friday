package loops;

import java.util.Scanner;

public class ForLoop {

	public void forloop() {
		for (int i = -1; i >= -10; i--) {
			if (-1 > -10) {
				System.out.println(i);
			}
		}
		// if conditional statement. public void ifcond()
		int obj = 10;
		if (obj > 5) {
			System.out.println("your condition right");
		}
	}

	// if else condition statement.
	public void ifElseAge() {
		int age = 17;
		if (age >= 18) {
			System.out.println("You are eligible for vote");
		} else
			System.out.println("You are not eligible for vote");
	}

	// if else if conditional statement.
	public void ifElseifcondjob() {
		int age1 = 40;
		if (age1 >= 21 && age1 <= 30) {
			System.out.println("You are eligible to apply for job");
		} else if (age1 == 23 && age1 <= 30) {
			System.out.println("You are eligible to apply for job");
		} else if (age1 >= 25 && age1 <= 30) {
			System.out.println("You are eligible to apply for job");
		} else if (age1 <= 30 && age1 >= 21) {
			System.out.println("You are eligible to apply for job");
		} else {
			System.out.println("You are not eligible to apply for job");
		}
	}

	// Nested if conditional statement.
	public void nestedifcondjob() {
		int age = 31;
		if (age >= 21) {
			if (age <= 30) {
				System.out.println("You are eligible to apply for job");
			} else {
				System.out.println("You are not eligible to apply for job");
			}
		}
	}

	// switchcase conditional statement.
	public void switchcasecondjob() {
		int weekdays = 5;
		switch (weekdays) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesdays");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("no weekdays");
		}
	}

	public void whileloop() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your num : ");
		int num = sc.nextInt();
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
			System.out.println("Your num is : " + rev);
		}

	}

	public static void main(String[] args) {
		ForLoop fl = new ForLoop();
		// fl.forloop();
		// fl.ifcond();
		// fl.ifElseAge();
		// fl.ifElseifcondjob();
		// fl.nestedifcondjob();
		// fl.switchcasecondjob();
		// fl.whileloop();

	}

}
