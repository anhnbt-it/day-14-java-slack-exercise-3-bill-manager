import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/22/2020
 * Time: 2:38 PM
 */
public class Bill {

    private double soCu;
    private double soMoi;
    private double billsToPay;
    private User user;

    public Bill() {
    }

    public Bill(double soCu, double soMoi, User user) {
        this.soCu = soCu;
        this.soMoi = soMoi;
        this.user = user;
    }

    public double getSoCu() {
        return soCu;
    }

    public void setSoCu(double soCu) {
        this.soCu = soCu;
    }

    public double getSoMoi() {
        return soMoi;
    }

    public void setSoMoi(double soMoi) {
        this.soMoi = soMoi;
    }

    public double getBillsToPay() {
        return billsToPay;
    }

    public void setBillsToPay(double billsToPay) {
        this.billsToPay = billsToPay;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "soCu=" + soCu +
                ", soMoi=" + soMoi +
                ", billsToPay=" + billsToPay +
                ", user=" + user.toString() +
                '}';
    }

    public double pay() {
        double total = (soMoi - soCu) * 750;
        setBillsToPay(total);
        return billsToPay;
    }

    //    public void show() {
//        System.out.printf("%5s %15s %10s\n", "Số nhà", "Tên chủ hộ", "Mã số công tơ");
//        for (User user: userlist) {
//            user.printFormat();
//        }
//    }
}
