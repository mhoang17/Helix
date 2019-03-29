// Generated from /Users/Maria/Documents/GitHub/Helix/CFG.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CFGParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CFGVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CFGParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CFGParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFGParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CFGParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFGParser#dcls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcls(CFGParser.DclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFGParser#eDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEDcl(CFGParser.EDclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFGParser#chordDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChordDcl(CFGParser.ChordDclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFGParser#processDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcessDcl(CFGParser.ProcessDclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFGParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(CFGParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFGParser#playStruc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayStruc(CFGParser.PlayStrucContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFGParser#chord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChord(CFGParser.ChordContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFGParser#n}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN(CFGParser.NContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFGParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(CFGParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFGParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(CFGParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link CFGParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC(CFGParser.CContext ctx);
}