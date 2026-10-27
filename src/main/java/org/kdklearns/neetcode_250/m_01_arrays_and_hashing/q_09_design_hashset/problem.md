# Design HashSet

Design a HashSet without using any built-in hash table libraries.

Implement the `MyHashSet` class:

- `void add(key)`: Inserts `key` into the HashSet.
- `bool contains(key)`: Returns `true` if `key` exists in the HashSet. Otherwise, returns `false`.
- `void remove(key)`: Removes `key` from the HashSet. If `key` does not exist, do nothing.

## Example 1

```text
Input:
["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]

Output:
[null, null, null, true, false, null, true, null, false]
```

Explanation:

```java
MyHashSet myHashSet = new MyHashSet();
myHashSet.add(1);      // set = [1]
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(1); // returns true
myHashSet.contains(3); // returns false (not found)
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(2); // returns true
myHashSet.remove(2);   // set = [1]
myHashSet.contains(2); // returns false (already removed)
```

## Constraints

- `0 <= key <= 1,000,000`
- At most `10,000` calls will be made to `add`, `remove`, and `contains`.