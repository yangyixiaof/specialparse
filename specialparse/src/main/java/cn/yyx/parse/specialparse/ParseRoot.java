package cn.yyx.parse.specialparse;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import SJ8Parse.Java8BaseVisitor;
import SJ8Parse.Java8Lexer;
import SJ8Parse.Java8Parser;

/**
 * Hello world!
 *
 */
public class ParseRoot 
{
	public static void ParseOneSentence(String onesentence, Java8BaseVisitor<Integer> evalVisitor) throws Exception {
		ANTLRInputStream input = new ANTLRInputStream(onesentence);
		Java8Lexer lexer = new Java8Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Java8Parser parser = new Java8Parser(tokens);
		parser.setBuildParseTree(true); // tell ANTLR to build a parse tree
		ParseTree tree = parser.statement(); // parse
		
		//testing
		System.out.println(tree.toStringTree(parser));
		
		evalVisitor.visit(tree);
    }
}