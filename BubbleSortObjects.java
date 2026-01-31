class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class BubbleSortObjects {
    public static void main(String[] args) {
        // Create an array of Person objects
        Person[] people = {
            new Person("Alice", 25),
            new Person("Bob", 20),
            new Person("Charlie", 30),
            new Person("Diana", 22)
        };

        // Bubble Sort by age
        int n = people.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (people[j].age > people[j + 1].age) {
                    // Swap
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
            // Print array after each pass
            System.out.print("After pass " + (i + 1) + ": ");
            for (Person p : people) {
                System.out.print(p.name + "(" + p.age + ") ");
            }
            System.out.println();
        }

        // Final sorted array
        System.out.println("\nSorted by age:");
        for (Person p : people) {
            System.out.println(p.name + " - " + p.age);
        }
    }
}
