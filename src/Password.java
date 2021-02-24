import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private String password;
    private Pattern pattern;

    public Password(String regex, String password) {
        this.pattern = Pattern.compile(regex);
        try {
            this.setValue(password);
            System.out.println("The given password matches the regex!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setValue (String password) throws Exception {
        Matcher matcher = this.pattern.matcher(password);
        if (!matcher.matches()) throw new RuntimeException("The given password doesn't match the regex.");
        this.password = password;
    }

    public static void main(String[] args) {
        System.out.println("Testing passwords...");
        System.out.println("");

        System.out.println("Strong Passwords results: ");
        Password validStrongPassword = new StrongPassword("validPassword1!");
        Password invalidStrongPassword = new StrongPassword("invalidPassword");
        System.out.println();

        System.out.println("Weak Passwords results: ");
        Password validWeakPassword = new WeakPassword("validpassword1");
        Password invalidWeakPassword = new WeakPassword("invalidpassword");
        System.out.println();

        System.out.println("Intermediate Passwords results: ");
        Password validIntermediatePassword = new IntermediatePassword("validPassword1");
        Password invalidIntermediatePassword = new IntermediatePassword("invalidpassword1");
    }
}
