# Adapter Design Pattern

### Gist
- `Adapter` is a structural design pattern that allows objects with incompatible interfaces to collaborate.
- Acts as a wrapper between two objects. It catches calls for one object and transforms them to format and interface recognizable by the second object.
- Use the pattern when you don't want to change existing logic and still want to make it compatible for external logic.
- `Adapter` _**changes**_ the interface of an existing object, while `Decorator` _**enhances an object without changing**_ its interface.
- `Adapter` tries to make the _**existing interface usable**_, whereas `Facade` _**defines a new interface**_ for existing objects. 
---

## Example 1

### Given 

- A Speedometer which gives speed in MPH `getSpeed()`

### Problem

- If speed data displayed is to be fed into another system, which needs speed value in KMPH; there's a problem!

### Solution

- An adapter over `getSpeed()` which converts MPH => KMPH solves the problem without changing logic of the OG: `getSpeed()`