import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] students = {"Topdinh", "Nguyễn Đại Nghĩa", "Topdinhfake", "GGnoname", "Nguyễn Quốc Duy Hưng"};
		String studentName;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên học sinh: ");
		
		studentName = sc.nextLine();
		boolean isExist = false;
		
		for(int i = 0; i < students.length; i++) {
			if(students[i].equals(studentName)) {
				System.out.println("Học sinh này tên : " + studentName + " | " + "Vị trí: " + (i+1));
				isExist = true;
			}
		}
		if(!isExist) {
			System.out.println("Học sinh này tên : " + studentName + " " + "không tồn tại trong danh sách.");
		}
	}

}
