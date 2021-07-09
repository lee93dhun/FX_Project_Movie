package domain;

public class Time {
	
	private int tno;
	private String rtime;
	private int tnum;
	
	public Time() {}

	public Time(int tno, String rtime, int tnum) {
		super();
		this.tno = tno;
		this.rtime = rtime;
		this.tnum = tnum;
	}

	public Time(String rtime, int tnum) {
		super();
		this.rtime = rtime;
		this.tnum = tnum;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getRtime() {
		return rtime;
	}

	public void setRtime(String rtime) {
		this.rtime = rtime;
	}

	public int getTnum() {
		return tnum;
	}

	public void setTnum(int tnum) {
		this.tnum = tnum;
	}
	
	


	
	
	
	
	

}
