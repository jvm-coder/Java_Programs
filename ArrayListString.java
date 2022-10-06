import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {

		// declaring and instantiate a String List
		ArrayList<String> listaString = new ArrayList<String>();

		// adding info at list
		listaString.add("Elemento 1");
		listaString.add("Elemento 2");
		listaString.add("Elemento 3");

		// show list
		System.out.println(listaString.get(0));
		System.out.println(listaString.get(1));
		System.out.println(listaString.get(2));

		// add an element in specific position
		listaString.add(1, "Elemento 1.5");

		// show list itens
		for (String obj : listaString) {
			System.out.println(obj);
		}

		// get list size
		System.out.println("O tamanho da lista é:" + listaString.size());

		// find an list value
		if (listaString.contains("Elemento 1")) {
			System.out.println("Elemento encontrado");
		} else {
			System.out.println("Elemento não encontrado ");
		}

		// print index from element
		int indice = listaString.indexOf("Elemento 1");
		System.out.println("Indice: " + indice);

		// adding a new element
		listaString.add("Elemento 4");

		// get list size
		System.out.println("O tamanho da lista é:" + listaString.size());

		// remove an list element
		listaString.remove("Elemento 1.5");
		for (String obj : listaString) {
			System.out.println(obj);
		}

		// get list size
		System.out.println("O tamanho da lista é:" + listaString.size());

	}

}
