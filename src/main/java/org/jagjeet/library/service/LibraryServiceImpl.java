package org.jagjeet.library.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.jagjeet.library.dao.LibraryDao;
import org.jagjeet.library.dao.LibraryDaoImpl;
import org.jagjeet.library.model.Book;
import org.jagjeet.library.model.User;

public class LibraryServiceImpl implements LibraryService {
	LibraryDao LibDao = new LibraryDaoImpl();

	public void createEntry() throws SQLException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Book Title");
		Book Books = new Book();
		Books.setTitle(sc.next());

		System.out.println("Please Enter Author Name");
		Books.setAuthor(sc.next());

		System.out.println("Please Enter your Name");
		Books.setName(sc.next());

		System.out.println("Please enter username");
		User Users = new User();
		Users.setName(sc.next());

		System.out.println("Please enter user Id");
		Users.setUserId(sc.nextInt());

		System.out.println("Please enter the number of books you are issuing");
		Users.setMaxNumber(sc.nextInt());

		LibDao.insertLibraryDetails(Books);

	}

	public void updateEntry() throws SQLException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Book Title you want to update");
		Book Books = new Book();
		Books.setTitle(sc.next());

		System.out.println("Please Enter Author Name you want to update");
		Books.setAuthor(sc.next());

		System.out.println("Please Enter your Name you want to update");
		Books.setName(sc.next());

		System.out.println("Please enter username");
		User Users = new User();
		Users.setName(sc.next());

		System.out.println("Please enter user Id");
		Users.setUserId(sc.nextInt());

		System.out.println("Please enter the number of books you are issuing");
		Users.setMaxNumber(sc.nextInt());

		LibDao.updateLibraryDetails(Books);

	}

	public void deleteEntry() throws SQLException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Book Title you want to delete");
		Book Books = new Book();
		Books.setTitle(sc.next());

		System.out.println("Please Enter Author Name you want to delete");
		Books.setAuthor(sc.next());

		System.out.println("Please Enter Name you want to delete");
		Books.setName(sc.next());

		System.out.println("Please enter username");
		User Users = new User();
		Users.setName(sc.next());

		System.out.println("Please enter user Id");
		Users.setUserId(sc.nextInt());

		System.out.println("Please enter the number of books you are issuing");
		Users.setMaxNumber(sc.nextInt());

		LibDao.deleteLibraryDetails(Books);

	}

	public void viewAllEntry() throws SQLException {
		List<Book> book = LibDao.getAllLibraryRecord();

		System.out.println("Titile:\tAuthor:\tName");
		for (Book Book : book) {
			System.out.println(Book.getTitle() + "\t" + Book.getAuthor() + "\t" + Book.getName());
		}

	}

	public void viewAllEntry1() throws SQLException {
		List<User> user = LibDao.getAllLibraryRecord1();

		System.out.println("Name:\tUserName:\tUserId:\tMaximumNumberOfBooks");
		for (User User : user) {
			System.out.println(
					User.getName() + "\t" + User.getUserName() + "\t" + User.getUserId() + "\t" + User.getMaxNumber());
		}
	}
}
