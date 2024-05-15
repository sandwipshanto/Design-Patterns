public class ClientApp {
    public static void main(String[] args) {

        TerminalProxy proxy = new TerminalProxy();
        proxy.execute("mkdir design pattern", "user");
        proxy.execute("rm -rf", "user");
        proxy.execute("rm -rf", "admin");

    }
}
