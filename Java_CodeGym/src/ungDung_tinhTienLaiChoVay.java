import java.util.Scanner;

public class ungDung_tinhTienLaiChoVay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tienLai, tienGui, laiSuat;
		int soThangGui;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập vào số tiền đã gửi: ");
		tienGui = sc.nextDouble();
		System.out.print("Nhập vào số tháng bạn gửi: ");
		soThangGui = sc.nextInt();
		System.out.print("Nhập vào lãi suất: ");
		laiSuat = sc.nextDouble();
		
		tienLai = 0;
		for(int i = 0; i < soThangGui; i++) {
			tienLai += tienGui * (laiSuat / 100) / 12 * soThangGui;
		}
		
		System.out.println("Số tiền lãi sau " + soThangGui + " " + "là " + tienLai);
		sc.close();
	}

}
