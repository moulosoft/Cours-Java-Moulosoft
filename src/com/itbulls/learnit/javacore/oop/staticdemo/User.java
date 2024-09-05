public class User {
// This declares the `User` class. It is the blueprint for creating `User` objects.

    public static final String DEFAULT_USER_GROUP = "customers";
    // This is a public static final variable. It means:
    // - `public`: Accessible from anywhere.
    // - `static`: Belongs to the `User` class itself, not individual instances.
    // - `final`: Its value cannot be changed once assigned.
    // `DEFAULT_USER_GROUP` holds the constant value "customers".

    private static int counter;
    // This is a private static variable. It means:
    // - `private`: Accessible only within the `User` class.
    // - `static`: Shared among all instances of the `User` class.
    // `counter` keeps track of how many `User` objects have been created.

    private int id;
    // This is a private instance variable. It means:
    // - `private`: Accessible only within the `User` class.
    // `id` is unique to each `User` object.

    private String name;
    // This is a private instance variable. It means:
    // `name` is unique to each `User` object.

    {
        ++counter;
        // This is an instance initialization block. It runs every time a new `User` object is created.
        // `++counter` increments the static `counter` variable by 1, tracking the number of `User` objects created.

        // DEFAULT_USER_GROUP = "employees";
        // This line is commented out. If uncommented, it would cause an error because `DEFAULT_USER_GROUP` is final and cannot be changed.
    }

    public static void doAnyStaticAction() {
        // This is a public static method. It means:
        // - `public`: Accessible from anywhere.
        // - `static`: Belongs to the `User` class itself.
        // This method can be called directly on the class, like `User.doAnyStaticAction()`.
        
        System.out.println("Static method in User class is called.");
        // This line prints a message to the console when the static method is called.
    }

    public int getCounter() {
        // This is a public instance method. It means:
        // - `public`: Accessible from anywhere.
        // This method returns the current value of the static `counter` variable.

        return counter;
    }

    public static void setCounter(int counter) {
        // This is a public static method. It means:
        // - `public`: Accessible from anywhere.
        // - `static`: Belongs to the `User` class itself.
        // This method allows setting the value of the static `counter` variable.

        User.counter = counter;
    }

    public int getId() {
        // This is a public instance method. It means:
        // - `public`: Accessible from anywhere.
        // This method returns the value of the `id` instance variable.

        return id;
    }

    public void setId(int id) {
        // This is a public instance method. It means:
        // - `public`: Accessible from anywhere.
        // This method sets the value of the `id` instance variable.

        this.id = id;
    }

    public String getName() {
        // This is a public instance method. It means:
        // - `public`: Accessible from anywhere.
        // This method returns the value of the `name` instance variable.

        return name;
    }

    public void setName(String name) {
        // This is a public instance method. It means:
        // - `public`: Accessible from anywhere.
        // This method sets the value of the `name` instance variable.

        this.name = name;
    }
}
