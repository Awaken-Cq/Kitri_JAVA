/*��ɸ޼ҵ�
 *1.���ڹ�ư�� ������ ���ڰ� �������ؾ���.
 *1-1. �����ư�� ������ �����ư�� operL�� ��������.
 *2.�����ڹ�ư�� ������ ���� ������ ��ư ����
 *3.�����Է� �ϸ� ���� ���ڰ� �������� �� ���� �Է�
 *4.'='�� ������ ������ ���. �ԷµǾ��� ������ �����?
 *5.�ű⿡ �ٽ� �����ڸ� ������ �����Ǿ��ִ� �������� �߰� ����
 *6.'C'��ư�� ������ ���� ����Ǿ��ִ� ���� ����, �ΰ��� tf�� �ִ� ���� ����.
 *7.�����ư�� ������ ����v
 *
 * 
 * 
 * 
 */


package com.kitri.awt.event;

public class CalculatorService {

	CalculatorController calculatorController;
	
	Calculator cc;
	
	public CalculatorService(CalculatorController calculatorController) {
		super();
		this.calculatorController = calculatorController;
		cc = calculatorController.calculator;
		
	}
	
	int num = 0;
	
//	public void tran() {
//		num = Integer.parseInt(calculatorController.numStr);
//		
//	}

//	cc.numL.setText(" ");
	
	
	public void calC() {
		cc.operL.setText(calculatorController.opStr);
		switch(calculatorController.i) {
		case 1 : num += Integer.parseInt(calculatorController.numStr);break;
		case 2 : num -= Integer.parseInt(calculatorController.numStr);break;
		case 3 : num *= Integer.parseInt(calculatorController.numStr);break;
		case 4 : num /= Integer.parseInt(calculatorController.numStr);break;
		}
		calculatorController.numStr = "";
		
		
	}
	

	
//	
//	public void minus() {
//		cc.operL.setText(calculatorController.opStr);
//		num = Integer.parseInt(calculatorController.numStr);
//		calculatorController.numStr = "";
//	
//		
//	}
//
//	public void multi() {
//		cc.operL.setText(calculatorController.opStr);
//		num = Integer.parseInt(calculatorController.numStr);
//		calculatorController.numStr = "";
//	
//		
//}
//
//	public void div() {
//		cc.operL.setText(calculatorController.opStr);
//		num = Integer.parseInt(calculatorController.numStr);
//		calculatorController.numStr = "";
//	
//		
//	}
	
	public void result() {
		
		
		calculatorController.numStr = String.valueOf(num);

	
		
		
//	public void calc() {
//		num2 = Integer.parseInt(calculatorController.numStr);
//		switch(cal) {
//		case 1 : ;
//		case 2 : calculatorController.numStr = String.valueOf(num1 - num2);
//		case 3 : calculatorController.numStr = String.valueOf(num1 * num2);
//		case 4 : calculatorController.numStr = String.valueOf(num1 / num2);
//		}
		
	}

	public void reset() {
		calculatorController.numStr = "";
		calculatorController.opStr = "";
		cc.numL.setText("");
		cc.operL.setText("");
		num = 0;
		calculatorController.i = 0;
	}
	
	public void exit() {
		System.exit(0);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}