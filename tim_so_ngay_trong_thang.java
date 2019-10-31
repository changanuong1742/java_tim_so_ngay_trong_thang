import java.util.Scanner;

public class tim_so_ngay_trong_thang {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap So Thang Muon Kiem Tra: ");
        int month = scanner.nextInt();


        switch (month){
            case 2:
                System.out.println("Co 28 Ngay");
                break;

            case 1:
                System.out.println("Thang co 31 ngay");
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                break;
            case 4:
                System.out.println("Thang nay co 30 ngay");
            case 6:
            case 9:
            case 11:
                break;



        }


    }
}
