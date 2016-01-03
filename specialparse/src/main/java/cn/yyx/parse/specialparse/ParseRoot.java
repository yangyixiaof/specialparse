package cn.yyx.parse.specialparse;

import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import SJ8Parse.Java8Lexer;
import SJ8Parse.Java8Parser;
import SJ8Parse.SpecialJava8Visitor;

/**
 * Hello world!
 *
 */
public class ParseRoot 
{
	public static void main(String[] args) throws Exception {
		String inputFile = null;
		if (args.length > 0)
			inputFile = args[0];
		InputStream is = System.in;
		if (inputFile != null) {
			is = new FileInputStream(inputFile);
		}
		ANTLRInputStream input = new ANTLRInputStream(is);
		Java8Lexer lexer = new Java8Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Java8Parser parser = new Java8Parser(tokens);
		parser.setBuildParseTree(true); // tell ANTLR to build a parse tree
		ParseTree tree = parser.statement(); // parse
		// show tree in text form
		System.out.println(tree.toStringTree(parser));

		SpecialJava8Visitor evalVisitor = new SpecialJava8Visitor();
		// int result =
		evalVisitor.visit(tree);
		// System.out.println("visitor result = "+result);
    }
}