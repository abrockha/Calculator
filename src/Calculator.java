
public class Calculator {
	
	private int firstNum;
	private int secondNum;
	
	public Calculator(int num1, int num2) {
		this.firstNum = num1;
		this.secondNum = num2;
	}
	
	public int add(int firstNum,int secondNum) {
		return firstNum + secondNum;
	}
	
	public int subtraction(int firstNum,int secondNum) {
		return firstNum - secondNum;
	}
	
	public int multiplication(int firstNum,int secondNum) {
		return firstNum * secondNum;
	}
	
	public int division(int firstNum,int secondNum) {
		return firstNum / secondNum;
	}
	
	public int square(int firstNum,int secondNum) {
		return firstNum * firstNum;
	}
}
