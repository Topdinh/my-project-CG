import java.io.*;
import java.util.*;

class DanhBa {
    private String soDienThoai;
    private String nhom;
    private String hoTen;
    private String gioiTinh;
    private String diaChi;
    private String ngaySinh;
    private String email;

    public DanhBa(String soDienThoai, String nhom, String hoTen, String gioiTinh, String diaChi, String ngaySinh, String email) {
        this.soDienThoai = soDienThoai;
        this.nhom = nhom;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getHoTen() {
        return hoTen;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s, %s, %s", soDienThoai, nhom, hoTen, gioiTinh, diaChi, ngaySinh, email);
    }
}
