# Abstract Factory Design Pattern

### Gist
- It solves the problem of creating entire 
product families without specifying their concrete 
classes.
- It defines an interface for creating all 
distinct products but _leaves the actual product 
creation to concrete factory classes_
- The client code _(factory user)_ calls the creation methods of a 
factory object _(abstract factory instance)_ instead of creating products 
directly with a constructor call _(`new` operator)_. 
- IRL Usage: When there is a need to create a 
collection of related products that are 
designed to be used together. 
- **Factory Method**: Define an interface for creating an object, but let the subclasses decide which class to instantiate. The Factory method lets a class defer instantiation to subclasses
- **Abstract Factory**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
`AbstractFactory pattern uses composition to delegate responsibility of creating object to another class while Factory method pattern uses inheritance and relies on derived class or sub class to create object
`---

## Example 1

### Given 

- An application which renders GUI based upon Current OS
- Dialog is to be built which contains buttons and checkboxes. (which acts as `products` here)
- Windows/Linux/Mac has different implementations of Dialog and UI Elements.

### Problem

- To set a rule of _different UI Components should couple together
based upon the OS Design Language._
- System should not allow anyone to create a Dialog with 
Button from one OS and Checkbox from another OS.

### Solution

- Provide a Factory Interface to User/Client
- It will use the factory to create UI elements without
knowing which OS Factory it is using.
- Creation work is delegated to respective factories.
- Selection of factory is based on certain conditions.


---

Ref: 

[1]
https://refactoring.guru/design-patterns/abstract-factory/java/
[2]
https://stackoverflow.com/a/35714637/8355466