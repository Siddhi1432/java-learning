### 1. What is an ArrayList?

An **ArrayList** is a collection in Java that stores multiple elements in a **dynamic list**.

Unlike an array, its size can change during the program.

```java
ArrayList<String> names = new ArrayList<>();

names.add("Siddhi");
names.add("Rahul");
names.add("Priya");
```

Here, `names` stores multiple `String` values.

Think of it like a **shopping list** where you can keep adding items.

---

### 2. Why would I use ArrayList instead of an array?

The main reason is that an `ArrayList` can **change its size dynamically**.

With an array:

```java
String[] names = new String[3];
```

The size is fixed at `3`.

You cannot directly make it a 4-element array.

With an `ArrayList`:

```java
ArrayList<String> names = new ArrayList<>();

names.add("Siddhi");
names.add("Rahul");
names.add("Priya");
names.add("Amit");
```

You don't need to decide the size beforehand.

So:

| Array                            | ArrayList           |
| -------------------------------- | ------------------- |
| Fixed size                       | Dynamic size        |
| Can store primitives and objects | Stores objects      |
| Less functionality               | Many useful methods |
| `arr.length`                     | `list.size()`       |
| `arr[index]`                     | `list.get(index)`   |

---

### 3. Can an ArrayList grow after it is created?

**Yes.** That's one of its main advantages.

```java
ArrayList<String> names = new ArrayList<>();

names.add("Siddhi");
```

Initially, it contains one element.

Then:

```java
names.add("Rahul");
names.add("Priya");
names.add("Amit");
```

Now it contains four elements.

You don't have to manually create a bigger list.

Internally, when the current capacity isn't enough, Java creates a larger internal array and copies the elements into it.

You don't normally need to worry about how this happens.

---

### 4. Can an ArrayList store objects?

**Yes.** In fact, an `ArrayList` stores **objects**.

For example:

```java
ArrayList<String> names = new ArrayList<>();
```

`String` is an object type.

You can also create your own class:

```java
class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
```

Then:

```java
ArrayList<Employee> employees = new ArrayList<>();

employees.add(new Employee("Siddhi", 50000));
employees.add(new Employee("Rahul", 60000));
```

Now the `ArrayList` contains `Employee` objects.

---

### 5. What does `ArrayList<Employee>` mean?

This is very important.

```java
ArrayList<Employee> employees;
```

It means:

> **`employees` is an ArrayList that is allowed to store `Employee` objects.**

`Employee` is the **type of element** that the list can contain.

For example:

```java
ArrayList<Employee> employees = new ArrayList<>();
```

Then:

```java
employees.add(new Employee("Siddhi", 50000));
employees.add(new Employee("Rahul", 60000));
```

But this would not be allowed:

```java
employees.add("Siddhi"); // ❌
```

because `"Siddhi"` is a `String`, not an `Employee`.

### Easy way to remember

Think of:

```java
ArrayList<Employee>
```

as:

> **A box that can contain only Employee objects.**

And:

```java
ArrayList<String>
```

as:

> **A box that can contain only String objects.**

And:

```java
ArrayList<Integer>
```

as:

> **A box that can contain only Integer objects.**

This `<Employee>` part is called a **generic type parameter**, and it provides type safety.
