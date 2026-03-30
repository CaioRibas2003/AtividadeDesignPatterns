package CompositeExercicio;

public class Main {
    public static void main(String[] args) {

        FileSystemComponent projeto = new File("projeto.pdf", mb(2.0));
        FileSystemComponent relatorio = new File("relatorio.docx", mb(1.0));
        FileSystemComponent vacacao = new File("vacacao.jpg", mb(3.0));
        FileSystemComponent casal = new File("casal.jpg", mb(2.0));
        FileSystemComponent filhos = new File("filhos.jpg", mb(1.0));
        FileSystemComponent readme = new File("readme.txt", mb(0.5));

        Directory root = new Directory("root");
        Directory docs = new Directory("docs");
        Directory fotos = new Directory("fotos");
        Directory familia = new Directory("familia");

        docs.add(projeto);
        docs.add(relatorio);

        familia.add(casal);
        familia.add(filhos);

        fotos.add(vacacao);
        fotos.add(familia);

        root.add(docs);
        root.add(fotos);
        root.add(readme);

        root.display("");

        System.out.println("\nTamanho total: " + mbFormat(root.getSize()));
        System.out.println("Tamanho da pasta 'docs': " + mbFormat(docs.getSize()));
        System.out.println("Tamanho da pasta 'familia': " + mbFormat(familia.getSize()));

    }

        private static long mb(double mb) {
            return (long) (mb * 1024 * 1024);
        }

        private static String mbFormat(long bytes) {
            double mb = bytes / (1024.0 * 1024.0);
            return String.format("%.1f MB", mb);
        }
    }

