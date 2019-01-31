package org.jagjeet.library.main;

import java.sql.SQLException;
import java.util.Scanner;

import org.jagjeet.library.service.LibraryService;
import org.jagjeet.library.service.LibraryServiceImpl;

public class LibraryTest {

	public static void main(String[] args) throws SQLException {
		LibraryService libService = new LibraryServiceImpl();
		System.out.println("Welcome to the Personal Library");
		System.out.println("=====================================");

		boolean condition = true;
		while (condition) {
			System.out.println(
					"1. Press 1 to enter Book details\n2. Press 2 to edit Book details\n3. Press 3 to delete Book details\n4. Press 4 to list all Book details\n5 Press 0 to exit the system");

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				libService.createEntry();
				System.out.println("!!!Thankyou!!!");
				break;
			case 2:
				libService.updateEntry();
				System.out.println("Enter for edit operation");
				break;
			case 3:
				libService.deleteEntry();
				System.out.println("Enter for delete operation");
				break;
			case 4:
				libService.viewAllEntry();
				break;
			case 5:
				System.out.println("!!!Thankyou for using the app!!!");
				condition = false;
				break;

			default:
				System.out.println("You have enter an invalid entry");
				break;
			}
		}

	}

}
