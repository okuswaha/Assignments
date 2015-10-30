package concurency;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String args[]){
		List<ClassA> listA = new ArrayList();
		List<ClassB> listB = new ArrayList();
		List<ClassC> listC = new ArrayList();
		
		ClassA a1 = new ClassA();
		ClassA a2 = new ClassA();
		ClassB b1 = new ClassB();
		listB.add(b1);
	}

}
