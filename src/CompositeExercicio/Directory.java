package CompositeExercicio;

import java.util.ArrayList;
import java.util.List;



public class Directory implements FileSystemComponent {

    private String nome;
    private List<FileSystemComponent> components;

    public Directory(String nome) {
        this.nome = nome;
        this.components = new ArrayList<>();
    }

    @Override
    public String getName() {
        return nome;
    }

    @Override
    public Long getSize() {

        long somaTotal = 0;

        for (FileSystemComponent component : components) {
            somaTotal += component.getSize();
        }
        return somaTotal;
    }

    @Override
    public void display(String indentation) {
        System.out.println(indentation + nome + "/");

        for (int i = 0; i < components.size(); i++) {
            FileSystemComponent component = components.get(i);

            boolean isLast = (i == components.size() - 1);
            String prefix = isLast ? "└─ " : "├─ ";
            String childIndent = indentation + (isLast ? "   " : "│  ");

            if (component instanceof Directory) {
                System.out.print(indentation + prefix);
                component.display(childIndent);
            } else {
                component.display(indentation + prefix);
            }
        }

    }

        @Override
    public void add(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        components.remove(component);
    }
}
