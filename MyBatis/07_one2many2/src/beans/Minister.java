package beans;

public class Minister {
	private Integer mid;
	private String mname;
	
	
	
	public Integer getMd() {
		return mid;
	}
	public void setMd(Integer md) {
		this.mid = md;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "Minister [mid=" + mid + ", mname=" + mname + "]";
	}
}
