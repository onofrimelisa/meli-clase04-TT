public class Main {
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
