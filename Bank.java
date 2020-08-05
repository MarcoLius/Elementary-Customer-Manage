package marcolius.BankCustomer;

import java.util.Scanner;

 /**
  * @Description: Bank类用于构造实例Bank,并且实现了客户的增删改查
  * @Author: MarcoLius
  * @E-mail: 2961870074@qq.com
  * @Creed: I am your father
  * @Date 2020/8/5 23:48
  */

public class Bank {
    Tools tool = new Tools();
    Scanner input = new Scanner(System.in);
    private Customer[] customers;   //定义属性：客户数组
    private int totalCus = 0;       //定义属性：总客户数（在增删改查操作中会用来当做判断条件）

    public Bank(int totalCus) {
        customers = new Customer[totalCus];
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public void setTotalCus(int totalCus) {
        this.totalCus = totalCus;
    }

     /**
      * 查看客户列表方法(遍历客户数组)
      */
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

     /**
      * 增加客户方法
      */
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
//        方式一：直接更改对象的属性值
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
//
//        方式二：new一个新的对象，写入修改后的属性，将新的对象赋值给客户数组中对应客户
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

     /**
      * 删除用户方法
      * @param index 指定要删除客户的索引
      */
    public void delete(int index) {
        for (int i = index; i < totalCus - 1; i++) {
            customers[index] = customers[index + 1];
        }
        totalCus--;
        System.out.println("\t\t\t\t\t客户删除成功！");
        System.out.println("-----------------------------------------------------");

    }
}
