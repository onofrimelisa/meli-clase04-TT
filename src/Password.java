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
}
