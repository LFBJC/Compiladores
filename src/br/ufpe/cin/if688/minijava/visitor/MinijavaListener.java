package br.ufpe.cin.if688.minijava.visitor;

// Generated from Minijava.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MinijavaParser}.
 */
public interface MinijavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull MinijavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull MinijavaParser.ProgramContext ctx);
}