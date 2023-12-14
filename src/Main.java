import difexample.example.ClientComponent;
import difexample.example.SingletonComponent;
import difexample.example.TransientComponent;
import models.Section;
import models.paragraph;
import services.AlignCenter;
import services.AlignLeft;
import services.AlignRight;

public class Main {
    public static void main(String[] args) throws Exception {


        // Creează instanțe pentru secțiuni, paragrafe și aliniere
        Section cap1 = new Section("Capitolul 1");

        paragraph p1 = new paragraph("Paragraph 1");
        cap1.add(p1);

        paragraph p2 = new paragraph("Paragraph 2");
        cap1.add(p2);

        paragraph p3 = new paragraph("Paragraph 3");
        cap1.add(p3);

        paragraph p4 = new paragraph("Paragraph 4");
        cap1.add(p4);

        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.print();

        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());

        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
        cap1.print();

        // Creează o instanță a clasei TransientComponent
        TransientComponent transientBean = new TransientComponent();
        transientBean.operation();

        // Creează mai multe instanțe ale aceleiași clase TransientComponent
        TransientComponent transientBean2 = new TransientComponent();
        transientBean2.operation();

        // Creează o instanță a clasei SingletonComponent
        SingletonComponent singletonBean = new SingletonComponent();
        singletonBean.operation();

        // Oricâte instanțe ai cere, vei primi aceeași instanță Singleton
        SingletonComponent singletonBean2 = new SingletonComponent();
        singletonBean2.operation();

        // Creează o instanță a clasei ClientComponent și furnizează-i cele două componente necesare
        ClientComponent c = new ClientComponent(transientBean, singletonBean);
        c.operation();
    }
}
