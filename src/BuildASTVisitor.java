import gen.CFGBaseVisitor;
import gen.CFGParser;

public class BuildASTVisitor extends CFGBaseVisitor<Node> {

    @Override
    public Node visitStart(CFGParser.StartContext ctx) {

        return super.visitStart(ctx);
    }

    @Override
    public Node visitStmt(CFGParser.StmtContext ctx) {

        // Check if it's an assign statement
        if(ctx.ASSIGN() != null){

            IDNode idNode = new IDNode();
            idNode.setValue(ctx.ID().getText());

            AssignNode assignNode = new AssignNode();
            assignNode.setLeft(idNode);
            assignNode.setRight(visitE(ctx.e()));

            return assignNode;

        }
        // Check if there's a block
        if (ctx.BEGIN() != null){

            return visitStmts(ctx.stmts());
        }

        throw new IllegalNode("This is not a legal statement!");
    }

    @Override
    public Node visitStmts(CFGParser.StmtsContext ctx) {

        // Detect semicolon
        if(ctx.SEMI() != null){

            SemiNode semiNode = new SemiNode();

            semiNode.setLeft(visitStmts(ctx.stmts()));
            semiNode.setRight(visitStmt(ctx.stmt()));

            return semiNode;

        }
        // If no semicolon is detected, visit statement
        else if (ctx.stmt() != null) {

            return visitStmt(ctx.stmt());
        }

        throw new IllegalNode("This is neither a block or a statement!");
    }

    @Override
    public Node visitE(CFGParser.EContext ctx) {
        
        // Detect plus sign
        if(ctx.PLUS() != null){

            PlusNode plusNode = new PlusNode();
            plusNode.setLeft(visitE(ctx.e()));
            plusNode.setRight(visitT(ctx.t()));

            return plusNode;

        }
        // If no plus sign, visit terminal
        else if(ctx.t() != null){

            return visit(ctx.t());
        }

        throw new IllegalNode("Something is wrong with the expression!");
    }

    @Override
    public Node visitT(CFGParser.TContext ctx) {

        // Detect if terminal is a number
        if(ctx.NUM() != null){

            NumNode node = new NumNode();
            node.setValue(Integer.parseInt(ctx.NUM().getText()));

            return node;

        }
        // Detect if terminal is an ID
        else if (ctx.ID() != null){

            IDNode node = new IDNode();
            node.setValue(ctx.ID().getText());

            return node;
        }

        throw new IllegalNode("Couldn't find a number or ID!");
    }
}
