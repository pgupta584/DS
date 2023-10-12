package oopsConcept.inheritance;

public class ComposeEmail extends TestBase
{
    void emailComposed(){
        System.out.println("Email Sent");
    }
    public static void main(String[] args) {
        ComposeEmail e = new ComposeEmail();
        // ---login
        e.launchBrowser();
        e.login();
        e.emailComposed();
    }
}
// Compose with attachement --> ComposeEmail --> TestBase
// sendEmail --> TestBase
// ComposeEmail --> TestBase