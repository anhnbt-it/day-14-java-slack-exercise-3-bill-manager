import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/22/2020
 * Time: 2:43 PM
 */
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Bill> billList = new ArrayList<>();
        BillManager billManager = new BillManager();
        do {
            System.out.println("==========================");
            System.out.println("QUẢN LÝ BIÊN LAI TIỀN ĐIỆN");
            System.out.println("\tBy AnhNBT (1.0)");
            System.out.println("==========================");
            System.out.println("1. Nhập hộ gia đình");
            System.out.println("2. Hiển thị hộ gia đình theo số nhà");
            System.out.println("3. Tính tiền điện phải trả");
            System.out.println("0. Thoát");
            System.out.println("==========================");
            System.out.print("Nhập lựa chọn của bạn [0-Thoát]: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    System.out.println("Thoát!");
                    System.exit(0);
                case 1:
                    System.out.println("==========================");
                    System.out.println("Nhập thông tin hộ gia đình");
                    System.out.println("==========================");
                    System.out.print("Số lượng hộ muốn nhập: ");
                    int size = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < size; i++) {
                        System.out.println("--------------------------");
                        System.out.println("Hộ gia đình thứ '" + (i + 1) + "'");
                        Bill bill = billManager.add(input);
                        billList.add(bill);
                    }
                    System.out.println("Done.");
                    break;
                case 2:
                    for (int i = 0; i < billList.size(); i++) {
                        System.out.println(billList.get(i).toString());
                    }
                    break;
                case 3:
                    System.out.println("==========================");
                    System.out.println("Nhập thông tin hộ gia đình");
                    System.out.println("==========================");
                    for (int i = 0; i < billList.size(); i++) {
                        System.out.println(billList.get(i).toString());
                    }
                    break;
            }
        } while (true);
    }
}
