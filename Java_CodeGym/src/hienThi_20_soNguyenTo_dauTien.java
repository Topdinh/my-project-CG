
public class hienThi_20_soNguyenTo_dauTien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0; 
        int number = 2; 
        
        System.out.println("20 số nguyên tố đầu tiên là:");
        while (count < 20) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
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

