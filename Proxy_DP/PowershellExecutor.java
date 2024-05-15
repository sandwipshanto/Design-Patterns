public class PowershellExecutor implements Terminal {

    @Override
    public void execute(String command, String user) {
        System.out.println(command + " executed by " + user + " successfully");
    }

}
