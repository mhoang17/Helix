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
	 * Visit a parse tree produced by {@link CFGParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CFGParser.StartContext ctx);
}