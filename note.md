# Basic : 
## Maths  --->
## BitMagics -->


# _**Time complexity**_
https://www.jaroeducation.com/blog/time-complexity-and-why-is-it-essential/

https://medium.com/data-science/understanding-time-complexity-with-python-examples-2bda6e8158a7

https://www.geeksforgeeks.org/dsa/analysis-algorithms-big-o-analysis/


# **HashMap** :

url : https://www.geeksforgeeks.org/java/java-util-hashmap-in-java-with-examples/

### **Summary of HashMap** :

Key-Value Pairs: Stores data as key-value pairs, where each key maps to exactly one value.
Primitive Data Types: Does not directly support primitives (e.g., int, char); uses wrapper classes (e.g., Integer, Character) due to Java’s generics.
Null Handling:

Allows one null key (stored in the bucket at index 0).
Allows multiple null values (associated with different keys).


Not Synchronized: Not thread-safe; for thread safety, use Collections.synchronizedMap(new HashMap<>()) or ConcurrentHashMap.
Thread Safety: Collections.synchronizedMap adds a synchronization wrapper, but ConcurrentHashMap is preferred for concurrent environments due to better performance (uses lock striping).

Additional Key Notes:

Underlying Structure:

HashMap uses an array of buckets (Node arrays) where keys are hashed using hashCode() to determine the bucket index.
Collisions are resolved using a linked list (for small collisions) or a red-black tree (when a bucket has ≥8 entries, Java 8+), improving performance from O(n) to O(log n) for collision-heavy cases.
Example: In #1 (Two Sum), keys (complement values) are hashed to store indices.

Time Complexity:

Put/Get/Remove: O(1) average case (assuming good hash function, minimal collisions).
Collisions: O(log n) worst case (with tree-based buckets) or O(n) if hash function is poor.
Relevant for #242 (Valid Anagram): Character counting with HashMap is O(n), vs. O(n log n) for sorting.


Load Factor and Resizing:

Default Capacity: 16 buckets.
Load Factor: 0.75 (when 75% full, e.g., 12 entries, the map resizes to double the capacity).
Resizing is expensive (O(n) to rehash all entries), so set initial capacity if size is known (e.g., new HashMap<>(100) for large datasets).
Example: In your email system, initializing HashMap with expected email count reduces resizing.


Key Requirements:

Keys must implement hashCode() and equals() correctly for proper hashing and comparison.
Immutable keys (e.g., String, Integer) are preferred to avoid issues if key state changes.
Example: In #1 (Two Sum), Integer keys (complement values) ensure reliable hashing.


Iteration:

Not ordered; use LinkedHashMap for insertion-order or access-order iteration.
Example: for (Map.Entry<K, V> entry : map.entrySet()) or map.forEach((k, v) -> ...) for iteration.
Useful for debugging solutions like #350 (Intersection of Two Arrays II).


Common Methods:

