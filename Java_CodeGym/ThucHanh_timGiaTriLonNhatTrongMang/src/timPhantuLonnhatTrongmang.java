import java.util.Scanner;

public class timPhantuLonnhatTrongmang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lengthArray;
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println();
			System.out.print("Nhập vào kích thước của mảng: ");
			lengthArray = sc.nextInt();
			if(lengthArray < 0) {
				System.out.println("Bạn nhập kích thước không phù hợp");
				System.out.println("Hãy nhập lại! ");
			}else {
				System.out.println("Kích thước của mảng đã nhập: " + lengthArray);
				break;
			}
		}
		
		int arrayNumber [] = new int[lengthArray];
		
		System.out.println();
		for(int i = 0; i < lengthArray; i++) {
			System.out.print("Nhập vào phần tử "+ (i+1) + ": ");
			arrayNumber[i] = sc.nextInt();
		}
		
		int max = arrayNumber[0];
		int viTri = 1;
		for(int i = 0; i < lengthArray; i++) {
			if(arrayNumber[i] > max) {
				max = arrayNumber[i];
				viTri = i+1;
			}
		}
		System.out.print("Giá trị lớn nhất trong mảng: " + max + " | " + "Vị trí: " + viTri);
		
		
		
	}

}
