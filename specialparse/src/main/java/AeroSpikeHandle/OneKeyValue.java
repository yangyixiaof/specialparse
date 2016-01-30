package AeroSpikeHandle;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import SJ8Parse.Java8Lexer;
import SJ8Parse.Java8Parser;

public class OneKeyValue {
	
	String key = null;
	String value = null;
	
	public OneKeyValue(String value) {
		this.value = value;
		GenerateKeyAccordingToValue(value);
	}
	
	private void GenerateKeyAccordingToValue(String value)
	{
		ANTLRInputStream input = new ANTLRInputStream(value);
		Java8Lexer lexer = new Java8Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Java8Parser parser = new Java8Parser(tokens);
		parser.setBuildParseTree(true);
		ParseTree tree = parser.statement();
		// show tree in text form
		// System.out.println(tree.toStringTree(parser));
		AeroSpikeKeyJava8Visitor evalVisitor = new AeroSpikeKeyJava8Visitor();
		evalVisitor.visit(tree);
		this.key = evalVisitor.GetKey();
	}
	
}