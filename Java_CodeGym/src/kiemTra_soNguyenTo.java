import java.util.Scanner;

public class kiemTra_soNguyenTo {

	public static void main(String[] args) {
		int numb;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Nhập vào một số a = ");
		numb = sc.nextInt();
		
		if(numb < 2) {
			System.out.println(numb + " " + "không phải là số nguyên tố");
		}else {
			int i = 2;
			boolean check = true;
			while(i <= Math.sqrt(numb)) {
				if(i % 2 == 0) {
					check = false;
					break;
				}
				i++;
			}
			if(check) {
				System.out.println(numb + " " + "là số nguyên tố");
			}else {
				System.out.println(numb + " " + "không phải là số nguyên tố");
			}
		}

	}

}
