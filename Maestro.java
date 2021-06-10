package core.controller;

import core.model.Moul;
import core.view.Ecran;

public class Maestro {
	

	public void Start (){
		// TODO Auto-generated method stub
		Ecran inOut = new Ecran();
		Moul option = new Moul();
		inOut.Aff();
        
        try {
//    	    pour les scanners 
    		int valeurSaisis = inOut.saisir();
    		inOut.Aff2();
    		int valeurSaisis1 = inOut.saisir1();
    		inOut.setA(valeurSaisis1);
    		int valeurSaisis2 = inOut.saisir1();
    		inOut.setB(valeurSaisis2);
            option.setNum1(valeurSaisis1);
            option.setNum2(valeurSaisis2);
        	switch(valeurSaisis) {
            case 1:int result = option.somme();
            inOut.showResult(result);
            	break;
            case 2:int result2 = option.soustraction();
            inOut.showResult2(result2);
            	break;
            	default:
            		int resultl = option.multiplication(valeurSaisis1, valeurSaisis2);
             	inOut.showResulM(resultl);
            }
        }catch(Exception e) {
        	System.out.println("Veillez saisir un entier !");
        }
        
//        if(valeurSaisis== 1) 
//        {
//        	  int result = option.somme();
//      		inOut.showResult(result);
//        	
//        }
//        else if (valeurSaisis == 2)
//        {
//	    
//         int result2 = option.soustraction();
//		inOut.showResult2(result2);
//        }else {
//        	int result = option.multiplication(valeurSaisis1, valeurSaisis2);
//        	inOut.showResulM(result);
//        }
	}

}