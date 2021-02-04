package anniversaire;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Anniversaire {
	public static void main(String[] args) throws ParseException {
		
	
//		SimpleDateFormat bartDateFormat = new SimpleDateFormat("MMMM-dd-yyyy");
//		Date date = new Date();
//		System.out.println(bartDateFormat.format(date));
	
		verifierAnniversaire("02-01-2009" ,"02-01-2009");
	}
	//Date now=new Date(int 2020,int 6,int 5);
	public String changeFormat(String date) {
		String month="";
		String jour="";
		String year="";
		for (int i = 0; i < 2; i++) {
			month=month+date.charAt(i);
		}
		for (int i = 3; i < 5; i++) {
			jour=jour+date.charAt(i);
		}
		for (int i = 6; i < 10; i++) {
			year=year+date.charAt(i);
		}
		
		return null;
		
	}
	
public static boolean verifierAnniversaire(String i ,String j) {
	//SimpleDateFormat bartDateFormat = new SimpleDateFormat("MMMM-dd-yyyy");
	//if(bartDateFormat.format(i).equals(bartDateFormat.format(i)))
	if(i.equals(j))
	return true;
	return false;
	
}
}
