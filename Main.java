package OOP;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
Animal P1=new Pelican("Radko", 1567,true,4);
Animal S1=new Snake("Fifi",345,12,14);
Animal H1=new Human("Gosho", 1743, "mountains", "Greece", "987654");
Animal Ch1=new Chimp("Toshko", 1899,"Africa","fruits");
Animal F1=new Fox("Lisa", 1976, "forests", "red");
Animal D1=new Dog("Dino", 1999, "streets",12);
List<Animal>animalList=new ArrayList<>();
animalList.add(P1);
animalList.add(S1);
animalList.add(D1);
animalList.add(H1);
animalList.add(Ch1);
animalList.add(F1);
List<Pelican>pelicanList=new ArrayList<>();
pelicanList.add((Pelican)P1);
System.out.println(P1);
System.out.println(S1);
System.out.println(H1);
System.out.println(Ch1);
System.out.println(F1);
System.out.println(D1);
System.out.println(animalList);
System.out.println(animalList.size());
System.out.println(animalList.isEmpty());
System.out.println(animalList.contains(F1));
System.out.println(animalList.indexOf(Ch1));
animalList.clear();
System.out.println(animalList);
System.out.println(pelicanList);
System.out.println("\"\"Ako \'sum \\\\\\ tuk?_\" '\\/!\'");// Escaping symbol \
	}


 		}


