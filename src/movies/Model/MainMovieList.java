package movies.Model;

import java.util.ArrayList;

/**
 *
 * @author thor
 */
public class MainMovieList {
	ArrayList<Movies> movieList = null;

	public MainMovieList() {

	}

	public ArrayList<Movies> getMovieList() {
		return movieList;
	}

	public void loadListFromDB() {
		movieList = fyldMigMedFilmFraDatabase();
	}
	public void loadListFromFile() {
		movieList = fyldMigMedFilmFraDatabase();
	}

}
