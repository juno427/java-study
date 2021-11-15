package applicaiton;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Account> mAccounts = new ArrayList<>();
    private static boolean mIsRunning = true;

    public static void main(String[] args) {
        while (mIsRunning) {
            displayMenu();
        }
    }

    private static void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. 계좌 개설");
        System.out.println("2. 계좌 조회");
        System.out.println("3. �?리자 로그?��");
        System.out.println("4. 종료");

        int action = scanner.nextInt();

        switch (action) {
            case 1:
                makeAccount();
                break;
            case 2:
                checkAccount();
                break;
            case 3:
                admin();
                break;
            case 4:
                System.out.println("?��로그?��?�� 종료?��?��?��!");
                mIsRunning = false;
                break;
            default:
                System.out.println("존재?���? ?��?�� 기능?��?��?��!");
        }
    }

    private static void makeAccount() {
        System.out.println("계좌 개설?�� 진행?��?��?��!");

        String id = input(1);
        String password = input(2);

        System.out.println("계좌�? 개설?��?��?��?��?��!");
        mAccounts.add(new Account(id, password, 0));
    }

    private static String input(int mode) {
        Scanner scanner = new Scanner(System.in);
        String result = null;

        switch (mode) {
            case 1:
                while (true) {
                    System.out.println("id�? ?��?��?��?��?��!");
                    result = scanner.nextLine();

                    if (result.trim().isEmpty()) {
                        System.out.println("id?�� 공백?�� ?��?��?���? ?��?��?��?��!");
                    } else {
                        break;
                    }
                }
                break;
            case 2:
                while (true) {
                    System.out.println("비�?번호�? ?��?��?��?��?��!");
                    result = scanner.nextLine();

                    System.out.println("비�?번호 ?��?��?�� ?��?��?��?��?��!");
                    String passwordCheck = scanner.nextLine();

                    if (result.trim().isEmpty() || passwordCheck.trim().isEmpty()) {
                        System.out.println("비�?번호 ?��?�� 비�?번호 ?��?��?�� 공백?��?��?��!");
                    } else if (!result.equals(passwordCheck)) {
                        System.out.println("비�?번호?? 비�?번호 ?��?��?�� ?��치하�? ?��?��?��?��!");
                    } else {
                        break;
                    }
                }
                break;
            case 3:
                while (true) {
                    System.out.println("비�?번호�? ?��?��?��?��?��!");
                    result = scanner.nextLine();

                    if (result.trim().isEmpty()) {
                        System.out.println("비�?번호�? 공백?��?��?��!");
                    } else {
                        break;
                    }
                }
                break;
        }

        return result;
    }

    private static void checkAccount() {
        System.out.println("계좌�? 조회?��?��?��!");

        String id = input(1);
        String password = input(3);

        boolean isExist = false;
        for (Account each : mAccounts) {
            String eachId = each.getId();
            String eachPassword = each.getPassword();

            if (id.equals(eachId) && password.equals(eachPassword)) {
                System.out.println("조회?��?�� 계좌?�� ?��보는 ?��?���? 같습?��?��!");
                System.out.printf("계좌�? : %s, 비�?번호 : %s, ?��?�� : %d", eachId, eachPassword, each.getMoney());
                System.out.println();
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.println("그러?�� 계좌?�� 존재?���? ?��?��?��?��!");
        }
    }

    private static void admin() {
        System.out.println("�?리자 모드?��?��?��!");

        String id = input(1);
        String password = input(3);

        if (id.equals("admin") && password.equals("1234")) {
            System.out.println("�?리자 로그?��?�� ?��공하?��?��?��?��.");
            System.out.println("개설?�� ?��?��?��?�� ?��보는 ?��?���? 같습?��?��.");

            for (Account each : mAccounts) {
                System.out.printf("계좌�? : %s, 비�?번호 : %s, ?��?�� : %d\r\n", each.getId(), each.getPassword(), each.getMoney());
            }
        } else {
            System.out.println("?��?��?�� ?��?�� 비�?번호�? ?��바르�? ?��?��?��?��!");
        }
    }


}
