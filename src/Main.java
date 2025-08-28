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
        String source ="src//Test//test1.txt";
        CharStream cs =  fromFileName(source);
        AngularaLexer lexer = new AngularaLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularaParser parser = new AngularaParser(token);
        ParseTree tree = parser.program();
        Program doc =(Program) new BaseVisitor().visit(tree);

        System.out.println(doc);

    }
}