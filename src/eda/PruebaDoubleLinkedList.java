package eda;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;


public class PruebaDoubleLinkedList {
	
	public void visualizarNodos(UnorderedDoubleLinkedList<Integer> l) {
		Iterator<Integer> it = l.iterator();
		System.out.println();
		while (it.hasNext()) {
			Integer num = it.next();
			System.out.println(num);
		}
	}
	
	
	public static void main(String[] args)  {

		UnorderedDoubleLinkedList<Integer> l = new UnorderedDoubleLinkedList<Integer>();
		assertEquals(l.size(), 0);
		l.addToRear(1);//lista vacia
		assertEquals(l.size(), 1);
		l.addToRear(3);//lista 1 elemento
		assertEquals(l.size(), 2);
		l.addToRear(6);
		l.addToRear(7);
		assertEquals(l.last(), 7);//para comprobar que se esta añadiendo al final
		l.addToRear(20);
		assertEquals(l.last(), 20);//para comprobar que se esta añadiendo al final
		assertEquals(l.size(), 5);
		System.out.print(" Lista ...............");
		visualizarNodos(l);
		System.out.println(" Num elementos: " + l.size());
				
		
		System.out.println("Prueba Find ...............");
		System.out.println("9? " + l.find(9));
		System.out.println("0? " + l.find(0));
		System.out.println("7? " + l.find(7));
		
}
}
