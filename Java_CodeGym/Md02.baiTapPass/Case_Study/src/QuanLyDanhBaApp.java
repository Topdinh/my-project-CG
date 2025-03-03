import java.io.IOException;
import java.util.Scanner;

public class QuanLyDanhBaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyDanhBa quanLy = new QuanLyDanhBa();
        while (true) {
            System.out.println("1. Xem danh sách\n2. Thêm mới\n3. Cập nhật\n4. Xóa\n5. Tìm kiếm\n6. Sắp xếp\n7. Đọc từ file\n8. Ghi vào file\n9. Thoát");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    quanLy.hienThiDanhBa();
                    break;
                case 2:
                    System.out.println("Nhập thông tin danh bạ: ");
                    System.out.print("SĐT: ");
                    String sdt = scanner.nextLine();
                    System.out.print("Nhóm: ");
                    String nhom = scanner.nextLine();
                    System.out.print("Họ tên: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Giới tính: ");
                    String gioiTinh = scanner.nextLine();
                    System.out.print("Địa chỉ: ");
                    String diaChi = scanner.nextLine();
                    System.out.print("Ngày sinh: ");
                    String ngaySinh = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.println("Bạn có chắc chắn muốn thêm danh bạ này? (Y/N): ");
                    String confirm = scanner.nextLine();
                    if (confirm.equalsIgnoreCase("Y")) {
                        quanLy.themDanhBa(new DanhBa(sdt, nhom, hoTen, gioiTinh, diaChi, ngaySinh, email));
                    } else {
                        System.out.println("Hủy thêm danh bạ.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập số điện thoại cần cập nhật: ");
                    String sdtCapNhat = scanner.nextLine();
                    System.out.println("Nhập thông tin mới: ");
                    quanLy.capNhatDanhBa(sdtCapNhat, new DanhBa(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
                    break;
                case 4:
                    System.out.print("Nhập số điện thoại cần xóa: ");
                    quanLy.xoaDanhBa(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Nhập từ khóa tìm kiếm: ");
                    quanLy.timKiem(scanner.nextLine());
                    break;
                case 6:
                    quanLy.sapXep();
                    break;
                case 7:
                    System.out.print("Nhập đường dẫn file CSV: ");
                    try {
                        quanLy.docFile(scanner.nextLine());
                    } catch (IOException e) {
                        System.out.println("Lỗi đọc file!");
                    }
                    break;
                case 8:
                    System.out.print("Nhập đường dẫn file CSV để ghi: ");
                    try {
                        quanLy.ghiFile(scanner.nextLine());
                    } catch (IOException e) {
                        System.out.println("Lỗi ghi file!");
                    }
                    break;
                case 9:
                    System.out.println("Thoát chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}