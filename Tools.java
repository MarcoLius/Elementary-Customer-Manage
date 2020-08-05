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

    /**
     * 客户性别输入方法（添加时）：从键盘获取客户性别
     * @return 性别字符
     */
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

    /**
     * 客户性别输入方法（修改时）：从键盘获取客户性别（若不输入直接回车则保持原性别不变）
     * @param defaultValue 原性别
     * @return 性别字符
     */
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

    /**
     * 客户序号输入方法：从键盘获取客户编号（修改或删除时选择客户）
     * 输入-1可退出选择界面（输入-1时跳出循环并返回，以便实际操作时退出选择界面）
     * @param totalCus 总客户数（Bank类的属性）
     * @return 返回所选择客户在客户数组中的索引数
     */
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

    /**
     * 字符串输入方法（修改时）：从键盘获取字符串（若不输入直接回车则保持原字符串不变）
     * @return 字符串
     */
    public String newString(String defaultValue) {
//        使用一个nextLine读取掉之前输入数据时的回车，防止跳过输入
//        String enterKey = scanner.nextLine();
        String inputString = scanner.nextLine();
        return (inputString.length() == 0) ? defaultValue : inputString;
    }

    /**
     * 在修改客户信息方法的第一次修改时使用，用nextLine吸收掉之前输入客户编号时按下的回车
     * 字符串输入方法（修改时）：从键盘获取字符串（若不输入直接回车则保持原字符串不变）
     * @return 字符串
     */
    public String firstNewString(String defaultValue) {
//        使用一个nextLine读取掉之前输入数据时的回车，防止跳过输入
        String enterKey = scanner.nextLine();
        String inputString = scanner.nextLine();
        return (inputString.length() == 0) ? defaultValue : inputString;
    }

    /**
     * 整数输入方法（修改时）：从键盘获取整数（若不输入直接回车则保持原数不变）
     * @param defaultValue 原数
     * @return 新整数或原值
     */
    public int newInt(int defaultValue) {
        String inputString = scanner.nextLine();
        return (inputString.length() == 0) ? defaultValue : Integer.parseInt(inputString);
    }

    public char newChar(char defaultValue) {
        String inputString = scanner.nextLine();
        return (inputString.length() == 0) ? defaultValue : inputString.charAt(0);
    }

    /**
     * 是或否输入方法（Y or N):从键盘获取Y/N,不区分大小写
     * @return Y或N
     */
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
