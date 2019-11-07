package movies.Model;

/**
 *
 * @author thor
 */
public class Movies {

	/*
	Create Table: CREATE TABLE `movies` (
  `movie_id` int(11) NOT NULL AUTO_INCREMENT,
  `movie_title` varchar(100) NOT NULL,
  `director` varchar(50) NOT NULL,
  `year` year(4) NOT NULL,
  `genre_id` int(11) NOT NULL,
  PRIMARY KEY (`movie_id`)
	
	movie_id	movie_title	director	year	genre_id
1	Labyrinth	Jim Henson	1986	1
2	Highlander	Russell Mulcahy	1986	1

	*/
	int movie_id;
	String movie_title;
	String director;
	int year;
	String genre;

	public Movies(int movie_id, String movie_title, String director, int year) {
		this.movie_id = movie_id;
		this.movie_title = movie_title;
		this.director = director;
		this.year = year;
		this.genre= null;
	}

	public int getMovie_id() {
		return movie_id;
	}

	public String getMovie_title() {
		return movie_title;
	}

	public String getDirector() {
		return director;
	}

	public int getYear() {
		return year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
