package domain;

public class Reservation {
	private int rno;
	private String mseat;
	private int rtime;
	private int mno;
	private int person;
	
	
	public Reservation() {}


	public Reservation(int rno, String mseat, int rtime, int mno, int person) {
		super();
		this.rno = rno;
		this.mseat = mseat;
		this.rtime = rtime;
		this.mno = mno;
		this.person = person;
	}


	public Reservation(String mseat, int rtime, int mno, int person) {
		super();
		this.mseat = mseat;
		this.rtime = rtime;
		this.mno = mno;
		this.person = person;
	}


	public int getRno() {
		return rno;
	}


	public void setRno(int rno) {
		this.rno = rno;
	}


	public String getMseat() {
		return mseat;
	}


	public void setMseat(String mseat) {
		this.mseat = mseat;
	}


	public int getRtime() {
		return rtime;
	}


	public void setRtime(int rtime) {
		this.rtime = rtime;
	}


	public int getMno() {
		return mno;
	}


	public void setMno(int mno) {
		this.mno = mno;
	}


	public int getPerson() {
		return person;
	}


	public void setPerson(int person) {
		this.person = person;
	}
	
	

	
	
	
	
	

}
