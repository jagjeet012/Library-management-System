package org.jagjeet.library.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jagjeet.library.db.DBUtility;
import org.jagjeet.library.model.Book;
import org.jagjeet.library.model.User;

public class LibraryDaoImpl implements LibraryDao {
	DBUtility db = new DBUtility();
	PreparedStatement pst;
	ResultSet rs;
	String sql;

	public int insertLibraryDetails(Book details) throws SQLException {
		sql = "insert into Book(title, author, name)value(?,?,?)";
		pst = db.createPST(sql);
		pst.setString(1, details.getTitle());
		pst.setString(2, details.getAuthor());
		pst.setString(3, details.getName());
		return db.update(pst);
	}

	public int updateLibraryDetails(Book details) throws SQLException {
		sql = "UPDATE Book SET title=?, author=?, name=? WHERE Id=?";
		pst = db.createPST(sql);
		pst.setString(1, details.getTitle());
		pst.setString(2, details.getAuthor());
		pst.setString(3, details.getName());

		return db.update(pst);
	}

	public int deleteLibraryDetails(Book details) throws SQLException {
		sql = "DELETE FROM Book WHERE title=?, author=?, name=?";
		pst = db.createPST(sql);
		pst.setString(1, details.getTitle());
		pst.setString(2, details.getAuthor());
		pst.setString(3, details.getName());
		return db.update(pst);
	}

	public int insertLibraryDetails1(User details) throws SQLException {
		sql = "insert into Library(name, username, userId, maxNumber)value(?,?,?,?)";
		pst = db.createPST(sql);
		pst.setString(1, details.getName());
		pst.setString(2, details.getUserName());
		pst.setInt(3, details.getUserId());
		pst.setInt(4, details.getMaxNumber());
		return db.update(pst);
	}

	public int updateLibraryDetails1(User details) throws SQLException {
		sql = "UPDATE Library SET name=?, userName=?, userId=?, maxNumber WHERE id=?";
		pst = db.createPST(sql);
		pst.setString(1, details.getName());
		pst.setString(2, details.getUserName());
		pst.setInt(3, details.getUserId());
		pst.setInt(4, details.getMaxNumber());

		return db.update(pst);
	}

	public int deleteLibraryDetails1(User details) throws SQLException {
		sql = "DELETE FROM User WHERE name=?, userName=?, userId=?, maxNumber";
		pst = db.createPST(sql);
		pst.setString(1, details.getName());
		pst.setString(2, details.getUserName());
		pst.setInt(3, details.getUserId());
		pst.setInt(4, details.getMaxNumber());

		return db.update(pst);
	}

	public List<Book> getAllLibraryRecord() throws SQLException {
		List<Book> books = new ArrayList<Book>();

		sql = "select * from library";
		pst = db.createPST(sql);
		rs = db.query(pst);
		while (rs.next()) {
			Book Books = new Book();
			Books.setTitle(rs.getString("Title"));

			Books.setAuthor(rs.getString("Author"));

			Books.setName(rs.getString("Name"));

			books.add(Books);

		}
		return books;
	}

	public List<User> getAllLibraryRecord1() throws SQLException {

		List<User> books1 = new ArrayList<User>();

		sql = "SELECT *" + "FROM book\r\n" + "INNER JOIN user ON book.Id= user.bookId";

		sql = "select * from library";
		pst = db.createPST(sql);
		rs = db.query(pst);
		while (rs.next()) {
			User Books1 = new User();
			Books1.setName(rs.getString("Name"));

			Books1.setUserId(rs.getInt("Id"));

			Books1.setUserName(rs.getString("userName"));

			Books1.setMaxNumber(rs.getInt("Maximum number of Books"));

			books1.add(Books1);

		}
		return books1;
	}

}
