import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class QuanLyDanhBa {
    private List<DanhBa> danhBaList = new ArrayList<>();

    public void hienThiDanhBa() {
        for (DanhBa db : danhBaList) {
            System.out.println(db);
        }
    }

    public void themDanhBa(DanhBa db) {
        danhBaList.add(db);
        System.out.println("Đã thêm danh bạ thành công!");
    }

    public void capNhatDanhBa(String soDienThoai, DanhBa dbMoi) {
        for (int i = 0; i < danhBaList.size(); i++) {
            if (danhBaList.get(i).getSoDienThoai().equals(soDienThoai)) {
                danhBaList.set(i, dbMoi);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy danh bạ!");
    }

    public void xoaDanhBa(String soDienThoai) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn có chắc chắn muốn xóa danh bạ này? (Y/N): ");
        String confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("Y")) {
            danhBaList.removeIf(db -> db.getSoDienThoai().equals(soDienThoai));
            System.out.println("Xóa danh bạ thành công!");
        } else {
            System.out.println("Hủy xóa danh bạ.");
        }
    }

    public void timKiem(String keyword) {
        for (DanhBa db : danhBaList) {
            if (db.getHoTen().contains(keyword) || db.getSoDienThoai().contains(keyword)) {
                System.out.println(db);
            }
        }
    }

    public void sapXep() {
        danhBaList.sort(Comparator.comparing(DanhBa::getHoTen));
        System.out.println("Đã sắp xếp danh bạ theo họ tên!");
    }

    public void ghiFile(String path) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (DanhBa db : danhBaList) {
                writer.write(db.toString());
                writer.newLine();
            }
        }
        System.out.println("Ghi file thành công!");
    }

    public void docFile(String path) throws IOException {
        danhBaList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length == 7) {
                    danhBaList.add(new DanhBa(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]));
                }
            }
        }
        System.out.println("Đọc file thành công!");
    }
}