// Generated from /Users/Maria/Documents/GitHub/Helix/CFG.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CFGParser}.
 */
public interface CFGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CFGParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CFGParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CFGParser.ProgramContext ctx);
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
	 * Enter a parse tree produced by {@link CFGParser#dcls}.
	 * @param ctx the parse tree
	 */
	void enterDcls(CFGParser.DclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#dcls}.
	 * @param ctx the parse tree
	 */
	void exitDcls(CFGParser.DclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFGParser#processDcl}.
	 * @param ctx the parse tree
	 */
	void enterProcessDcl(CFGParser.ProcessDclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#processDcl}.
	 * @param ctx the parse tree
	 */
	void exitProcessDcl(CFGParser.ProcessDclContext ctx);
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
	 * Enter a parse tree produced by {@link CFGParser#playStruc}.
	 * @param ctx the parse tree
	 */
	void enterPlayStruc(CFGParser.PlayStrucContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#playStruc}.
	 * @param ctx the parse tree
	 */
	void exitPlayStruc(CFGParser.PlayStrucContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFGParser#chord}.
	 * @param ctx the parse tree
	 */
	void enterChord(CFGParser.ChordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#chord}.
	 * @param ctx the parse tree
	 */
	void exitChord(CFGParser.ChordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFGParser#n}.
	 * @param ctx the parse tree
	 */
	void enterN(CFGParser.NContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#n}.
	 * @param ctx the parse tree
	 */
	void exitN(CFGParser.NContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFGParser#aExp}.
	 * @param ctx the parse tree
	 */
	void enterAExp(CFGParser.AExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#aExp}.
	 * @param ctx the parse tree
	 */
	void exitAExp(CFGParser.AExpContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link CFGParser#x}.
	 * @param ctx the parse tree
	 */
	void enterX(CFGParser.XContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#x}.
	 * @param ctx the parse tree
	 */
	void exitX(CFGParser.XContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFGParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(CFGParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(CFGParser.CContext ctx);
}