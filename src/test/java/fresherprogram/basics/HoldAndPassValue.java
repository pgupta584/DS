package fresherprogram.basics;

public class HoldAndPassValue
{
    static void login(String userName, String passWord)
    {
        System.out.println(userName);
        System.out.println(passWord);
        System.out.println("Click on login");
    }

    public static void main(String[] args) {
        login("admin","Manager");
    }
}
