package marcolius.BankCustomer;

 /**
  * @Description: 客户类，用于创建客户实例，定义了客户的属性
  * @Author: MarcoLius
  * @E-mail: 2961870074@qq.com
  * @Creed: I am your father
  * @Date 2020/8/6 0:02
  */

public class Customer {
    private String name;   //客户姓名
    private String tel;    //客户电话
    private String email;  //客户邮箱
    private int age;       //客户年龄
    private char gender;   //客户性别

    /**
     * 提供空参构造器与全参构造器
     */
    public Customer() {

    }

    public Customer(String name, String tel, String email, int age, char gender) {
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

     /**
      * 设置客户性别方法（判断输入性别是否为合法字符）
      * @param gender 客户性别
      */
    public void setGender(char gender) {
        if (gender == '男' || gender == '女') {
            this.gender = gender;
        } else {
            System.out.println("性别错误，请重新输入！");
        }
    }

     /**
      * 设置客户年龄方法（判断输入年龄是否为合法数字）
      * @param age 客户年龄
      */
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("年龄信息有误！请重新设置！");
        }
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }
}
