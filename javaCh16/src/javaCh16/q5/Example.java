package javaCh16.q5;

public class Example {

	public static void main(String[] args) {
		Button btnOk = new Button();
		btnOk.setClickListener(() -> {
			System.out.println("Ok 버튼을 클릭했습니다.");
		});
		btnOk.click();

		Button btnCancle = new Button();
		btnCancle.setClickListener(() -> {
			System.out.println("Cancle 버튼을 클릭했습니다.");
		});
		btnCancle.click();

	}

}
