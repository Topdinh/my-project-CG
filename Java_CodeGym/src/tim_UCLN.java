import java.util.Scanner;

public class tim_UCLN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập vào số a = ");
		a = sc.nextInt();
		System.out.print("Nhập vào số b = ");
		b = sc.nextInt();
		
		a = Math.abs(a);
		b = Math.abs(b);
		
		if(a == 0 || b == 0) {
			System.out.println("Không tồn tại ước chung lớn nhất.");
		}else if(a == b) {
			System.out.println("a và b là 1");
		}else {
			while(a != b) {
				if(a > b) {
					a = a - b;
				}else {
					b = b - a;
				}
			}
			System.out.println("Ước chung lớn nhất của a và b là: " + a);
		}
	}

}
