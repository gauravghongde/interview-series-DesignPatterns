#Observer Design Pattern

### Gist
- One to many relationship between objects
- If one object `(say A)` changes state all its dependencies are notified.
- Instead of all the dependencies of `A` asking/listening to `A` for its changes, Observer Patterns defines that, whenever there is a change in `A`, publish/broadcast/notify them to all their dependencies.
- It solves the problem of - all dependents asking in loop whether `A` has changed its state or not.
- `A` is called as the `Observable` / `Subject` and its dependencies are called `Oberservers`
- [Is Observer Pattern same as Pub-Sub Model??](https://medium.com/better-programming/observer-vs-pub-sub-pattern-50d3b27f838c)   
    - No, In the observer pattern, the observers are aware of the Subject. The Subject maintains a record of the Observers. 
    - Whereas, in publisher-subscriber, publishers and subscribers don't know each other. They simply communicate with the help of message queues or a broker.
---

## Example 1

### Given 

- A Youtube channel `(subject)`
- No. of users subscribed to that channel. `(observers)`
- Channel can upload video and users should know when a video gets uploaded.

### Problem

- Users have to look channel multiple times, to check if video has been uploaded
- Many Observers have to iterate same thing for one Subject. 
- This is called `Pull method`

### Solution

- Instead of Observers pulling data, Subject can push and notify Observers whenever there is a change.
- This is `Observable Pattern`