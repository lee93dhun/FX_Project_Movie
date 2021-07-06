package domain;

public class Seat {
	
	private int sno;
	private String linex,liney;
	
	public Seat() {}

	public Seat(int sno, String linex, String liney) {
		this.sno = sno;
		this.linex = linex;
		this.liney = liney;
	}

	public Seat(String linex, String liney) {
		this.linex = linex;
		this.liney = liney;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getLinex() {
		return linex;
	}

	public void setLinex(String linex) {
		this.linex = linex;
	}

	public String getLiney() {
		return liney;
	}

	public void setLiney(String liney) {
		this.liney = liney;
	}
	
	
	
	
	
	

}
