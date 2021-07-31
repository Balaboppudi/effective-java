import java.util.Date;

public class PeriodDefensive {
	private  Date start;
	private  Date end;
	
	public PeriodDefensive(Date start, Date end) throws Exception{
		this.start =new Date( start.getTime());
		this.end = new Date( end.getTime());
		
	}
	public boolean isValid() {
		if(end.before(start)) {
			throw new IllegalArgumentException();
		}
		return true;
	}
	public Date getStart() {
		return start;
	}
	
	public Date getEnd() {
		return end;
	}
	
}
