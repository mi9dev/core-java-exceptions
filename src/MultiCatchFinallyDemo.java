
public class MultiCatchFinallyDemo {

	public static void main(String[] args) {

		try {
			System.out.println("start");
			String a= args[0];
			int x= Integer.parseInt(a);
			System.out.println(a);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array Index exception");
		} catch (NumberFormatException e) {
			System.out.println("Format exception");
		} finally {
			System.out.println("inside finally");
		}
		System.out.println("end");
	}

}
