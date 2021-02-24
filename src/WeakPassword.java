public class WeakPassword extends Password{

    // Password must contain at least one digit [0-9],
    // at least one lowercase Latin character [a-z].
    // a length of at least 8 characters and a maximum of 20 characters.
    public WeakPassword(String password) {
        super("^(?=.*[0-9])(?=.*[a-z]).{8,20}$", password);
    }
}
