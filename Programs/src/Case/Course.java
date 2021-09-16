package Case;

public class Course {

	private int cid;
	private String cname;
	private int duration;
	private double fees;
	
	Course(int cid,String cname,int duration,double fees)
	{
		this.cid=cid;
		this.cname=cname;
		this.duration=duration;
		this.fees=fees;
		
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", duration=" + duration + ", fees=" + fees + "]";
	}
	
	
			
}
