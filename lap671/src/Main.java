import java.util.Scanner;

public class Main {
    double balance;

    public static Scanner sc = new Scanner(System.in);
    public static int loggedInAccountIndex = -1; //เก็บเป็นบัญชีต้นทางหลังเข้าสู่ระบบ

    // Account : Name , number AC , Money , PIN
    public static String[][] Account = {
            { "Jaxon Storm", "987-654-3210", "102421", "582493" },
            { "Raven Steele", "321-098-7654", "91010", "761820" }
    };

    /*
     * เวลาตอนใช้ถ้าจะเอาไปทำงานทางคณิตก็ใช้งาน
     * Method ไม่ทศนิยม : Integer.parseInt(Account[0][2]) หรือ
     * Method มีทศนิยม : Double.parseDouble(Account[0][2])
     *
     * แล้วพอจะเอากลับมาแปลี่ยนค่าหลังจากหักค่าใช้จ่ายแล้วเราต้องใช้
     * Method แปลงค่ากลับเป็น String : String.valueOf();
     * เช่น Account[0][2] = String.valueOf(Double.parseDouble(Account[0][2]) - 500);
     */

    public static void main(String[] args) {
        ShowME(); // ทำให้ง่ายเวลาที่เรา log-In ให้จารย์ดูจะได้จำรหัสผ่านได้
        login();
        deposit();
        load();
        ShowME();
    }
    public static void ShowME() {
        for (String[] Account1 : Account) {
            System.out.println("--------------------------\nPerson :" + Account1[0] +
                    "\nNumber Account : " + Account1[1] +
                    "\nMoney : " + Account1[2] +
                    "\n\n# hide User PIN --> " + Account1[3] +
                    "\n--------------------------");
        }
    }
    //Ping
    public static boolean login() {
        System.out.println("======================================");
        System.out.println("กรุณาเข้าสู่ระบบ");
        System.out.print("กรุณากรอกหมายเลขบัญชีของท่าน: ");
        String accountNumber = sc.next();
        System.out.print("กรุณากรอกรหัสผ่าน: ");
        String pin = sc.next();

        for (int i = 0; i < Account.length; i++) {
            if (Account[i][1].equals(accountNumber) && Account[i][3].equals(pin)) {
                loggedInAccountIndex = i; // เก็บตำแหน่งของบัญชีที่เข้าสู่ระบบ
                System.out.println("เข้าสู่ระบบสำเร็จ.");
                System.out.println("======================================");
                return true;
            }
        }
        System.out.println("หมายเลขบัญชีหรือรหัสผ่านไม่ถูกต้อง.");
        return false;
    }

    //FAIฝากเงิน
    public static void deposit(){
        if (loggedInAccountIndex == -1) {
            System.out.println("กรุณาเข้าสู่ระบบก่อน");
        }

        System.out.println("กรุณากรอกจำนวนเงินที่ต้องการฝาก: ");
        double amount = sc.nextDouble();
        if(amount<=0){
            System.out.println("กรุณากรอกจำนวนเงินที่มากกว่า 0 !!");
        }
        //อัปเดตยอดคงเหลือ
        double balance = Double.parseDouble(Account[loggedInAccountIndex][2]);
        balance += amount;
        Account[loggedInAccountIndex][2] = String.valueOf(balance);

        System.out.println("\nฝากสำเร็จ!! "+"\nยอดเงินคงเหลือ: " +balance+" บาท");
    }

    //FAIสินเชื่อ
    public static void load(){
        if (loggedInAccountIndex == -1) {
            System.out.println("กรุณาเข้าสู่ระบบก่อน");
            return;
        }

        double creditLimit = 50000.0;

        System.out.println("กรุณากรอกจำนวนเงินที่ต้องการกู้ยืม: ");
        double loanAmount = sc.nextDouble();

        //ตรวจสอบการขอสินเชื่อ
        if (loanAmount <= 0){
            System.out.println("กรุณากรอกจำนวนเงินที่มากกว่า 0 !!");
        }
        if (loanAmount > creditLimit){
            System.out.println("วงเงินสินเชื่อเกินกำหนด (วงเงินสูงสุด: "+creditLimit+" บาท)");
        }

        //คำนวนดอกเบี้ย
        double interestRate = 0.05;
        double interest = loanAmount * interestRate;
        double totalAmountToRepay = loanAmount + interest;

        //อัปเดตยอดคงเหลือ
        double balance = Double.parseDouble(Account[loggedInAccountIndex][2]);
        balance += interest;
        Account[loggedInAccountIndex][2] = String.valueOf(balance);

        System.out.println("\nสินเชื่อสำเร็จ!! ยอดทียืม: "+loanAmount+" บาท"+ "\nดอกเบี้ย: "+interest+" บาท"+ "\nยอดรวมที่ต้องคืน: "+totalAmountToRepay+" บาท");
    }
}