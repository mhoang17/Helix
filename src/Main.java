import gen.CFGLexer;
import gen.CFGParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) {

        String string = "a = b+3+c";
        CharStream charStream = CharStreams.fromString(string);

        CFGLexer lexer = new CFGLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CFGParser parser = new CFGParser(tokenStream);

        ParseTree tree = parser.start();

        BuildASTVisitor buildASTVisitor = new BuildASTVisitor();
        buildASTVisitor.visit(tree);
    }
}
