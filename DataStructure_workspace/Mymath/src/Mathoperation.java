
public class Mathoperation {

	static Number addition(Number a, Number b)
	{
		Number answer= new Number();
		answer.setNum(a.getNum()+b.getNum());
		return answer;
	}
	
	static Number substraction(Number a, Number b)
	{
		Number answer= new Number();
		answer.setNum(a.getNum()-b.getNum());
		return answer;
	}
	
	static Number multiplication(Number a, Number b)
	{
		Number answer= new Number();
		answer.setNum(a.getNum()*b.getNum());
		return answer;
	}
	static Number division(Number a, Number b)
	{
		Number answer= new Number();
		answer.setNum(a.getNum()/b.getNum());
		return answer;
	}
	
}	
