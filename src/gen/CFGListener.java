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
}