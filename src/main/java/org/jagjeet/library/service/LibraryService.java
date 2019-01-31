package org.jagjeet.library.service;

import java.sql.SQLException;

public interface LibraryService {
	public void createEntry() throws SQLException;

	public void updateEntry() throws SQLException;

	public void deleteEntry() throws SQLException;

	public void viewAllEntry() throws SQLException;

	public void viewAllEntry1() throws SQLException;

}
