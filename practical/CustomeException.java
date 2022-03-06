package package_faisal;

public class CustomeException {

	public static void main(String[] args) {
		try
		{
			int arr[]=new int[5];
		arr[4]=55/5;
			System.out.println(arr[4]);
			String s=null;
		     s.length();
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}



	}


