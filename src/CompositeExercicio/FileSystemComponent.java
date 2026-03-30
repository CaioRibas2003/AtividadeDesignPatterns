package CompositeExercicio;

public interface FileSystemComponent {

    public String getName();
    public Long getSize();
    public void display(String indentation);
    public void add(FileSystemComponent component);
    public void remove(FileSystemComponent component);
}
