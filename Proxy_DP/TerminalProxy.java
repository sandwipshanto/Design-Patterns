import java.util.ArrayList;
import java.util.List;

public class TerminalProxy implements Terminal {
    private PowershellExecutor executor;
    private List<String> vulnerableCommands;

    public TerminalProxy() {
        executor = new PowershellExecutor();
        vulnerableCommands = new ArrayList<>();
        vulnerableCommands.add("rm -rf");
    }

    @Override
    public void execute(String command, String user) {
        if (vulnerableCommands.contains(command) && !user.equals("admin")) {
            System.out.println("Can't execute command: " + command);
        } else {
            executor.execute(command, user);
        }
    }
}
