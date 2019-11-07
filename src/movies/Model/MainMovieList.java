package movies.Model;

import java.util.ArrayList;

/**
 *
 * @author thor
 */
public class MainMovieList {
	ArrayList<Movies> movieList = null;
	MovieMapper movieMapper;

	public MainMovieList() {
		movieMapper = new MovieMapper();

	}

	public ArrayList<Movies> getMovieList() {
		return movieList;
	}

	public void loadListFromDB() {
		//movieList = fyldMigMedFilmFraDatabase();
		movieList = movieMapper.getMovieFromDB();
	}
	public void loadListFromFile() {
		movieList = fyldMigMedFilmFraDatabase();
	}

}
