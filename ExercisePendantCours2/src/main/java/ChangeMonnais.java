
public class ChangeMonnais {

	public static double dollarToEuro(double i) {
		if(i<0) {
			throw new IllegalArgumentException("pas le droit");
		}
		return i*1.2;
		
	}

	public static double EuroToDollar(double d) {
		if(d<0) {
			throw new IllegalArgumentException("pas le droit");
		}
		return d*0.8;
	}
	public static double convertir(String type,double i,String totype) {
		double d=0.;
		if (type.equalsIgnoreCase("Dollar")) {
			if(totype.equalsIgnoreCase("Euro")) {
				d=dollarToEuro(i);
			}
			
		}else if (type.equalsIgnoreCase("Euro")) {
			if(totype.equalsIgnoreCase("Dollar")) {
				d=EuroToDollar(i);
			}
		}
		return d;
		
	}

}
