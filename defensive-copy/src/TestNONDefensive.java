import java.util.Date;

public class TestNONDefensive {

	public static void main(String[] args) throws Exception {
		
		Date startDate=new Date();
		Date endDate=new Date();
		PeriodNonDefensive defensive=	new PeriodNonDefensive(startDate, endDate);
		endDate.setYear(-1);
		defensive.isValid();
	}

}
