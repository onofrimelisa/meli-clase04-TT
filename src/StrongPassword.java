public class StrongPassword extends Password{

    // Password must contain at least one digit [0-9],
    // at least one lowercase Latin character [a-z],
    // at least one uppercase Latin character [A-Z],
    // at least one special character like ! @ # & ( ),
    // a length of at least 8 characters and a maximum of 20 characters.
    public StrongPassword(String password) {
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", password);
    }
}
