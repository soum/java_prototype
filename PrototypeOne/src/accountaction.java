
public class accountaction {

	public static void main(String[] args) {
		
		account WorkingAccount = new account();
		int[] x = {0, 200, 400};
		WorkingAccount.setRecord("soumya", x, 30);
		
		sort newSort = new sort();
		
		//System.out.print(WorkingAccount.getRecord());
		int []testArray = {5,8,2,1,3,0,1,7};
		System.out.print(newSort.sortArray(testArray));
	}

}

