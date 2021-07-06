package domain;

public class Movie {
	
	private int mno;
	private String title;
	private String genre;
	private String time;
	private String image;
	
	
	public Movie() {}


	public Movie(int mno, String title, String genre, String time, String image) {
		this.mno = mno;
		this.title = title;
		this.genre = genre;
		this.time = time;
		this.image = image;
	}

	public Movie(String title, String genre, String time, String image) {
		this.title = title;
		this.genre = genre;
		this.time = time;
		this.image = image;
	}


	public int getMno() {
		return mno;
	}


	public void setMno(int mno) {
		this.mno = mno;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
	

}
