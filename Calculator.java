/**
	класс реализует калькулятор
*/
public class Calculator {
	/**
		результат вычисления.
	*/
	private int result;

	/**
		суммирует аргументы.
		@param params аргументы суммирования.
	*/
	public void add(int ... params) {
		for (Integer param : params) {
				this.result += param;
		}
	}

	/**
		получмть результат.
		@return результат вычисления.
	*/
	public int getResult(){
		return this.result;
	}
	/**
		Очистить результат вычисления.
	*/
	public void cleanResult(){
		this.result =0;
	}
}
