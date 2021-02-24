public class IntermediatePassword extends Password{

    public IntermediatePassword(String password) {
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$", password);
    }
}
