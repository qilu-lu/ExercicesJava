package composantMonnais;

public class CompteBancaire {
	public static final String op1= "depot" ;
	public static final String op2= "retrait";

	public static int operation(String string, int i, int j) {
		// TODO Auto-generated method stub
		int total=j;
		if(string.equals(op1)) {
			total=total+i;
		}else if(string.equals(op2))
			total=total-i;
		else {
			throw new IllegalArgumentException("saisir bon operation");
		}
		return total;
	}

}
