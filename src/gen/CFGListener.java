// Generated from /Users/Maria/Documents/GitHub/Helix/CFG.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CFGParser}.
 */
public interface CFGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CFGParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CFGParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CFGParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFGParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CFGParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CFGParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFGParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(CFGParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(CFGParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFGParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(CFGParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(CFGParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFGParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(CFGParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(CFGParser.TContext ctx);
}