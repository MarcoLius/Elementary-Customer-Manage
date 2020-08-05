package marcolius.BankCustomer;

import marcolius.BankCustomer.Bank;
import marcolius.BankCustomer.Tools;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Tools tool = new Tools();
        Bank bank = new Bank(100);
        while (true){
            System.out.println("--------------------客户信息管理系统--------------------");
            System.out.println("\t\t\t\t\t1.添加客户");
            System.out.println("\t\t\t\t\t2.修改客户信息");
            System.out.println("\t\t\t\t\t3.删除用户");
            System.out.println("\t\t\t\t\t4.查看用户列表");
            System.out.println("\t\t\t\t\t5.退\t出");
            System.out.println();
            System.out.print("\t\t\t\t   请输入数字(1-5)：");
            char selectNo = tool.menuSelect();
            if(selectNo == '1'){
                bank.insert();
            }else if(selectNo == '2'){
                if(bank.getTotalCus() == 0){
                    System.out.println("\t\t\t\t\t 无客户信息！");
                    System.out.println();
                    continue;
                }
                bank.viewCustomers();
                System.out.println();
                System.out.print("\t\t\t\t请选择客户(输入-1退出)：");
                int index = tool.indexInput(bank.getTotalCus());
                if(index == -2){
                    continue;
                }
                bank.update(index);
            }else if(selectNo == '3'){
                if(bank.getTotalCus() == 0){
                    System.out.println("\t\t\t\t\t 无客户信息！");
                    System.out.println();
                    continue;
                }
                bank.viewCustomers();
                System.out.println();
                System.out.print("\t\t\t\t请选择客户(输入-1退出)：");
                int index = tool.indexInput(bank.getTotalCus());
                if(index == -2){
                    continue;
                }
                bank.delete(index);
            }else if(selectNo == '4'){
                if(bank.getTotalCus() == 0){
                    System.out.println("\t\t\t\t\t 无客户信息！");
                    System.out.println();
                    continue;
                }
                bank.viewCustomers();
                System.out.println();
            }else{
                System.out.print("\t\t\t\t  确认是否退出(Y/N)：");
                boolean ifExit = tool.YorN();
                if(ifExit){
                    break;
                }else {
                    System.out.println();
                    continue;
                }
            }
        }

    }
}