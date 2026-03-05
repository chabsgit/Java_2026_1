package com.java.techymommy;


class Parenttt {

    Parenttt() {
        show();
    }

    void show() {
        System.out.println("Parent show");
    }
}

class Childd extends Parenttt {

    int x = 10;

    void show() {
        System.out.println("Child show " + x);
    }
}


public class Day4_MethodInsideConstructor {

	public static void main(String[] args) {
		 new Childd();
	}

}



//outputis -- Child show 0


/*
 *


# 🧠 Key Rule Behind the Behavior

When creating a child object, Java executes in this order:

```text
1. Memory allocated for object
2. Instance variables initialized to default values
3. Parent constructor runs
4. Child instance variables initialized
5. Child constructor runs
```

So when `show()` runs from the **Parent constructor**, `x` is still **default value (0)**.

---

# 🔥 Step-by-Step Execution

## 1️⃣ main() starts

Call:

```java
new Child();
```

Call stack:

```
main()
```

---

## 2️⃣ Memory Allocation

Java allocates memory for the **Child object**.

Object layout in heap initially:

```
Child object
-------------
x = 0   (default value)
```

Primitive fields always start with **default values**.

---

## 3️⃣ Parent Constructor Runs First

Java automatically inserts:

```java
super();
```

So stack becomes:

```
main()
   ↓
Child()
   ↓
Parent()
```

---

## 4️⃣ Parent Constructor Calls show()

```java
Parent() {
    show();
}
```

Stack:

```
main()
   ↓
Child()
   ↓
Parent()
   ↓
show()
```

---

## 5️⃣ Dynamic Method Dispatch Happens

Because `show()` is **not private/static/final**, Java uses **runtime polymorphism**.

Object type = **Child**

So JVM calls:

```
Child.show()
```

NOT `Parent.show()`.

---

# 🔥 Memory State At This Moment

Child field initialization **has NOT happened yet**.

Heap object still:

```
Child object
-------------
x = 0
```

---

## 6️⃣ Child.show() Executes

```java
System.out.println("Child show " + x);
```

Since `x = 0` currently:

Output:

```
Child show 0
```

---

## 7️⃣ Parent Constructor Finishes

Stack unwinds:

```
main()
   ↓
Child()
```

---

## 8️⃣ Child Field Initialization Happens

Now Java executes:

```java
int x = 10;
```

Heap object becomes:

```
Child object
-------------
x = 10
```

---

## 9️⃣ Child Constructor Runs

Child has no explicit constructor, so default constructor finishes immediately.

Stack:

```
main()
```

Object construction complete.

---

# 📊 Call Hierarchy Diagram

```
main()
   │
   ▼
new Child()
   │
   ▼
Child()
   │
   ▼
Parent()
   │
   ▼
show()  ← dynamic dispatch
   │
   ▼
Child.show()
   │
   ▼
prints "Child show 0"
```

---

# 🔥 Heap State Timeline

### After memory allocation

```
Child object
x = 0
```

### During Parent constructor

```
Child object
x = 0
```

### After Child field initialization

```
Child object
x = 10
```

---

# ⚠️ Why This Is Dangerous

This example shows why **calling overridable methods from constructors is risky**.

Because subclass state is **not initialized yet**.

This can cause:

* NullPointerException
* Incorrect logic
* Partially constructed objects

---

# 🎯 Interview-Level Answer

If asked:

**Why did it print `Child show 0` instead of `Child show 10`?**

Best answer:

> Because the parent constructor calls an overridable method. Due to dynamic dispatch, the child implementation executes before the child fields are initialized, so the field `x` still has its default value `0`.

---

💡 Since you're preparing for **deep Java interviews**, I can also show you a **mind-blowing JVM trick question about constructors and polymorphism** that even many senior developers fail.

 */
