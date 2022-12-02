package com.devfun.vo;

public class MovieVO {


	private int movieId;
	private String movieName;
	private String director;
	private String types;
	
	public void MoiveVO() {}
	
	public void MovieVO(int movieId, String movieName, String director, String types) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.director = director;
		this.types = types;
	}
	
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}
	
	@Override
	public String toString() {
		return "MovieVO [movieId=" + movieId + ", movieName=" + movieName + ", director=" + director + ", types="
				+ types + "]";
	}

}
