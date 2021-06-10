package core.model;

public class Moul {
  private int num1;
  private int num2;
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
public Moul(int num1, int num2) {
	super();
	this.num1 = num1;
	this.num2 = num2;
}
public Moul() {
	
}
public int somme() {
	int a=0;
	a = this.num1+this.num2;
	return a;
}
public int soustraction() {
	int b=0;
	b = this.num1-this.num2;
	return b;
}

public int multiplication(int a , int b) {
	return a*b;
}
}
