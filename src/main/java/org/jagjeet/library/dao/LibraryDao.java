package org.jagjeet.library.dao;

import java.sql.SQLException;
import java.util.List;

import org.jagjeet.library.model.Book;
import org.jagjeet.library.model.User;

public interface LibraryDao {
	public int insertLibraryDetails(Book details) throws SQLException;

	public int updateLibraryDetails(Book details) throws SQLException;

	public int deleteLibraryDetails(Book details) throws SQLException;

	public int insertLibraryDetails1(User details) throws SQLException;

	public int updateLibraryDetails1(User details) throws SQLException;

	public int deleteLibraryDetails1(User details) throws SQLException;

	public List<Book> getAllLibraryRecord() throws SQLException;

	public List<User> getAllLibraryRecord1() throws SQLException;
}
