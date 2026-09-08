package tutorial_6;

interface BasicSecurity {
    void login();
    void logout();
}
interface AdvancedSecurity extends BasicSecurity {
    void fingerprint();
    void faceRecognition();
}
class BankingApplication implements AdvancedSecurity {
    public void login() {
        System.out.println("User Logged In");
    }
    public void logout() {
        System.out.println("User Logged Out");
    }
    public void fingerprint() {
        System.out.println("Fingerprint Authentication Successful");
    }
    public void faceRecognition() {
        System.out.println("Face Recognition Successful");
    }
}
public class Main {
    public static void main(String[] args) {
        BankingApplication app = new BankingApplication();
        app.login();
        app.fingerprint();
        app.faceRecognition();
        app.logout();
    }
}

