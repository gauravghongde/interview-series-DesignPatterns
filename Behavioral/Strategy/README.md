#Strategy Design Pattern

### Gist
- Interchangeable Encapsulated Set of Algorithms
- Decoupled design enabling plug & play (inject) algorithms (strategies)

---

## Example 1

### Given 

- A Duck, having different behaviours and characteristics.
- There are different types of duck, such as WildDuck, RubberDuck, CityDuck, etc. which share same behaviours but all types of duck doesn't have all behaviours in common. 

- Consider a behaviour => Fly
    - Though flying is common behaviour, few types don't fly.

- Duck is parent class, have methods like fly(), quack()
- Different types of duck inherits from parent Duck class  

### Problem

- Strategies are common in all inherited child classes
- But, they may work differently for different types of ducks
- ex, RubberDuck don't need fly behaviour but gets inherited from parent.

### Solution

- Create different implementations of a behaviour.
- Make them Interchangable.
- ex, wild duck and city duck inherits fly behaviour, but they have different implementations
- Let Child Class decide which implementation to use (Interface).