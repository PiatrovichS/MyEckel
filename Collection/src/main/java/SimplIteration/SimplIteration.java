package SimplIteration;

import java.util.*;

public class SimplIteration {
	public static void main(String[] args) {
		List<Pet> pets = Pet.arrayList(12);
		Iterator<Pet> it = pets.iterator();
		while (it.hasNext()) {
			Pet p = it.next();
			System.out.println(p.id() + ":" + p + " ");
		}
		System.out.println();
		// Более простой синтаксис (там, где возможно):
		for (Pet p : pets)
			System.out.println(p.id() + ":" + p + " ");
		System.out.println();
		// Итератор также позволяет удалять элементы:
		it = pets.iterator();
		for (int i = 0; i < 6; i++) {
			it.next();
			it.remove();
		}
		System.out.println(pets);
	}

}
