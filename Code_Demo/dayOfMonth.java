import java.util.Scanner;

public class dayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam: ");
        int year = sc.nextInt();
        System.out.print("Nhap thang: ");
        int month = sc.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang co 31 ngay!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang nay co 30 ngay!");
                break;
            case 2:
                if(year%4 == 0 && year%100 != 0){
                    System.out.println("Thang nay co 29 ngay!");
                    break;
                }
                else{
                    System.out.println("Thang nay co 28 ngay!");
                    break;
                }
        }
    }
}
