# Singleton Design Pattern

### Gist
- Singleton is a creational design pattern, which ensures that only one object of its kind exists and provides a single point of access to it for any other code.
- Singleton has almost the same pros and cons as global variables. Although they’re super-handy, they break the modularity of your code.
---

## Example 1

### Given 

- A class with a condition that only one instance must be created.

### Problem

- Java doesn't have any inbuilt functionality to restrict the no. of objects which can be created of a class.
- There is a need to have create/mock this functionality manually. 
- Multithreaded Environment will have threads running parallely, which can run independently without knowing if instace already created or not,
 that needs to be handled as well.

### Solution

- In, Single-threaded Environment, a null check for object creation can work.
- But, in Multithreaded Environment, there are 3 different ways to handle the issue: 
    - using **`synchronized`** keyword _[add `synchronized` for checking null]_
    - using Double Checked Lock _[add `synchronized` (for checking null) only if obj's not created already]_
    - using Enum