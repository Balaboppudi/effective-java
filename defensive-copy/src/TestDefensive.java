import java.util.Date;

public class TestDefensive {

	public static void main(String[] args) throws Exception {
		
		Date startDate=new Date();
		Date endDate=new Date();
		PeriodDefensive defensive=	new PeriodDefensive(startDate, endDate);
		endDate.setYear(-1);
		defensive.isValid();
	}

}
