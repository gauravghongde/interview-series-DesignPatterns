# Command Design Pattern

### Gist
- Encapsulation of Command or Request
- Separates the Command entity from Object sending the request and Object receiving the request
- The idea is: 
    - A single command (ex: Copy Command)
        - can be invoked by multiple ways (Ctrl+C, RightClick>Copy, etc) OR
        - can be applicable for multiple receivers (copyImage & copyText)
    - so, why not to decouple Commands & make'em configurable
- Use the Command pattern when 
    - you want to parametrize objects with operations.
    - you want to implement reversible operations.
- You can use Command and Memento together when implementing “undo”. In this case, commands are responsible for performing various operations over a target object, while mementos save the state of that object just before a command gets executed.
---

## Example 1

### Given 

- Electronic devices (receiver) -> TV and Radio
- Both having ability to (commands) turn off, turn on, volume up & volume down
- Remote/Button (invoker)

### Problem

- Each Button can have its own static - fixed execute method.
- But, there will be code duplication when we introduce new buttons, which does the same operations. 

### Solution

- Decoupling and Encapsulating commands, which an invoker can call.
- Same implementation can be used when another invoker is added.
