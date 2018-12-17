package com.test.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComapraterTest {

	public static void main(String[] args) {
		
		List<Car> carList = new ArrayList<>();
		carList.add(new Car(2000,"Fiat",1999));
		carList.add(new Car(5000,"Volvo",2007));
		carList.add(new Car(10000,"Tesla",2018));
		
		Comparator<Car> nameComp = new Comparator<Car>() {
			@Override
			public int compare(Car o1, Car o2) {
				return o1.compareTo(o2);
			}
			
		};
		
		Comparator<Car> nc = (Car c1,Car c2) -> c1.getName().compareTo(c2.getName());
		Collections.sort(carList, nc);
		
		/*Collections.sort(carList);
		carList.forEach(c -> System.out.println(c.getName()));
		Collections.sort(carList,nameComp );*/
		
		carList.forEach((x) -> System.out.println("Name " +x.getName() +"  Price "+x.getPrice()));
	}

}
