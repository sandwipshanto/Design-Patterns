public class FileSystemClient {
    public static void main(String[] args) {
        Directory root = new Directory();
        FileSystemComponent f0 = new File(18);
        FileSystemComponent f1 = new File(76);
        FileSystemComponent f2 = new File(78);

        FileSystemComponent dir1 = new Directory();

        root.add(dir1);
        root.add(f0);
        root.add(f1);
        root.add(f2);

        System.out.println(root.fs());
    }
}
