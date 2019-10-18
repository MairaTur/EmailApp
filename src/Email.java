import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "kz.com";

    // мы должны создать конструктор для имени и фамилии
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        // создаем метод для определения департамента - возвращает департамент
        this.department = setDepartment();
        // создаем метод для возврата сгенерированного пароля
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
        //скомбинировать элементы имэйла
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
        System.out.println("Your email is: " + email);
    }
    // затем мы должны определить департамент
    private String setDepartment() {
        System.out.print("New worker: " + firstName + " " + lastName + ", Department codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner In = new Scanner(System.in);
        int depChoice = In.nextInt();
        if (depChoice == 1) {
            return "sales.";
        } else if (depChoice == 2) {
            return "dev.";
        } else if (depChoice == 3) {
            return "acct.";
        } else {
            return "";
        }
    }

    // затем мы должны добавить функцию создания случайного пароля
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIGKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    // затем определить объем почтового ящика
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }
    // затем определить альтернативный адрес почты
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }
    // затем добавить функцию по изменению пароля
    public void changePassword(String password) {
        this.password = password;
    }
    // добавить функцию определения объема почты
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    // добавить функцию генерации альтернативного имэйла
    public String getAlternateEmail() {
        return alternateEmail;
    }

    // добавить функцию проверки пароля
    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "Display name: " + firstName + " " + lastName +
                "\nCompany email: " + email +
                "\nMailBox capacity" + mailboxCapacity + "mb";
    }
}
