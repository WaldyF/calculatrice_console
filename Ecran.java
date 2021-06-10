package core.view;

import java.util.Scanner;

public class Ecran {
	private int a;
	private int b;
	private int c;
	
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public Ecran(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public Ecran() {
	}
	public void Aff() {
		System.out.println("            Calculatrice");
	}
	public void Aff2() {
		System.out.println("Entrer deux valeurs");
	}
	// Methode pour saisir
	public int saisir() {
		System.out.println("Taper 1 pour add" );
		System.out.println("Taper 2 pour sous");
    	int val;
    	Scanner entrer=new Scanner(System.in);
    	val = entrer.nextInt();		
    	this.setA(val);
        return val;
        
        
    }
    public int saisir1() {
    	int val1;
    	Scanner entrer1=new Scanner(System.in);
    	val1 = entrer1.nextInt();		
        return val1;
        
    }
   public void showResult(int result1) {
	   System.out.println("L'addition est:");
	   System.out.println(a+"+"+b+"="+result1);
	}
   public void showResult2(int result2) {
	   System.out.println("La soustraction est:");
	   System.out.println(a+"-"+b+"="+result2);
	}
   public void showResulM(int result) {
	   System.out.println("La Resultas est: "+ result);
	}
}
