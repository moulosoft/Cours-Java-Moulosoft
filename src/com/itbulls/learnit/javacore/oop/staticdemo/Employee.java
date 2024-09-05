public class Employee extends User {
// This line declares the `Employee` class, which extends the `User` class. 
// Inheritance is used here, meaning `Employee` is a subclass of `User` and can inherit its properties and methods.
// This also means `Employee` can override methods or add new methods, while still using everything defined in `User`.

public static void doAnyStaticAction() {
// This defines a static method `doAnyStaticAction()`.
// Being static means this method belongs to the `Employee` class itself, not to individual objects (instances) of the class.
// You can call this method without creating an `Employee` object, like `Employee.doAnyStaticAction()`.

System.out.println("Static method in Employee class is called.");
// This line prints a message to the console that indicates the static method in the `Employee` class has been called.

    }
}
