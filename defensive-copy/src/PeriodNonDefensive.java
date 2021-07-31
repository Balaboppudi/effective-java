import java.util.Date;

public class PeriodNonDefensive {
	private  Date start;
	private  Date end;
	
	public PeriodNonDefensive(Date start, Date end) throws Exception{
		this.start = start;
		this.end = end;
		
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
