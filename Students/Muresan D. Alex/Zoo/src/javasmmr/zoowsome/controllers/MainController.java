package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import java.util.Random;

public class MainController {

	public static void main(String[] args) {
		AnimalFactory abstractFactory=new AnimalFactory();
		
		
		String type[]=new String[15];
		type[0]="Cow";    type[3]="Butterfly";  type[6]="Colibri";  type[9]="Shark";    type[12]="Iguana";
		type[1]="Tiger";  type[4]="Spider";     type[7]="Eagle";    type[10]="Carp";    type[13]="Snake";
		type[2]="Monkey"; type[5]="Cockroach";	type[8]="Crow";     type[11]="CatFish";	type[14]="KomodoDragon";
		
		SpeciesFactory Species;
		
		
		
		Animals animal[]=new Animals[50];
	  
		int i;
		int n;
		int k;
		Random random=new Random();
		for(i=0;i<50;i++) {
			n= random.nextInt(4);
            k=random.nextInt(2);
     
           if(n==0) {
        	   Species=abstractFactory.getSpeciesfactory("Mammals");
            animal[i]=Species.getAnimal(type[k]);
		  }
           if(n==1) {
        	   Species=abstractFactory.getSpeciesfactory("Insects");
            animal[i]=Species.getAnimal(type[3+k]);
		  }
           if(n==2) {
        	   Species=abstractFactory.getSpeciesfactory("Birds");
            animal[i]=Species.getAnimal(type[6+k]);
		  }
           if(n==3) {
        	   Species=abstractFactory.getSpeciesfactory("Aquatics");
            animal[i]=Species.getAnimal(type[9+k]);
		  }
           if(n==4) {
        	   Species=abstractFactory.getSpeciesfactory("Reptiles");
            animal[i]=Species.getAnimal(type[12+k]);
		  }
		}
      
	 for(i=0;i<50;i++) {
		 System.out.printf("Animal %d is %s %s\n ",i,animal[i].getName(),animal[i].getClass());
	 }
	}
	
	}
