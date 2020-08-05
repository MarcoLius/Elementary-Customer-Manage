package marcolius.BankCustomer;

public class Customer {
    private String name;
    private String tel;
    private String email;
    private int age;
    private char gender;
    private Account account;

    /**
     * 空参构造器与全参构造器
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

    public void setGender(char gender) {
        if (gender == '男' || gender == '女') {
            this.gender = gender;
        } else {
            System.out.println("性别错误，请重新输入！");
        }
    }

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

    public void setAccount(Account account) {
        this.account = account;
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

    public Account getAccount() {
        return account;
    }
}
