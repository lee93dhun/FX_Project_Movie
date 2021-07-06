package domain;

public class Time {
	
	private int tno;
	private String start,end;
	
	public Time() {}

	public Time(int tno, String start, String end) {
		this.tno = tno;
		this.start = start;
		this.end = end;
	}

	public Time(String start, String end) {
		this.start = start;
		this.end = end;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}
	
	
	
	
	

}
