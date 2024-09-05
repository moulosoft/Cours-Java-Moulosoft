import static java.util.Arrays.*;
// This import statement allows you to use all static methods from the `Arrays` class without having to prefix them with `Arrays.`
// For example, you can use `sort(arr)` instead of `Arrays.sort(arr)`.

import java.util.Arrays;
// This is a normal import that brings in the `Arrays` class so you can use its methods like `sort()`.
public class Demo {
// This defines a class called `Demo`. This class contains the main method that will execute when you run the program.
public static void main(String[] args) {
// This is the main method where the program starts running.
// The `main` method is the entry point for the program, and it takes an array of strings as input arguments (though we don't use them here).

    User user1 = new User();
    // Here, we are creating a new object of the `User` class called `user1`.
    
    System.out.println("user1.getId() = " + user1.getId());
    // This line prints out the ID of `user1` by calling the `getId()` method on the `user1` object.
    
    System.out.println("user1.getCounter() = " + user1.getCounter());
    // This line prints out the counter value. Since `counter` is a static variable (presumably), this method should return the value that belongs to the entire class, not just this object.
    
    System.out.println();
    System.out.println("================================");
    System.out.println();
    // These lines print empty lines and a separator for better readability in the console output.

    User user2 = new User();
    // Here, we create a second `User` object called `user2`.
    
    System.out.println("user2.getId() = " + user2.getId());
    // This prints the ID of `user2`. Since IDs are likely unique for each user, this will differ from `user1.getId()`.
    
    System.out.println("user2.getCounter() = " + user2.getCounter());
    // This prints the static counter. Because it's static, it will likely increment as more `User` objects are created, but the value should be the same for both `user1` and `user2`.

    System.out.println();
    System.out.println("================================");
    System.out.println();
    
    System.out.println("user1.getCounter() = " + user1.getCounter());
    // This prints the static counter again, but through `user1`. The result should be the same as `user2.getCounter()`, since `counter` is shared across all instances of `User`.

    System.out.println();
    System.out.println("================================");
    System.out.println();
    
    User user3 = new Employee();
    // Here, we are creating an `Employee` object but storing it in a `User` reference (`user3`).
    // This is possible because `Employee` likely extends `User`, meaning an `Employee` is also a type of `User`.

    user3.doAnyStaticAction();
    // This calls a method `doAnyStaticAction()` on `user3`, which is stored as a `User` reference.
    // However, if `doAnyStaticAction()` is a static method, calling it on an instance (like `user3`) doesn't make much sense. It should be called directly on the class.

    User.doAnyStaticAction();
    // This calls the static method `doAnyStaticAction()` directly on the `User` class.
    // Static methods belong to the class itself, not to individual objects.

    Employee.doAnyStaticAction();
    // This calls the same static method `doAnyStaticAction()`, but on the `Employee` class.
    // If `Employee` inherits `doAnyStaticAction()` from `User`, this will work without any issues.

    System.out.println();
    System.out.println("================================");
    System.out.println();

    int[] arr = {1, 2, 3};
    // This creates an array of integers called `arr` with three elements: 1, 2, and 3.
    
    Arrays.sort(arr);
    // This sorts the array using the `Arrays.sort()` method, which arranges the elements in ascending order.

    sort(arr);
    // This calls `sort(arr)` directly, thanks to the `static import java.util.Arrays.*;`.
    // It is essentially the same as `Arrays.sort(arr)` because of the static import.
}
