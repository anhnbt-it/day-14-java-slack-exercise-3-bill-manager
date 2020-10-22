import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/22/2020
 * Time: 3:34 PM
 */
public class BillManager {
    public BillManager() {}

    public boolean checkID(User user, String id) {
        if (user.getId().equals(id)) {
            return true;
        }
        return false;
    }

    public Bill add(Scanner input) {
        Bill bill = new Bill();
        User user = new User();
        user.setId(inputID(input));
        user.setName(inputName(input));
        user.setElectricMeterCode(inputElectricMeterCode(input));
        bill.setUser(user);
        bill.setSoMoi(inputSoMoi(input));
        bill.setSoCu(inputSoCu(input));

        bill.pay(); // Gọi phương thức thanh toán tiền

        return bill;
    }

    private double inputSoCu(Scanner input) {
        System.out.print("Nhập chỉ số công tơ điện cũ: ");
        while (true) {
            try {
                return Double.parseDouble(input.nextLine());
            } catch (NumberFormatException ex) {
                System.out.print("Sai định dạng! Nhập lại số công tơ điện cũ: ");
            }
        }
    }

    private double inputSoMoi(Scanner input) {
        System.out.print("Nhập chỉ số công tơ điện mới: ");
        while (true) {
            try {
                return Double.parseDouble(input.nextLine());
            } catch (NumberFormatException ex) {
                System.out.print("Sai định dạng! Nhập lại số công tơ điện mới: ");
            }
        }
    }

    public int inputElectricMeterCode(Scanner input) {
        System.out.print("Nhập mã công tơ điện: ");
        while (true) {
            try {
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException ex) {
                System.out.print("Sai định dạng! Nhập lại mã công tơ điện: ");
            }
        }
    }

    public static String inputName(Scanner input) {
        System.out.print("Nhập tên chủ hộ: ");
        return input.nextLine();
    }

    public static String inputID(Scanner input) {
        System.out.print("Nhập số nhà: ");
        return input.nextLine();
    }


}
