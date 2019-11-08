package Day11.JavaPrograms;

public class ExceptionHandlingExamples {

	public static void main(String[] args) {
		int[] arr= new int[5];
		try {
			arr[0] = 10;
			arr[1] = 13;
			arr[2] = 23;
			arr[3] = 78;
			arr[4] = 90;
			
			for(int i=0; i <5; i++){
				System.out.println(arr[i]);
			}
			
			//Exception should be written in proper order otherwise it will give errors in the script
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound exception occured");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Any Index out of bound exception occured");
		}catch(RuntimeException e) {
			System.out.println("Runtime exception occured");
		}finally{
		System.out.println("Final Exception and I always execute......:):):):)");
	}
			System.out.println("After exception");
}
}
		