# Builder Design Pattern

### Gist
- It lets you construct complex objects step by step.
- Idea behind: Imagine a complex object that requires laborious, step-by-step initialization of many fields and nested objects, you might make the program too complex by creating a subclass for every possible configuration of an object.
- You can go further and extract a series of calls to the builder steps you use to construct a product into a separate class called `director`. 
    - `The director class` defines the order in which to execute the building steps, while the builder provides the implementation for those steps.
    - It completely hides the details of product construction from the client code.
---

## Example 1

### Given 

- A program to build pizza of different types. 
- A pizza building process consists of several sub-processes such as
building dough, byilding crust, building toppings, etc. 

### Problem

- Having a common Pizza Interface and several concrete implementations such as Spicy Pizza, 
Thin Crust Pizza can be one of the way to solve above program.
- All the parts of pizza can be taken as parameters for a constructor.
- `new Pizza(panBaked, thin, mild, classic)`, `new Pizza(ovenBaked, null, mild, null)` 
- The constructor with lots of parameters has its downside: not all the parameters are needed at all times.

### Solution

- The Builder pattern suggests that you extract the object construction code out of its own class and move it to 
separate objects called builders.
- The Builder pattern lets you construct complex objects step by step. The Builder doesn’t allow other objects to 
access the product while it’s being built.