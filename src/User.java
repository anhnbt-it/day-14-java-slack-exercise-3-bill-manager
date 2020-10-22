/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/22/2020
 * Time: 2:35 PM
 */
public class User {
    private int electricMeterCode;
    private String name;
    private String id;

    public User() {}

    public User(int electricMeterCode, String name, String id) {
        this.electricMeterCode = electricMeterCode;
        this.name = name;
        this.id = id;
    }

    public int getElectricMeterCode() {
        return electricMeterCode;
    }

    public void setElectricMeterCode(int electricMeterCode) {
        this.electricMeterCode = electricMeterCode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "electricMeterCode=" + electricMeterCode +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public void printFormat() {
        System.out.printf("%-5s %-15s %-10d\n", id, name, electricMeterCode);
    }
}
