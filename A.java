
public class A {
	public static void main(String args[])
	{
		Integer arr[] = { 21, 5,6, 40};
		// intialization of variables
		
		int Largest = 0 , secondlargest = 0 , thirdlargest =0;
		
		/* for (int i= 0 ; i<arr.length;i++) 
		 * {
		 */
		
		for (int ele:arr) {
			
			if (ele>Largest) {
				
				secondlargest = Largest;
				
				Largest = ele;
									
			} else if(ele>secondlargest) {
				
				thirdlargest = secondlargest;
				secondlargest = ele;
				
			} else if(ele>thirdlargest) {
				
				thirdlargest = ele;
			}
			
		}
				
		
		System.out.println(thirdlargest);
		System.out.println(secondlargest);
		System.out.println(Largest);
	}		

}
