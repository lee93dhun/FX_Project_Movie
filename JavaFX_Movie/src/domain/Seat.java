package domain;

public class Seat {

	private int sno;
	private String snum;

	public Seat() {

	}

	public Seat(int sno, String snum) {
		this.sno = sno;
		this.snum = snum;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSnum() {
		return snum;
	}

	public void setSnum(String snum) {
		this.snum = snum;
	}

}
