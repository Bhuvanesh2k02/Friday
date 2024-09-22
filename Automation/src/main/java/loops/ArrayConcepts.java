package loops;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcepts {
	public void array() {
		// Single dimensional array:
		/*
		 * 1) Declare an array. 2) Add values into array. 3) Find size of an array. 4)
		 * Read single value from an array. 5) Read multiple values from an array.
		 *
		 * int array[]=new int[4]; array[0]=100; array[1]=200; array[2]=300;
		 * array[3]=400;
		 */
		// Declare an array:Approach1
		int array[] = { 100, 200, 300, 400 };
		// System.out.println("Lenght of the array : " + array.length);
		// System.out.println("index value : " + array[3]);
		// System.out.println(" ");

		// Approach2:Heterogeneous data-"Object" is pre-defined class in java it like a
		// String.
		// Type1
		Object array1[] = { 100, 10.5, 'A', "abc", true };
		for (Object i : array1) {
			// System.out.println(i);
		}
		// Type2-printing the values
		for (int i = 0; i <= array1.length - 1; i++) {
			System.out.println(array1[i]);
		}
		// Type2-printing the index number
		for (int i = 0; i <= array1.length - 1; i++) {
			System.out.println(i);
		}

		// for loop:Type 1
		for (int i = 0; i < array.length; i++) {
			// System.out.println("Type1 Lenght of the array : " + i);
		}
		System.out.println(" ");

		// Type 2
		for (int i = 0; i <= array.length - 1; i++) {
			// System.out.println("Type2 Lenght of the array : " + i);
		}
		// System.out.println(" ");

		// Type 3
		for (int i = 0; i <= 4; i++) {
			// System.out.println("Type3 Lenght of the array : " + i);
		}
		// System.out.println(" ");

		// Type 4
		for (int i = 0; i <= array.length - 1; i++) {
			// System.out.println("Type4 Lenght of the array : " + i);
		}
		// System.out.println(" ");

		// Type 5
		for (int i = 0; i < 5; i++) {
			// System.out.println("Type5 Lenght of the array : " + i);
		}
		// System.out.println(" ");

		// for each loop/enhanced for loop
		for (int i : array) {
			// System.out.println("Array value : " + i);
		}
		// Two dimensional array:

	}

	public void twodimensionalarray() {
		/*
		 * 1) Declare an array. 2) Add values into array. 3) Find size of an array. 4)
		 * Read single value from an array. 5) Read multiple values from an array.
		 */
		// We can use any notation and it is also applicable for single dimensional
		// array.
		// 1)Declare an array:
		int a[][] = new int[5][2];
		// int []a2[]=new int[4][5];
		// int [][]a3=new int[4][5];
		// 2)Add values into array:Approch1
		a[0][0] = 100;
		a[0][1] = 200;
		a[1][0] = 300;
		a[1][1] = 400;
		a[2][0] = 500;
		a[2][1] = 600;
		a[3][0] = 700;
		a[3][1] = 800;
		a[4][0] = 900;
		a[4][1] = 1000;

		// Approch2:
		/*
		 * int array[][]= {{100,200}, {300,400}, {500,600}, {700,800}, {900,1000} };
		 */

		// Approach3:Heterogeneous data-"Object" is pre-defined class in java it like a
		// String.
		Object array1[][] = { { 13, 52.5, 5623.2, 's', "abc", true }, { 52, 41.23, "string" },
				{ "Bhuvanesh", 100, 200, true, false } };
		// Type1
		for (Object i[] : array1) {// foreach loop only
			for (Object b : i) {
				// System.out.print(b+" ");
			}
			// System.out.println();
		}

		// 3)Find size of an array:
		// System.out.println("Lenght of the rows : "+a.length);
		// System.out.println("Lenght of the columns : "+a[0].length);
		// 4)Read single value from an array:
		// System.out.println("Reading single value : "+a[2][1]);
		// 5)Read multiple values from an array:Type1
		// using for loop:
		for (int row = 0; row <= 4; row++) {
			for (int column = 0; column <= 1; column++) {
				// System.out.print(a[row][column]+ " ");
			}
			// System.out.println();
		}
		// Type2
		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < 2; column++) {
				// System.out.print(a[row][column]+ " ");
			}
			// System.out.println();
		}
		// Type3
		for (int row = 0; row <= a.length - 1; row++) {
			for (int column = 0; column <= a[row].length - 1; column++) {
				// System.out.print(a[row][column]+ " ");
			}
			// System.out.println();
		}
		// Type4
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				// System.out.print(a[row][column]+ " ");
			}
			// System.out.println();
		}
		// for each loop/enhanced loop:
		for (int row[] : a) {
			for (int column : row) {
				// System.out.print(column+" ");
			}
			// System.out.println();
		}
	}

	public void Assessment() {
		int array[] = { 1,2,3,4,5,6,7,8,9,10,11 };
		
		//Find the elements of the array:
		System.out.println("Index of 4=>array'5' :"+array[4]);
		System.out.println();
		
		//Print even and add numbers of the array:
		System.out.print("Even num :");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Odd  num :");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
	}

	public void removingarray() {
		int array[] = { 1,2,3,4,5,6,7,8,9,10,11 };
		// Change an index in array using for loop:
		System.out.println();
		System.out.println("Changed index 9=>array'3':");
		for (int i=0;i<=array.length-1;i++) {
			if (i==9) {
				//int a= array[9]=3;//its changing the all for loop
				int a=3;
				System.out.print(a+" ");
			} 
			else {
				System.out.print(array[i]+" ");
			}
			if(array[i]==11) {
				break;
			}
		}
		// Remove index of an array using for loop:
		System.out.println();
		System.out.println("Removed array'6' :");
		for (int i=0;i<array.length;i++) {
			if (array[i]==6) {
			} 
			else {
				System.out.print(array[i]+" ");
			}
		}
		// Remove index of an array using for each loop/enhanced loop:
		System.out.println();
		System.out.println("Removed array'5' :");
		for (int i : array) {
			if (i == 5) {
			} else {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
		public void searchingelement() {
		int array[] = { 1,2,3,4,5,6,7,8,9,10,11 };
		//Search an element in array(linear search algorithm):
		int value =100;
		boolean valuestatus=false;
		System.out.println();
		for(int i=0;i<array.length;i++) {
			if(array[i]==value) {
				System.out.println("'"+array[i]+"'"+" value was founded.");
				valuestatus=true;
				break;
			}
		}
		if(valuestatus==false) {
			System.out.print("'"+value+"'"+" value was not found.");
		}
	}
	
	public void repetition() {
		int array[] = { 1,2,6,4,5,6,6,8,6,10,6 };
		//find number of repetition an array:
		int value=6;
		int count=0;
		for(int i:array) {
			if(i==value) {
				count++;
			}
		}
		System.out.println("The number of elements are repeated : "+count);
		System.out.println();
	}
	public void sorting() {
		int array[]= {1,4,6,3,4,7,8,9,10};
		System.out.println();
		//array was sorted:
		Arrays.sort(array);
		System.out.println("Arrays was sorted : "+Arrays.toString(array));
		//changing the element of an array:
		for(int i=0;i<array.length;i++) {
			if(i==1) {
				
				array[1]=2;
				array[2]=3;
				array[3]=4;
				array[4]=5;
				array[8]=6;
				Arrays.sort(array);
				System.out.println("After changing an array was sorted : "+Arrays.toString(array));
			}
		}
	}
	public void Ascendingorder() {
		//String array[]= {"bhuvanesh","sathish","vanitha","aakash","dhanush"};
		String array[]= {"A","B","C","D"};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		for(int i=array.length-1;i>=0;i--);{
		System.out.println(Arrays.toString(array));
	}
	}
	//Taking input from keyboard:
	public void writinginput() {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter pin");
		int pin= sc.nextInt();
		
		System.out.println("enter pass");
		int pass=sc.nextInt();
			
		System.out.println("enter id");
		int id=sc.nextInt();
				
		System.out.println("enter phnum");
		int phnum=sc.nextInt();
				
		System.out.println("your Name :"+name);
		System.out.println("your Pincode :"+pin);
		System.out.println("your Password :"+pass);
		System.out.println("your id :"+id);
		System.out.println("your Phone num :"+phnum);
	}

	public static void main(String[] args) {
		ArrayConcepts ar = new ArrayConcepts();
		// ar.twodimensionalarray();
		// ar.array();
		//ar.Assessment();
		//ar.removingarray();
		//ar.searchingelement();
		//ar.repetition();
		//ar.sorting();
		ar.Ascendingorder();
		//ar.writinginput();

	}
}