put(K key, V value): Adds or updates a key-value pair.
get(K key): Retrieves value or null if absent.
containsKey(K key): Checks if key exists (O(1) average).
remove(K key): Removes key-value pair.
getOrDefault(K key, V defaultValue): Useful for avoiding null checks (e.g., in #350).
Example: In #217, HashSet (backed by HashMap) uses add() to detect duplicates.


Performance Tips:

Use HashMap for fast lookups in problems like #1, #242, #350.
Avoid frequent resizing by estimating capacity (e.g., new HashMap<>(n / 0.75 + 1)).
For thread-safe scenarios, prefer ConcurrentHashMap for high-concurrency backend systems (e.g., your email system).


Use in Your Context:

Email System: Your deduplication logic likely used HashSet, which internally uses HashMap (keys are elements, values are dummy objects). Similar logic applies to #217.
Startup Interviews: HashMap is critical for problems like #1 (Two Sum), #146 (LRU Cache), and #560 (Subarray Sum Equals K)


Limitations:

No guaranteed order (use LinkedHashMap or TreeMap for ordered keys).
Not suitable for sorted keys (use TreeMap for O(log n) operations with sorted order).
Memory overhead due to bucket array and node objects.


Java 8+ Enhancements:

Tree-based Buckets: Java 8+ switches to red-black trees for buckets with ≥8 entries, improving worst-case performance.
Stream API: Use with HashMap for concise operations (e.g., map.entrySet().stream().filter(...)).
Example: In #242, you could use Streams to count characters, though array-based counting is faster.


# HashSet

📌 Key Points about HashSet

Stores unique elements only – duplicates are automatically removed.

Unordered collection – insertion order is not preserved (use LinkedHashSet if you need insertion order).

Implements Set interface – part of Java Collections Framework.

Underlying data structure – internally uses a HashMap (keys are elements, values are dummy objects).

Allows null – only one null element is permitted.

Not synchronized – if multiple threads access it concurrently, external synchronization is needed (Collections.synchronizedSet() or ConcurrentHashMap.newKeySet() can be used).

Load factor & capacity – performance depends on initial capacity and load factor (default 16 capacity, 0.75 load factor).

📌 Common Methods

add(E e) → Adds an element if not already present.

remove(Object o) → Removes a specific element.

contains(Object o) → Checks if element exists.

size() → Returns number of unique elements.

isEmpty() → Checks if set is empty.

clear() → Removes all elements.

iterator() → Returns iterator for traversal.

forEach(Consumer<? super E> action) → Used with lambda expressions for iteration.

📌 Performance

Average time complexity:

add(), remove(), contains() → O(1)

Worst-case (hash collisions): O(n)

📌 When to Use

When you need fast lookup and don’t care about order.

To remove duplicates from a collection (e.g., list).

👉 If you need sorted order, use TreeSet.
👉 If you need insertion order preserved, use LinkedHashSet.


🚀 Queue in Java

A Queue is a linear data structure that follows the FIFO (First-In, First-Out) principle.
The element inserted first is removed first (like a line at a ticket counter).

🔹 Queue Interface

The Queue<E> interface is part of java.util and extends the Collection interface.


🔹 Common Implementations
1️⃣ LinkedList

Implements both Queue and Deque.

Allows null elements.

Good when frequent insertions/removals happen at both ends.

2️⃣ PriorityQueue

Orders elements by natural order or a custom Comparator.

Does not allow null.

Useful when you need to access elements in priority order (like smallest/largest first).

3️⃣ ArrayDeque

Resizable array-based implementation of Deque.

Faster than LinkedList.

Does not allow null.

Great for general-purpose FIFO queues.

4️⃣ BlockingQueue (Multithreading)

Belongs to java.util.concurrent.

Provides thread-safe operations.

Supports blocking put/take → producer waits if queue is full, consumer waits if empty.

Examples:

ArrayBlockingQueue → bounded, array-based

LinkedBlockingQueue → optionally bounded, linked nodes

PriorityBlockingQueue → ordered, unbounded

5️⃣ ConcurrentLinkedQueue (Multithreading)

Thread-safe, non-blocking, lock-free queue.

Uses CAS (Compare-And-Set) for concurrency.

Unbounded (grows until memory limit).

Best for high-performance producer-consumer scenarios where blocking is not required.

| \[ ] Implementation            | Thread-Safe | Blocking? | Null Allowed | Best Use Case                              |
| ------------------------------ | ----------- | --------- | ------------ | ------------------------------------------ |
| \[ ] **LinkedList**            | ❌ No        | ❌ No      | ✅ Yes        | Simple FIFO, frequent inserts/removes      |
| \[ ] **PriorityQueue**         | ❌ No        | ❌ No      | ❌ No         | Min/max ordering by priority               |
| \[ ] **ArrayDeque**            | ❌ No        | ❌ No      | ❌ No         | Fast general-purpose queue                 |
| \[ ] **BlockingQueue**         | ✅ Yes       | ✅ Yes     | ❌ No         | Producer-consumer with waiting behavior    |
| \[ ] **ConcurrentLinkedQueue** | ✅ Yes       | ❌ No      | ❌ No         | High-performance, lock-free multithreading |



   