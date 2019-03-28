import gen.CFGLexer;
import gen.CFGParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) {

        String string = "{a= 9; a = 3+8+8; b = 0; c=0}";
        CharStream charStream = CharStreams.fromString(string);

        CFGLexer lexer = new CFGLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CFGParser parser = new CFGParser(tokenStream);

        ParseTree tree = parser.start();

        BuildASTVisitor buildASTVisitor = new BuildASTVisitor();
        buildASTVisitor.visit(tree);

    }
}
