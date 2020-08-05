package marcolius.BankCustomer;

import java.util.Scanner;

public class Bank {
    Tools tool = new Tools();
    Scanner input = new Scanner(System.in);
    private Customer[] customers;
    private int totalCus = 0;

    public Bank(int totalCus) {
        customers = new Customer[totalCus];
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public void setTotalCus(int totalCus) {
        this.totalCus = totalCus;
    }

    public void viewCustomers() {
        System.out.println("-----------------------客户列表-----------------------");
        System.out.println("序号\t\t姓名\t\t性别\t\t年龄\t\t\t电话\t\t\t\t邮箱");
        for (int i = 0; i < totalCus; i++) {
            System.out.println((i + 1) + "\t\t" + customers[i].getName() + "\t" + customers[i].getGender() + "\t\t" + customers[i].getAge() + "\t\t" + customers[i].getTel() + "\t\t" + customers[i].getEmail());
        }
        System.out.println("-----------------------------------------------------");
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public int getTotalCus() {
        return totalCus;
    }

    public void insert() {
        customers[totalCus] = new Customer();
        System.out.println("-----------------------------------------------------");
        System.out.print("姓名：");
        customers[totalCus].setName(input.next());
        System.out.print("性别：");
        customers[totalCus].setGender(tool.genderInput());
        System.out.print("年龄：");
        customers[totalCus].setAge(input.nextInt());
        System.out.print("电话：");
        customers[totalCus].setTel(input.next());
        System.out.print("邮箱：");
        customers[totalCus].setEmail(input.next());
        totalCus++;
        System.out.println("\t\t\t\t\t客户添加成功！");
        System.out.println("-----------------------------------------------------");
        System.out.println();
    }

    public void update(int index) {
        System.out.println("-----------------------------------------------------");
//        System.out.print("姓名(" + customers[index].getName() + ")：");
//        customers[index].setName(tool.newString(customers[index].getName()));
//        System.out.print("性别(" + customers[index].getGender() + ")：");
//        customers[index].setGender(tool.genderInput(customers[index].getGender()));
//        System.out.print("年龄(" + customers[index].getAge() + ")：");
//        customers[index].setAge(tool.newInt(customers[index].getAge()));
//        System.out.print("电话(" + customers[index].getTel() + ")：");
//        customers[index].setTel(tool.newString(customers[index].getTel()));
//        System.out.print("邮箱(" + customers[index].getEmail() + ")：");
//        customers[index].setEmail(tool.newString(customers[index].getEmail()));
        System.out.print("姓名(" + customers[index].getName() + ")：");
        String newName = tool.firstNewString(customers[index].getName());
        System.out.print("性别(" + customers[index].getGender() + ")：");
        char newGender = tool.genderInput(customers[index].getGender());
        System.out.print("年龄(" + customers[index].getAge() + ")：");
        int newAge = tool.newInt(customers[index].getAge());
        System.out.print("电话(" + customers[index].getTel() + ")：");
        String newTel = tool.newString(customers[index].getTel());
        System.out.print("邮箱(" + customers[index].getEmail() + ")：");
        String newEmail = tool.newString(customers[index].getEmail());
        customers[index] = new Customer(newName,newTel,newEmail,newAge,newGender);
        System.out.println("\t\t\t\t\t客户信息修改成功！");
        System.out.println("-----------------------------------------------------");
        System.out.println();
    }

    public void delete(int index) {
        for (int i = index; i < totalCus - 1; i++) {
            customers[index] = customers[index + 1];
        }
        totalCus--;
        System.out.println("\t\t\t\t\t客户删除成功！");
        System.out.println("-----------------------------------------------------");

    }
}
