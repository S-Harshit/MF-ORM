package com.ncu;

import java.sql.SQLException;

public interface Idao {
	void addMovies(Moviesdata obj) throws SQLException;

	void deleteMovies(Moviesdata obj) throws SQLException;

	void updateMovies(Moviesdata obj) throws SQLException;

	void viewMovies(Moviesdata obj) throws SQLException;
}
