package javaCh16.q5;

public class Example {

	public static void main(String[] args) {
		Button btnOk = new Button();
		btnOk.setClickListener(() -> {
			System.out.println("Ok ��ư�� Ŭ���߽��ϴ�.");
		});
		btnOk.click();

		Button btnCancle = new Button();
		btnCancle.setClickListener(() -> {
			System.out.println("Cancle ��ư�� Ŭ���߽��ϴ�.");
		});
		btnCancle.click();

	}

}
