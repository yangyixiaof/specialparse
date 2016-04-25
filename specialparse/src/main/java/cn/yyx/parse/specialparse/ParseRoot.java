package cn.yyx.parse.specialparse;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import SJ8Parse.Java8BaseVisitor;
import SJ8Parse.Java8Lexer;
import SJ8Parse.Java8Parser;

public class ParseRoot 
{
	public static String ParseOneSentence(String onesentence, Java8BaseVisitor<Integer> evalVisitor, boolean returnTreeContent) throws Exception, Error {
		ANTLRInputStream input = new ANTLRInputStream(onesentence);
		Java8Lexer lexer = new Java8Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Java8Parser parser = new Java8Parser(tokens);
		parser.setBuildParseTree(true); // tell ANTLR to build a parse tree
		parser.setErrorHandler(new BailErrorStrategy());
		ParseTree tree = parser.statement(); // parse
		if (evalVisitor != null)
		{
			evalVisitor.visit(tree);
		}
		if (returnTreeContent)
		{
			return tree.toStringTree(parser);
		}
		return null;
    }
	
	public static void main(String[] args)
	{
		try {
			// ParseOneSentence("A@@C0?3=", null, true);
			ParseOneSentence("A@@C0?0=class.int", null, true);
			ParseOneSentence("A@acceptor.@C0?0=acceptor.this.@PE", null, true);
			ParseOneSentence("A@accessMin.super=@C0?0", null, true);
			// ParseOneSentence("AM@Class.Class<?#extends#Annotation>[]#value()", null, true);
			ParseOneSentence("[@@C0?0#A]", null, true);
			ParseOneSentence("FA@Damage.@PE", null, true);
			ParseOneSentence("FA@@F0?0", null, true);
			ParseOneSentence("IxE@@C0?0==-2147483648", null, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}