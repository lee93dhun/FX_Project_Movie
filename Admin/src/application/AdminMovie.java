package application;

public class AdminMovie {
	
	private int mno;
	private String mtitle;
	private String mgenre;
	private String moutline;
	private String mrelease;
	private String mrating;
	private int mprice;
	private String mimage;
	private int mcondition;
	
	public AdminMovie() {}

	public AdminMovie(int mno, String mtitle, String mgenre, String moutline, String mrelease, String mrating, int mprice,
			String mimage) {
		this.mno = mno;
		this.mtitle = mtitle;
		this.mgenre = mgenre;
		this.moutline = moutline;
		this.mrelease = mrelease;
		this.mrating = mrating;
		this.mprice = mprice;
		this.mimage = mimage;
	}
	
	public AdminMovie(int mno, String mtitle, String mgenre, String moutline, String mrating, int mprice) {
		this.mno = mno;
		this.mtitle = mtitle;
		this.mgenre = mgenre;
		this.moutline = moutline;
		this.mrating = mrating;
		this.mprice = mprice;
	}
	

	public AdminMovie(String mtitle, String mgenre, String moutline, String mrelease, String mrating, int mprice,
			String mimage) {
		this.mtitle = mtitle;
		this.mgenre = mgenre;
		this.moutline = moutline;
		this.mrelease = mrelease;
		this.mrating = mrating;
		this.mprice = mprice;
		this.mimage = mimage;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMtitle() {
		return mtitle;
	}

	public void setMtitle(String mtitle) {
		this.mtitle = mtitle;
	}

	public String getMgenre() {
		return mgenre;
	}

	public void setMgenre(String mgenre) {
		this.mgenre = mgenre;
	}

	public String getMoutline() {
		return moutline;
	}

	public void setMoutline(String moutline) {
		this.moutline = moutline;
	}

	public String getMrelease() {
		return mrelease;
	}

	public void setMrelease(String mrelease) {
		this.mrelease = mrelease;
	}

	public String getMrating() {
		return mrating;
	}

	public void setMrating(String mrating) {
		this.mrating = mrating;
	}

	public int getMprice() {
		return mprice;
	}

	public void setMprice(int mprice) {
		this.mprice = mprice;
	}

	public String getMimage() {
		return mimage;
	}

	public void setMimage(String mimage) {
		this.mimage = mimage;
	}
	
	public int getMcondition() {
		return mcondition;
	}

	public void setMcondition(int mcodition) {
		this.mcondition = mcodition;
	}

}
