import java.util.*;

public class SortingArray {

	public static void main(String[] args) {

		int[] array = generaArray((int)(Math.random() * 100));

		ordinaArray(array);
		
		stampaArray(array);
	}
	
	public static int[] generaArray(int length) {
		int[] newArray = new int[length];
		
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = (int)(Math.random() * 1000);
		}
		
		return newArray;
	}
	
	public static void stampaArray(int[] array) {
		System.out.println("L'array è lungo: " + array.length);
		System.out.println(Arrays.toString(array));
	}
	
	private static void ordinaArray(int[] array) {
		int length = array.length;

		for (int i = 0; i < length; i++) {

			int indiceNumeroMinore = i;

			// ciclo per la ricerca del numero minore
			for (int j = i + 1; j < length; j++) {
				if (array[indiceNumeroMinore] > array[j])
					indiceNumeroMinore = j;
			}

			// swap elementi
			if (i != indiceNumeroMinore) {
				int temp = array[i];
				array[i] = array[indiceNumeroMinore];
				array[indiceNumeroMinore] = temp;
			}
		}
	}
}