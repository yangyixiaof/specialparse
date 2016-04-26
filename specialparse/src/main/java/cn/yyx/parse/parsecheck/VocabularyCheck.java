package cn.yyx.parse.parsecheck;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import cn.yyx.parse.specialparse.ParseRoot;

public class VocabularyCheck {
	
	String vocabfilepath = "/home/yyx/HomeSpace/UnzipAllFiles/TransformedData/BigClassDetail/ClassWorkSpace/results/final.vocab";
	
	public void CheckAll() throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File(vocabfilepath)));
			String oneline = null;
			int idx = 0;
			while ((oneline = br.readLine()) != null)
			{
				idx++;
				if (idx > 4)
				{
					CheckOneSentenceWeaker(oneline);
					System.out.println("Now handled valid sentence:" + (idx - 4) + ".");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			br.close();
		}
	}
	
	public static void main(String[] args) {
		VocabularyCheck  vc = new VocabularyCheck();
		try {
			vc.CheckAll();
		} catch (IOException e) {
			System.out.println("Some errors happen.");
			e.printStackTrace();
		}
	}
	
	private void CheckOneSentenceWeaker(String onesentence) {
		try {
			ParseRoot.ParseOneSentence(onesentence, null, true);
		} catch (Exception | Error e) {
			System.err.println("Parse One Sentence error! serious error, the system will exit. The error parsed setence is :" + onesentence + ".");
			if (e instanceof ParseCancellationException)
			{
				ParseCancellationException pce = (ParseCancellationException)e;
				Throwable pc = pce.getCause();
				if (pc instanceof RecognitionException)
				{
					RecognitionException re = (RecognitionException)pce.getCause();
				    ParserRuleContext context = (ParserRuleContext)re.getCtx();
				    System.err.println(re);
				    System.err.println(context);
				}
			}
			e.printStackTrace();
			System.exit(1);
		}
	}
	
}