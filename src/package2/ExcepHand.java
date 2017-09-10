package package2;

public class ExcepHand {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try{
			int a[] = new int[2];
			//int x = 100/0;
			System.out.println(a[3]);
		} catch(ArithmeticException e){
			System.out.println(e);
		} catch(Exception e){
			System.out.println(e);
		}
		System.out.println("s");
	}

}
