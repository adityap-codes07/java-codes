import java.util.Scanner;

// Interface with 3 methods
interface Notification {
    void notificationBySms();
    void notificationByEmail();
    void notificationByCourier();
}

// ICICI Bank implementation
class Icici implements Notification {
    public void notificationBySms() {
        System.out.println("ICICI - Notification By SMS");
    }

    public void notificationByEmail() {
        System.out.println("ICICI - Notification By Mail");
    }

    public void notificationByCourier() {
        System.out.println("ICICI - Notification By Courier");
    }
}

// HDFC Bank implementation
class Hdfc implements Notification {
    public void notificationBySms() {
        System.out.println("HDFC - Notification By SMS");
    }

    public void notificationByEmail() {
        System.out.println("HDFC - Notification By Mail");
    }

    public void notificationByCourier() {
        System.out.println("HDFC - Notification By Courier");
    }
}

// Factory class to create objects
class BankFactory {
    public Icici getIcici() {
        return new Icici();
    }

    public Hdfc getHdfc() {
        return new Hdfc();
    }
}

// Main class
public class interfaceAndAbstractClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankFactory factory = new BankFactory();

        System.out.println("Welcome to Notification Setup");
        System.out.println("Please select your bank:");
        System.out.println("1)ICICI");
        System.out.println("2)HDFC");

        int bankChoice = sc.nextInt();

        if (bankChoice == 1 || bankChoice == 2) {
            System.out.println("Enter the type of Notification you want to enter");
            System.out.println("1)SMS");
            System.out.println("2)Mail");
            System.out.println("3)Courier");

            int notificationChoice = sc.nextInt();

            Notification bank = null;
            if (bankChoice == 1)
                bank = factory.getIcici();
            else if (bankChoice == 2)
                bank = factory.getHdfc();

            switch (notificationChoice) {
                case 1:
                    bank.notificationBySms();
                    break;
                case 2:
                    bank.notificationByEmail();
                    break;
                case 3:
                    bank.notificationByCourier();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        } else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
