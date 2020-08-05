package marcolius.BankCustomer;

import java.util.Scanner;

public class Tools {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * 用于选择菜单：读取键盘输入字符，若字符为‘1’-‘5’中任意字符，则返回用户键入字符
     */
    public static char menuSelect() {
        char c;
        while (true) {
            String str = scanner.next();
            c = str.charAt(0);
            if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5') {
                break;
            } else {
                System.out.print("\t\t\t\t  输入错误！请重新输入：");
            }
        }
        return c;
    }

    public char genderInput() {
        char c;
        while (true) {
            String str = scanner.next();
            c = str.charAt(0);
            if (c == '男' || c == '女') {
                break;
            } else {
                System.out.print("输入错误！请重新输入：");
            }
        }
        return c;
    }

    public char genderInput(char defaultValue){
        char c;
        while (true) {
            String str = scanner.nextLine();
            if(str.length() == 0){
                return defaultValue;
            }else{
                c = str.charAt(0);
                if (c == '男' || c == '女') {
                    break;
                } else {
                    System.out.print("输入错误！请重新输入：");
                }
            }

        }
        return c;
    }

    public int indexInput(int totalCus) {
        int i;
        while (true) {
            i = scanner.nextInt();
            if (i > 0 && i <= totalCus) {
                break;
            } else if(i == -1){
                break;
            } else{
                System.out.print("\t\t\t\t用户序号错误，请重新输入：");
            }
        }
        return i - 1;
    }

    public String newString(String defaultValue) {
//        使用一个nextLine读取掉之前输入数据时的回车，防止跳过输入
//        String enterKey = scanner.nextLine();
        String inputString = scanner.nextLine();
        return (inputString.length() == 0) ? defaultValue : inputString;
    }

    public String firstNewString(String defaultValue) {
//        使用一个nextLine读取掉之前输入数据时的回车，防止跳过输入
        String enterKey = scanner.nextLine();
        String inputString = scanner.nextLine();
        return (inputString.length() == 0) ? defaultValue : inputString;
    }

    public int newInt(int defaultValue) {
        String inputString = scanner.nextLine();
        return (inputString.length() == 0) ? defaultValue : Integer.parseInt(inputString);
    }

    public char newChar(char defaultValue) {
        String inputString = scanner.nextLine();
        return (inputString.length() == 0) ? defaultValue : inputString.charAt(0);
    }

    public boolean YorN() {
        while (true) {
            String inputString = scanner.next();
            char c = inputString.toUpperCase().charAt(0);
            if (c == 'Y') {
                return true;
            } else if (c == 'N') {
                return false;
            } else {
                System.out.print("\t\t\t\t  输入错误，请重新输入：");
            }
        }
    }
}
