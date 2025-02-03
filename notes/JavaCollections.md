# Java Collections for DSA Preparation

Java Collections Framework provides a set of classes and interfaces that implement commonly reusable collection data structures. Understanding these collections is crucial for efficient problem-solving in DSA.

## Table of Contents
1. [Introduction to Java Collections](#introduction-to-java-collections)
2. [Core Interfaces](#core-interfaces)
3. [List Interface](#list-interface)
4. [Set Interface](#set-interface)
5. [Map Interface](#map-interface)
6. [Queue Interface](#queue-interface)
7. [Commonly Used Classes](#commonly-used-classes)
8. [Performance Considerations](#performance-considerations)
9. [Useful Methods](#useful-methods)
10. [Tips for DSA](#tips-for-dsa)

## Introduction to Java Collections
The Java Collections Framework is a unified architecture for representing and manipulating collections. It includes:
- **Interfaces**: Define the contract for collection types.
- **Implementations**: Concrete classes that implement the interfaces.
- **Algorithms**: Methods that perform useful computations on collections.

## Core Interfaces
- **Collection**: The root interface for all collections.
- **List**: Ordered collection (sequence).
- **Set**: Collection that does not allow duplicate elements.
- **Map**: Collection of key-value pairs.
- **Queue**: Collection used to hold multiple elements prior to processing.

## List Interface
- **ArrayList**: Resizable array implementation. Fast for random access but slower for insertions/deletions.
- **LinkedList**: Doubly-linked list implementation. Fast for insertions/deletions but slower for random access.
- **Vector**: Similar to ArrayList but synchronized.
- **Stack**: LIFO (Last In First Out) data structure.

### Example:
```java
List<String> list = new ArrayList<>();
list.add("Java");
list.add("Collections");
System.out.println(list); // Output: [Java, Collections]
```

## Set Interface
- **HashSet**: Implements Set using a hash table. No ordering guarantees.
- **LinkedHashSet**: Maintains insertion order.
- **TreeSet**: Implements Set using a tree. Elements are sorted.

### Example:
```java
Set<String> set = new HashSet<>();
set.add("Java");
set.add("Collections");
set.add("Java"); // Duplicate, will not be added
System.out.println(set); // Output: [Java, Collections]
```

## Map Interface
- **HashMap**: Implements Map using a hash table. No ordering guarantees.
- **LinkedHashMap**: Maintains insertion order.
- **TreeMap**: Implements Map using a tree. Keys are sorted.

### Example:
```java
Map<String, Integer> map = new HashMap<>();
map.put("Java", 1);
map.put("Collections", 2);
System.out.println(map); // Output: {Java=1, Collections=2}
```

## Queue Interface
- **PriorityQueue**: Orders elements according to their natural ordering or a comparator.
- **ArrayDeque**: Resizable-array implementation of the Deque interface.

### Example:
```java
Queue<String> queue = new PriorityQueue<>();
queue.add("Java");
queue.add("Collections");
System.out.println(queue.poll()); // Output: Collections
```

## Commonly Used Classes
- **Collections**: Utility class with static methods for operating on collections.
- **Arrays**: Utility class with static methods for operating on arrays.

### Example:
```java
List<Integer> list = Arrays.asList(1, 2, 3);
Collections.sort(list);
System.out.println(list); // Output: [1, 2, 3]
```

## Performance Considerations
- **ArrayList**: O(1) for get/set, O(n) for add/remove.
- **LinkedList**: O(n) for get/set, O(1) for add/remove.
- **HashSet**: O(1) for add/remove/contains.
- **TreeSet**: O(log n) for add/remove/contains.
- **HashMap**: O(1) for get/put.
- **TreeMap**: O(log n) for get/put.

## Useful Methods
- **add(E e)**: Adds an element to the collection.
- **remove(Object o)**: Removes an element from the collection.
- **contains(Object o)**: Checks if the collection contains an element.
- **size()**: Returns the number of elements in the collection.
- **isEmpty()**: Checks if the collection is empty.
- **iterator()**: Returns an iterator over the elements.

## Tips for DSA
1. **Understand the Problem**: Choose the right collection based on the problem requirements.
2. **Time Complexity**: Always consider the time complexity of operations.
3. **Space Complexity**: Be mindful of the space used by different collections.
4. **Practice**: Implement common DSA problems using different collections to understand their strengths and weaknesses.

### Example Problem:
**Problem**: Find the first non-repeating character in a string.
**Solution**:
```java
import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "leetcode";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return;
            }
        }
        System.out.println("No non-repeating character found.");
    }
}
```

## Note
These notes are created by DeepSeek & I am saving it here!