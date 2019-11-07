package DataMapper;

import movies.Model.Movies;
import movies.Util.DBConnector;

import java.sql.*;
import java.util.ArrayList;

public class MovieMapper {
	
	public ArrayList<Movies> getMenuItems() {
		
		Connection connection = null;
		ArrayList<Movies> movieList = new ArrayList<>();
		
		Statement statement = null;
		ResultSet resultSet = null;
		String sqlQuery = "SELECT * FROM movies";
		
		try {
			connection = DBConnector.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			
			while (resultSet.next()) {
				int movieID = resultSet.getInt("movie_id");
				String movieTitle = resultSet.getString("movie_title");
				String director = resultSet.getString("director");
				int year = resultSet.getInt("year");
				Movies movie = new Movies(movieID, movieTitle,director , year);
				
				movieList.add(movie);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		return movieList;
	}
	
	public Movies getMovieById(int movieID) {
		
		Connection connection = null;
		Movies movie = null;
		PreparedStatement ps = null;
		ResultSet resultSet = null;
		String sqlQuery = "SELECT * FROM movies where movie_id = ?";
		
		try {
			connection = DBConnector.getConnection();
			ps = connection.prepareStatement(sqlQuery);
			ps.setInt(1, movieID);
			resultSet = ps.executeQuery();
			
			while (resultSet.next()) {
				movieID = resultSet.getInt("movie_id");
				String movieTitle = resultSet.getString("movie_title");
				String director = resultSet.getString("director");
				int year = resultSet.getInt("year");
				movie = new Movies(movieID, movieTitle, director, year);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return movie;
	}
}