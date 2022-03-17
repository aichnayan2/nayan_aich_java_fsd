package ProblemStatement6_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		n = sc.nextInt();
		System.out.println("Enter the students names: ");
		for (int i = 0; i < n; i++) {
			al.add(sc.next());
		}
		System.out.println("students list: ");
		for (String a : al) {
			System.out.println(a);

		}
		System.out.println("Enter the name of student to be searched: ");
		String st = sc.next();
		int position = Collections.binarySearch(al, st);
		System.out.println("position of" + st + " is: " + position);

	}

}
