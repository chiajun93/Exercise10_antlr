// Generated from RPN.g4 by ANTLR 4.5

    import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RPNParser}.
 */
public interface RPNListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RPNParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(RPNParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link RPNParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(RPNParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link RPNParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(RPNParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RPNParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(RPNParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RPNParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(RPNParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RPNParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(RPNParser.EvalContext ctx);
}