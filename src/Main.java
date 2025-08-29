import AST.Classes.Program;
import AST.Visitor.BaseVisitor;
import gen.AngularaLexer;
import gen.AngularaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
   //   String source ="src//Test//Component.txt";
//       String source ="src//Test//product.service.txt";
//        String source ="src//Test//serverRoutes.txt";
//        String source ="src//Test//rout.txt";
//        String source ="src//Test//mainServer.txt";
//        String source ="src//Test//server.txt";
//        String source ="src//Test//main.txt";
        String source ="src//Test//index.txt";
//         String source ="src//Test//test.txt";

        CharStream cs =  fromFileName(source);
        AngularaLexer lexer = new AngularaLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularaParser parser = new AngularaParser(token);
        ParseTree tree = parser.program();
        Program doc =(Program) new BaseVisitor().visit(tree);

        System.out.println(doc);

    }
}
/*
public class Main {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("input.html"));
        AngularaLexer lexer = new AngularaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AngularaParser parser = new AngularaParser(tokens);
        ParseTree tree = parser.htmlDocument();
        BaseVisitor visitor = new BaseVisitor();
        HtmlDocument doc = visitor.visit(tree);
        CodeGenerator generator = new CodeGenerator();
        generator.visitHtmlDocument(doc);
        System.out.println(generator.getOutput());
    }
}
 */