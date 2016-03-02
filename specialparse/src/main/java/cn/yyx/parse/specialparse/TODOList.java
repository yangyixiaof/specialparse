package cn.yyx.parse.specialparse;

import SJ8Parse.Java8BaseVisitor;
import SJ8Parse.Java8Listener;

public class TODOList {
	
	// solved. Cast Expression (type & type & type) have not been considered.
	// solved. to ensure that if no ref, just put the raw string.
	// solved. What is the use of HackedNoType = <$NT$>?
	// solved. ArrayInitial = "@ARI"; ArrayCreation = "@ARC"; and Class new instance should not be replaced @... this must be improved in the future.
	// solved. parameter has dims doesn't take into consideration such as int sd[][]. public void test(String a, int sd[][]){}
	// solved. method declare has dims at last doesn't take into consideration such as : public int test(String a, int sd[][])[] {return null;} which equals to public int[] test(String a, int sd[][]).
	// solved. what is receiverParameter???
	// solved. method declaration must be post-fixed with '@MD'
	// solved. class declaration must be post-fixed with '@CD'
	// solved. typeArguments not handled, such as '<? extends Integer>'.
	// solved. catch exceptionTypeList such as catch (AException || BException || CException);. Plus catch#...#... change to catch(...||...)
	// solved. extends, implements doesn't take into consideration.
	
	public static void test()
	{
		Object o = new Object();
		@SuppressWarnings("unchecked")
		Object t = (Java8BaseVisitor<Integer> & Java8Listener)o;
		System.out.println(t);
		
		Converter<String, Integer> converter = Integer::valueOf;
		Integer converted = converter.convert("123");
		System.out.println(converted);   // 123
	}
	
	public static void main(String[] args) {
		TODOList.test();
	}
	
}

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}