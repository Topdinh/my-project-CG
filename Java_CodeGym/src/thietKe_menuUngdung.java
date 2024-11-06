import java.util.Scanner;

public class thietKe_menuUngdung {

	public static void main(String[] args) {
		int luaChon = -1;
		Scanner sc = new Scanner(System.in);
		
		while(luaChon != 0) {
			System.out.println("---Menu---");
			System.out.println("01. Vẽ hình tam giác");
			System.out.println("02. Vẽ hình bình hành");
			System.out.println("03. Vẽ hình vuông");
			System.out.println("04. Vẽ hình chữ nhật");
			System.out.println("Hãy đưa ra lựa chọn của bạn: ");
			
			if(sc.hasNextInt()) {
				luaChon = sc.nextInt();
				
				switch(luaChon) {
					case 1:
						System.out.println("********");
						System.out.println("*******");
						System.out.println("******");
						System.out.println("*****");
						System.out.println("****");
						System.out.println("***");
						System.out.println("**");
						System.out.println("*");
						break;
					case 2:
						System.out.println("********");
						System.out.println(" ********");
						System.out.println("  ********");
						System.out.println("   ********");
						System.out.println("    ********");
						System.out.println("     ********");
						break;
					case 3:
						System.out.println("* * * * * * * *");
						System.out.println("* * * * * * * *");
						System.out.println("* * * * * * * *");
						System.out.println("* * * * * * * *");
						System.out.println("* * * * * * * *");
						System.out.println("* * * * * * * *");
						System.out.println("* * * * * * * *");
						System.out.println("* * * * * * * *");
						break;
					case 4:
						System.out.println("* * * * * * * *");
						System.out.println("* * * * * * * *");
						System.out.println("* * * * * * * *");
						System.out.println("* * * * * * * *");
						break;
					case 0:
						System.exit(0);
					default:
						System.out.println("Không có lựa chọn nào giống với yêu cầu của bạn");
				}
			}else {
				System.out.println("Hãy nhập vào số tự nhiên có trong Menu để vẽ.");
			}
			
		}
	}

}
