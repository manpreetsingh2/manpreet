package arrays;

public class ArraysExample {

	public static void oneDimenArray() {

		// TODO Auto-generated method stub

		int age1 = 10;
		int age2 = 20;
		int age3 = 30;

		int ages[] = new int[3]; // {10,20,30};
		ages[0] = age1;
		ages[1] = age2;
		ages[2] = age3;

		System.out.println(" Length is " + ages.length);

		System.out.println(ages[0] + " ");
		System.out.println(ages[1] + " ");
		System.out.println(ages[2] + " ");

		System.out.println("\n=============");

		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i] + " ");
		}

		System.out.println("\n=============");

		String names[] = { "one", "two", "three" };

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		System.out.println("\n=============");

		// Enhanced For loop for integer
		for (int age : ages) {
			System.out.println(age);
		}

		System.out.println("\n=============");
		// Enhanced For loop for String
		for (String name : names) {
			System.out.println(name);
		}

	}

	public static void twoDimenArray() {

		int person1[] = { 5, 30 }; // height and age and percentage
		int person2[] = { 6, 32 }; // height and age
		int person3[] = { 7, 34 }; // height and age

		int persons[][] = { person1, person2, person3 };

		for (int i = 0; i < persons.length; i++) {
			System.out.println("\n");
			for (int j = 0; j < persons[i].length; j++) {
				System.out.print(persons[i][j] + " ");
			}
		}

		System.out.println("\n Enhanced For Loop \n");

		for (int[] arr1 : persons) {
			System.out.println(arr1.length);
			for (int i : arr1) {
				System.out.println(i + " ");

			}
		}

	}

	public static void main(String[] args) {
		// oneDimenArray();
		twoDimenArray();
	}

}
