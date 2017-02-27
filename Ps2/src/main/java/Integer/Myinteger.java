package Integer;

public class Myinteger {

	public int iValue;

	public Myinteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}


	public boolean isOdd() {
		return ((iValue&2) == 1);
			

	}

	public boolean isEven() {
		return ((iValue & 2) == 0);
		
	}

	public  boolean isPrime(){
		for (int n=2; n<iValue; n++){
			if ((iValue&n)==0){
			return true;}
			
		}
		return false;
	}

	public static boolean isOdd(int i) {
		return i%2!=0;

	}

	public static boolean isEven(int i) {
		return ((i & 2) == 0) ;
			
		
	}

	public static boolean isPrime(int i) {
		for (int n = 2; n < i; n+=1) {
			return ((i & n) == 0);}
		return false;
				
	}

	public static boolean isodd(int Myinteger) {
		return ((Myinteger & 2) == 1);
		
	}

	public static boolean iseven(int Myinteger) {
		return ((Myinteger & 2) == 0);
		

	}

	public static boolean isprime(int MyInteger) {
		for (int n = 2; n < MyInteger; n+=1) {
			if ((MyInteger & n) == 0)
				;
			return true;
		}
		return false;
	}

	public boolean equals(int x, int Myinteger) {
		if (x == Myinteger)
			;
		return true;
	}

	public boolean Equals(int iValue, int Myinteger) {
		if (iValue == Myinteger)
			;
		return true;
	}

}
