import java.util.Scanner;

public class hienThi_cacLoaiHinh {

	public static void main(String[] args) {
		int luaChon = -1;
		Scanner sc = new Scanner(System.in);
		
		
		while(luaChon != 0) {
			System.out.println("---Menu---");
			System.out.println("01. Vẽ hình tam giác vuông");
			System.out.println("02. Vẽ hình chữ nhật");
			System.out.println("03. Vẽ hình vuông");
			System.out.print("Hãy đưa ra lựa chọn của bạn: ");
			
			if(sc.hasNextInt()) {
				luaChon = sc.nextInt();	
				
				switch(luaChon) {
					case 1:
						int height;
						System.out.print("Nhập vào chiều cao của tam giác: ");
						height = sc.nextInt();
						
						for (int i = 1; i <= height; i++) {
					        for (int j = 1; j <= i; j++) {
					            System.out.print("*");
					        }
					        System.out.println();
					    }
						break;
					case 2:
						int chieuDai, chieuRong;
						System.out.print("Nhập vào chiều dài của HCN: ");
						chieuDai = sc.nextInt();
						System.out.print("Nhập vào chiều rộng của HCN: ");
						chieuRong = sc.nextInt();
						
						for (int i = 0; i < chieuRong; i++) {
					        for (int j = 0; j < chieuDai; j++) {
					            System.out.print("* ");
					        }
					        System.out.println();
					    }
						break;
					case 3:
						int canh;
						System.out.print("Nhập vào cạnh của hình vuông: ");
						canh = sc.nextInt();
						
						for(int i = 0; i < canh; i++) {
							for(int j = 0; j < canh; j++) {
								System.out.print("* ");
							}
							System.out.println();
						}
					default:
						System.out.println("Bạn không đưa ra lựa chọn có trong menu");
						System.out.println("Hãy nhập lại");
						break;
				}
				
			}else {
				System.out.println("Không có lựa chọn nào như vậy.");
			}
		}

	}
}