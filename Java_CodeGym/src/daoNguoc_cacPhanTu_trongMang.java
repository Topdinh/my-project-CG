import java.util.Scanner;

public class daoNguoc_cacPhanTu_trongMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Nhập kích thước mảng mà bạn muốn (tối đa 20): ");
			a = Integer.parseInt(sc.nextLine());
			if(a > 20) {
				System.out.println("Bạn nhập quá kích thước của mảng, hãy nhập lại!");
			}else if (a <= 0) {
                System.out.println("Kích thước mảng phải lớn hơn 0!");
            }else {
				break;
			}
		}

		int[] array = new int [a];
		int[] array2 = new int [a];
		
		System.out.println("Hãy bắt đầu nhập vào các phần tử có trong mảng: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print("Phần tử thứ " + (i+1) + " : ");
			array[i] = Integer.parseInt(sc.nextLine());
		}
		
		for(int i = 0; i < array.length; i++) {
			array2[i] = array[array.length - 1- i];
		}
		
		System.out.print("Mảng 1: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.print("Mảng 2: ");
		for(int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
	}

}
