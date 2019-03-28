import gen.CFGBaseVisitor;
import gen.CFGParser;

import java.util.Collections;

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

            BlockNode blockNode = new BlockNode();

            visitStmts(ctx.stmts(), blockNode);
            Collections.reverse(blockNode.getNodeList());

            System.out.println(blockNode.getNodeList());

            return blockNode;
        }

        throw new IllegalNode("This is not a legal statement!");
    }

    private void visitStmts(CFGParser.StmtsContext ctx, BlockNode blockNode) {

        if(ctx.SEMI() != null){

            blockNode.addNode(visitStmt(ctx.stmt()));

            visitStmts(ctx.stmts(), blockNode);

        }
        else if (ctx.stmt() != null) {

            blockNode.addNode(visitStmt(ctx.stmt()));

        } else {

            throw new IllegalNode("Not a correct statement!");
        }

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


