import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private final List<FileSystemComponent> childrens;

    public Directory() {
        childrens = new ArrayList<>();
    }

    public void add(FileSystemComponent component) {
        childrens.add(component);
    }

    @Override
    public int fs() {
        int size = 0;
        for (FileSystemComponent component : childrens) {
            size += component.fs();
        }
        return size;
    }
}

