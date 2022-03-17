package ProblemStatement6_4;

import java.io.*;
import java.sql.*;
import java.util.*;

public class Demo {

	public static String help_msg = "Press:   -  A  Add contact  -  S  Search  - Q  Exit : ";

	public static void main(String[] args) {
		System.out.println("\n\n*** Welcome to MyPhone Book \n");
		Scanner s = new Scanner(System.in);
		for (;;) {
			System.out.print("[Main Menu] " + help_msg + "\n: ");
			String command = s.nextLine().trim();

			// if (command.equalsIgnoreCase("H")){
			// System.out.println(help_msg);
			if (command.equalsIgnoreCase("A")) {
				System.out.print("Type in contact details in the format: name,lastname,phone\n:");

			} else if (command.equalsIgnoreCase("S")) {
				System.out.print("Type in the name you are searching for : \n");

			} else if (command.equalsIgnoreCase("Q")) {
				System.out.println("Good Bye User..");
				System.exit(0);
			} else {
				System.out.print("Unknown command ! Try again \n: ");
			}

		}

	}

}
