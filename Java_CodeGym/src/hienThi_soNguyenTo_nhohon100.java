
public class hienThi_soNguyenTo_nhohon100 {

	public static void main(String[] args) {
		System.out.println("Các số nguyên tố nhỏ hơn 100:");
       for(int gioiHan = 2; gioiHan < 100; gioiHan++) {
            if (isPrime(gioiHan)) {
                System.out.print(gioiHan + " ");
            }
        }

	}
	public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
