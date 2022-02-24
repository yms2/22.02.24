
public class AccountingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Value of supply : " + 10000.0);
		System.out.println("VAT : "+ (10000.0 * 0.1));
		System.out.println("Total : " + (10000.0 + 10000.0 * 0.1));
//		쓴 비용
		System.out.println("Expense :" + (10000.0 * 0.3));
//		순이익
		System.out.println("Income :" + (10000.0 - (10000.0 * 0.3)));
//		배당 5대 3대 2로 나누는것
		System.out.println("Dividend :" + (10000.0 -(10000.0 * 0.3)) * 0.5);
		System.out.println("Dividend :" + (10000.0 -(10000.0 * 0.3)) * 0.3);
		System.out.println("Dividend :" + (10000.0 -(10000.0 * 0.3)) * 0.2);
//	edit find/replace 하면 고급가 변경
	}

}
