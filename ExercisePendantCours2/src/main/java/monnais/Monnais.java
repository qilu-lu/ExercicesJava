package monnais;

public class Monnais {
	public double convertirMonnais(Money n,double m) {
		if(n.equals(Money.dollar)) {
			return dollarToEuro(m);
			
		}else
			return EuroToDollar(m);
	}

	public double dollarToEuro(double dollar) {
		
		return dollar*0.8;
		
	}

	public double EuroToDollar(double euro) {
		
		return euro*1.2;
		
	}
	
}
