package ex08_02_constructor;

public class InheritanceExample2 {
	public static void main(String args[]) {
		/* 오류 발생
		 * CheckingAccount obj_error = new CheckingAccount();
		 */
		
		CheckingAccount obj = new CheckingAccount("111-22-33333333", "홍길동", 0 , "5555-6666-7777-8888");
		
		obj.deposit(100000);
		try {
			int paidAmount = obj.pay("5555-6666-7777-8888",47000);
			System.out.println("지불액:"+paidAmount);
			System.out.println("잔액:"+obj.balance);
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}
}