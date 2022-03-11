package study;

public class CalculatorPOJO {
	
	private int num1;
	private int num2;
	private String op;
	public CalculatorPOJO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CalculatorPOJO(int num1, int num2, String op) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	@Override
	public String toString() {
		return "CalculatorPOJO [num1=" + num1 + ", num2=" + num2 + ", op=" + op + "]";
	}
	

}
