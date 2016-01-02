package cn.yyx.parse.specialparse;

public class TODOList {
	
	// TODO Cast Expression (type & type & type) have not been considered.
	// TODO to ensure that if no ref, just put the raw string.
	// TODO What is the use of HackedNoType = <$NT$>?
	// TODO ArrayInitial = "@ARI"; ArrayCreation = "@ARC"; and Class new instance should not be replaced @... this must be improved in the future.
	// TODO parameter has dims doesn't take into consideration such as int sd[][]. public void test(String a, int sd[][]){}
	// TODO method declare has dims at last doesn't take into consideration such as : public int test(String a, int sd[][])[] {return null;} which equals to public int[] test(String a, int sd[][]).
	// TODO what is receiverParameter???
	// TODO method declaration must be post-fixed with '@MD'
	// TODO class declaration must be post-fixed with '@CD'
	// TODO typeArguments not handled, such as '<? extends Integer>'.
	// TODO catch exceptionTypeList such as catch (AException || BException || CException);. Plus catch#...#... change to catch(...||...)
	// TODO extends, implements doesn't take into consideration.
}
