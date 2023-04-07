                                                                  Data structure

 **•	About the project :**

 <sub>In this project, we study Java data structures and want to know what problem each has solved in data storage.
 We try to implement each of them along with their most useful methods. let's start with Array List !</sub>
 
                                                             a) ArrayLis

**•	Introduction :**

<sub>ArrayList in Java supports dynamic arrays and it is based on the array data structure. It is used for creating dynamic arrays that are resizable. also, we can use pre-defined methods of this class to manipulate the ArrayList elements.</sub>

 **• How Does ArrayList Work?**

<sub>When an ArrayList is created, its default capacity or size is 10 if not provided by the user. **The size of the ArrayList grows based on load factor and current capacity**. The Load Factor is a measure to decide when to increase its capacity. The default value of the load factor of an ArrayList is 0.75f.
 ArrayList in Java expands its capacity after each threshold which is calculated as the product of the current capacity and a load factor of the ArrayList instance. This means that after adding an element to the end of the list, its size will increase by reaching the threshold value. Inside, a new ArrayList is created with the new capacity, and the elements in the old ArrayList are copied into the new ArrayList.</sub>

 **•Is ArrayList a list or an array?**

<sub>ArrayList is a class in Java Collection Framework that implements the List interface and is based on the array data structure. Internally, it uses a backing array for storing objects.<sub>

**•	Why do we use the list?**

<sub>The difference between a built-in array and an ArrayList in Java is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want so When we are uncertain about the number of elements to be stored and we want to preserve its order of insertion, we can use ArrayList.</sub>

**•	Pros and Cons**

<sub>+ Provides fast iteration of elements using indexing.</sub>

<sub>+ It provides memory coherence meaning the elements are stored in a sequential memory location.</sub>

<sub>+ Fast random access of elements due to memory coherence.</sub>

<sub>+ Provides an optional option to define the size during its creation.</sub>

<sub>- The addition or deletion of data from the middle is time-consuming as data needs to be shifted to update the list.</sub>

<sub>- Due to memory coherence, for larger elements, a list will need significant contiguous blocks of memory. So memory wastage is found.</sub>

<sub>- Resizing an ArrayList when it reaches its capacity with its initial capacity which is 10 is a costlier process as the elements will be copied from old to new space with 50% more capacity</sub>


**•	The time complexity of various operations :**

<sub>* Random access takes O(1) time</sub> 

<sub>* Adding an element takes amortized constant time O(1)</sub>

<sub>* Inserting/Deleting takes O(n) time</sub>

<sub>* Searching takes O(n) time for an unsorted array and O(log n) for a sorted one</sub>


                                                              b) LinkedList
  

**• what is linked list ?**

<sub>A linked list is another way to collect similar data . A Linked list is a dynamic arrangement that contains a “link” to the structure containing the subsequent items . It’s a set of structures ordered not by their physical placement in memory (like an array) but by logical links stored as part of the structure's information . unlike an
array,elements during a linked list aren’t in consecutive memory locations.<sub>

<sub>A linked list is a linear data structure that includes a series of connected nodes. A linked list can be defined as the nodes that are randomly stored in the memory. A node in the linked list contains two parts, i.e., the first is the data part and the second is the address part. In a linked list, every link contains a connection to another link. The last node of the list contains a pointer to the null.
After the array, a linked list is the second most used data structure.<sub>


**• Type of linked list :**

 1)Singly Linked List :
<sub>It is the simplest type of linked list in which every node contains some data and a pointer to the next node of the same data type. The node contains a pointer to the next node means that the node stores the address of the next node in the sequence. A singly linked list allows the traversal of data only in one way.<sub>

 2)Doubly or Two Way Linked List :
<sub>A doubly linked list or a two-way linked list is a more complex type of linked list that contains a pointer to the next as well as the previous node in sequence, Therefore, it contains three parts of data, a pointer to the next node, and a pointer to the previous node. This would enable us to traverse the list in the backward direction as well.<sub>

 3)Circular Linked List :
<sub>A circular linked list is one in which the last node contains the pointer to the first node of the list. While traversing a circular linked list, one can begin at any node and traverse the list in any direction forward and backward until reaching the same node where it started. Thus, a circular linked list has no beginning and no end.<sub>

 4)Circular Doubly Linked List :
<sub>A Doubly Circular linked list or a circular two-way linked list is a more complex type of linked-list that contains a pointer to the next as well as the previous node in the sequence. The difference between the doubly linked and circular doubly list is the same as that between a singly linked list and a circular linked list. The circular doubly linked list does not contain null in the previous field of the first node.
<sub>

  **•	Pros and Cons**
  
<sub> +Dynamic data structure : A linked list is a dynamic arrangement so it can grow and shrink at runtime by allocating and deallocating memory. So there is no need to give the initial size of the linked list.<sub>
 
<sub>+No memory wastage : In the Linked list, efficient memory utilization can be achieved since the size of the linked list increase or decrease at run time so there is no memory wastage and there is no need to pre-allocate the memory.<sub>
  
<sub>+Insertion and Deletion Operations :Insertion and deletion operations are quite easier in the linked list. There is no need to shift elements after the insertion or deletion of an element only the address present in the next pointer needs to be updated.<sub> 
 
<sub> +Flexible : This is because the elements in Linked List  are not stored in contiguous memory locations unlike the array.<sub>
  
<sub>+Efficient for large data : When working with large datasets linked lists play a crucial role as it can grow and shrink dynamically.<sub>

<sub>-Memory usage : More memory is required in the linked list as compared to an array. Because in a linked list, a pointer is also required to store the address of the next element and it requires extra memory for itself.<sub>

<sub>-Traversal : In a Linked list traversal is more time-consuming as compared to an array. Direct access to an element is not possible in a linked list as in an array by index. For example, for accessing a node at position n, one has to traverse all the nodes before it.<sub>

<sub>-Reverse Traversing : In a singly linked list reverse traversing is not possible, but in the case of a doubly-linked list, it can be possible as it contains a pointer to the previously connected nodes with each node. For performing this extra memory is required for the back pointer hence, there is a waste of memory.<sub>

<sub>-Random Access : Random access is not possible in a linked list due to its dynamic memory allocation.<sub>

<sub>-Lower efficiency at times : For certain operations, such as searching for an element or iterating through the list, can be slower in a linked list.<sub>

<sub> -Difficult to share data :This is because it is not possible to directly access the memory address of an element in a linked list.<sub>
 
<sub>-Not suited for a small dataset :
Cannot provide any significant benefits on a small dataset<sub>



**•	The time complexity of various operations :**

<sub>* Inserting/Deleting takes O(1) time</sub> 

<sub>* Random access takes O(n) time</sub> 

<sub>* Searching takes O(n) time </sub>

                                                          c) map


**• introduction :**

<sub>A map (dictionary) is a data structure that associates each key with a corresponding value. Keys and values can be of any data type, providing more flexibility for data access than array indices and improved performance.<sub>

**• map Interface in Java**

<sub>The map interface is present in java.util package represents a mapping between a key and a value. The Map interface is not a subtype of the Collection interface. Therefore it behaves a bit differently from the rest of the collection types. A map contains unique keys.<sub>

**• why and when to use Maps?**

<sub>Maps are perfect to use for key-value association mapping such as dictionaries. The maps are used to perform lookups by keys or when someone wants to retrieve and update elements by keys. Some common scenarios are as follows:<sub>

<sub>* A map of error codes and their descriptions.<sub>

<sub>* A map of zip codes and cities.<sub>

<sub>* A map of managers and employees. Each manager (key) is associated with a list of employees (value) he manages.<sub>

<sub>* A map of classes and students. Each class (key) is associated with a list of students (value).<sub>

<sub>Since Map is an interface, objects cannot be created of the type map. We always need a class that extends this map in order to create an object. And also, after the introduction of Generics in Java 1.5, it is possible to restrict the type of object that can be stored in the Map.
A Map cannot contain duplicate keys and each key can map to at most one value. Some implementations allow null key and null values like the HashMap and LinkedHashMap, but some do not like the TreeMap.
The order of a map depends on the specific implementations. For example, TreeMap and LinkedHashMap have predictable orders, while HashMap does not.
There are two interfaces for implementing Map in java. They are Map and SortedMap, and three classes: HashMap, TreeMap, and LinkedHashMap.<sub>

**•  Classes that implement the Map interface are   described  as follows:**

**- Class 1: HashMap** 

<sub>HashMap is a part of Java’s collection since Java 1.2. It provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs. To access a value one must know its key. This class uses a technique called Hashing.Hashing is a technique or process of mapping keys, and values into the hash table by using a hash function. It is done for faster access to elements. The efficiency of mapping depends on the efficiency of the hash function used.<sub>

**- Class 2: LinkedHashMap**
<sub>LinkedHashMap is just like HashMap with an additional feature of maintaining an order of elements inserted into it. HashMap provided the advantage of quick insertion, search, and deletion but it never maintained the track and order of insertion which the LinkedHashMap provides where the elements can be accessed in their insertion order. Let’s see how to create a map object using this class.<sub>

**- Class 3: TreeMap**
<sub>The TreeMap in Java is used to implement the Map interface and NavigableMap along with the Abstract Class. The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used. This proves to be an efficient way of sorting and storing the key-value pairs. The storing order maintained by the treemap must be consistent with equals just like any other sorted map, irrespective of the explicit comparators. Let’s see how to create a map object using this class.<sub>

**•  Advantages add disadvantage of HashMap**

<sub>+Allows insertion of key value pair.<sub>

<sub>+HashMap is non synchronized.HashMap cannot be shared between multiple threads without proper synchronization.<sub>

<sub>+HashMap is a fail-fast iterator.<sub>

<sub>+Faster access of elements due to hashing technology.<sub>

<sub>-Potential of collision when 2 distinct keys generate the same hashCode() value worse the performance of the hashMap.<sub>

<sub>-Occasionally HashMap requires resizing when the original size of HashMap buckets is full. Resizing takes O(n) time as the elements from the previous hashtable/HashMap are transferred to a new bigger HashMap.<sub>

<sub>-Hash tables do not, generally, preserve ordering -- be it natural ordering or order of insertion. (Those that do typically employ a parallel structure to maintain the ordering, or else perform a relatively expensive sort at the time of iteration.)<sub>

**•  Advantages add disadvantage of LinkedHashMap**

<sub>+Manintains insertion order.<sub>

<sub>+Faster iteration with LinkedHashMap.<sub>

<sub>-Slower than HashMap for adding and removing elements.<sub>

**•  Advantages of TreeMap**

<sub>+TreeMap stores key-value pairs in a sorted ascending order(based on the key).<sub>

<sub>+Lets you define a custom sort order<sub>

<sub>+The retrieval speed of an element out of a TreeMap is fast, even in a TreeMap with a large number of elements.<sub>




                                                               d) Set


**• introduction :**

<sub>A set is a data structure that can store any number of unique values in any order you so wish. Set’s are different from arrays in the sense that they only allow non-repeated, unique values within them.<sub>


**• map Interface in Java :**

<sub>Set is a data structure that is used as a collection of objects. Java supports it through its Java Collection library. The set interface is present in java.util package and extends the Collection interface. It is an unordered collection of objects in which duplicate values cannot be stored. It is an interface that implements the mathematical set. This interface contains the methods inherited from the Collection interface and adds a feature that restricts the insertion of the duplicate elements. There are two interfaces that extend the set implementation namely SortedSet and NavigableSet.<sub>

<sub>There are several ways to implement a set and Java supports three different implementations along with useful operations like intersection between sets.<sub>

<sub>1) HashSet: using a hash map behind the set<sub>

<sub>2)TreeSet: using a tree behind the set<sub>

<sub>3)LinkedHashSet: using a linked list as a collison management technique in the hash map which is used behind the set<sub>

**•Key ideas :**

<sub>*A set is a collection of objects like integers<sub>

<sub>*It allows insertion of elements in the set and to search an element<sub>

<sub>*Java set is an interface which extends collection.<sub>

<sub>*set can not contain duplicate elements .<sub>

<sub>*Java Set allow at most one null value.<sub>

**1) HashSat :**
<sub>The HashSet class implements the Set interface, backed by a hash table which is actually a HashMap instance. No guarantee is made as to the iteration order of the set which means that the class does not guarantee the constant order of elements over time. This class permits the null element. The class also offers constant time performance for the basic operations like add, remove, contains, and size assuming the hash function disperses the elements properly among the buckets, which we shall see further in the article.<sub>

**•A few important features of HashSet are :**

<sub>* Implements Set Interface.<sub>

<sub>* The underlying data structure for HashSet is Hashtable.<sub>

<sub>* As it implements the Set Interface, duplicate values are not allowed.<sub>

<sub>* Objects that you insert in HashSet are not guaranteed to be inserted in the same order. Objects are inserted based on their hash code.<sub>

<sub>* NULL elements are allowed in HashSet.<sub>

<sub>*HashSet also implements Serializable and Cloneable interfaces.<sub>


<sub>Now for the maintenance of constant time performance, iterating over HashSet requires time proportional to the sum of the HashSet instance’s size (the number of elements) plus the “capacity” of the backing HashMap instance (the number of buckets). Thus, it’s very important not to set the initial capacity too high (or the load factor too low) if iteration performance is important.<sub>

 
**Initial Capacity :**
<sub>The initial capacity means the number of buckets when hashtable (HashSet internally uses hashtable data structure) is created. The number of buckets will be automatically increased if the current size gets full.<sub> 
 
**Load Factor :**
<sub>The load factor is a measure of how full the HashSet is allowed to get before its capacity is automatically increased. When the number of entries in the hash table exceeds the product of the load factor and the current capacity, the hash table is rehashed (that is, internal data structures are rebuilt) so that the hash table has approximately twice the number of buckets.<sub>


**Effect on performance :** 

<sub>Load factor and initial capacity are two main factors that affect the performance of HashSet operations. A load factor of 0.75 provides very effective performance with respect to time and space complexity. If we increase the load factor value more than that then memory overhead will be reduced (because it will decrease internal rebuilding operation) but, it will affect the add and search operation in the hashtable. To reduce the rehashing operation we should choose initial capacity wisely. If the initial capacity is greater than the maximum number of entries divided by the load factor, no rehash operation will ever occur.<sub>


**Internal working of a HashSet :**

<sub>All the classes of Set interface are internally backed up by Map. HashSet uses HashMap for storing its object internally. You must be wondering that to enter a value in HashMap we need a key-value pair, but in HashSet, we are passing only one value. Storage in HashMap: Actually the value we insert in HashSet acts as a key to the map Object and for its value, java uses a constant variable. So in the key-value pair, all the values will be the same.<sub>


**2)LinkedHashSet :**

<sub>The LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements. When the iteration order is needed to be maintained this class is used. When iterating through a HashSet the order is unpredictable, while a LinkedHashSet lets us iterate through the elements in the order in which they were inserted. When cycling through LinkedHashSet using an iterator, the elements will be returned in the order in which they were inserted<sub>

**3)TreeSet :**
<sub>TreeSet provides an implementation of the SortedSet Interface and SortedSet extends Set Interface. It behaves like simple set with the exception that it stores elements in sorted format.<sub>

<sub>* TreeSet uses tree data structure for storage.<sub>

<sub>* Objects are stored in sorted, ascending order. But we can iterate in descending order using method TreeSet.descendingIterator().<sub>

<sub>* Access and retrieval times are very fast which make TreeSet an excellent choice for storage of large volume of data in sorted format.<sub>

<sub>* TreeSet doesn’t use hashCode() and equals() methods to compare it’s elements. It uses compare() (or compareTo()) method to determine the equality of two elements.<sub>

**4)EnumSet :**

<sub>The EnumSet is one of the specialized implementations of the Set interface for use with the enumeration type.<sub>

<sub>* It extends AbstractSet class and implements Set Interface in Java.<sub>

<sub>* EnumSet class is a member of the Java Collections Framework & is not synchronized.<sub>

<sub>* It’s a high-performance set implementation, much faster than HashSet.<sub>

<sub>* All of the elements in an EnumSet must come from a single enumeration type that is specified when the set is created either explicitly or implicitly.<sub>

<sub>* It does not allow null Objects and throws NullPointerException if we do so.<sub>

<sub>* It uses a fail-safe iterator, so it won’t throw ConcurrentModificationException if the collection is modified while iterating.<sub><sub>

**Benefits of using EnumSet :**

<sub>Due to its implementation using RegularEnumSet and JumboEnumSet, all the methods in an EnumSet are implemented using bitwise arithmetic operations.<sub>

<sub>EnumSet is faster than HashSet because we no need to compute any hashCode to find the right bucket.<sub>

<sub>The computations are executed in constant time and the space required is very little.<sub>


**•	The time complexity of various operations :**


**HashSet**

<sub>HashSet add method have constant time complexity O(1).<sub>

<sub>HashSet remove method have constant time complexity O(1).<sub>


**LinkedHashSet**

<sub>LinkedHashSet add method have constant time complexity O(1).<sub>

<sub>LinkedHashSet remove method have constant time complexity O(1).<sub>


**TreeSet**

<sub>TreeSet add method have constant time complexity O(log(n)).<sub>

<sub>TreeSet remove method have constant time complexity O(log(n)).<sub>


                                                             e)stack
                                                             
                                                             
**• introduction :**

<sub>A stack is a simple linear data structure used for storing data. Stack follows the LIFO(Last In First Out) strategy that states that the element that is inserted last will come out first. You can take a pile of plates kept on top of each other as a real-life example. The plate we put last is on the top and since we remove the plate at the top, we can say that the plate that was put last comes out first.  It can be implemented through an array or linked lists.<sub>

**• map Interface in Java :**

<sub>In Java, Stack is a class that falls under the Collection framework that extends the Vector class. It also implements interfaces List, Collection, Iterable, Cloneable, and Serializable. It represents the LIFO stack of objects. Before using the Stack class, we must import the Java. util package. <sub>

**• Types of Stacks :**

**Register Stack :**

<sub>This type of stack is also a memory element present in the memory unit and can handle a small amount of data only. The height of the register stack is always limited as the size of the register stack is very small compared to the memory.<sub>

**Memory Stack :**

<sub>This type of stack can handle a large amount of memory data. The height of the memory stack is flexible as it occupies a large amount of memory data<sub>

**• What is meant by Top of the Stack ?**

<sub>When a new element is added to the stack, it is placed on top of the existing elements. Similarly, when an element is removed from the stack, the topmost element is removed first. The top of the stack is always the element that is currently accessible for viewing or manipulation.
The pointer through which the elements are accessed, inserted, and deleted in the stack is called the top of the stack. It is the pointer to the topmost element of the stack.<sub>


**•Application of Stack Data Structure :**

**Function calls and recursion :**
<sub>When a function is called, the current state of the program is pushed onto the stack. When the function returns, the state is popped from the stack to resume the previous function’s execution.<sub>

**Undo/Redo operations :**
<sub>The undo-redo feature in various applications uses stacks to keep track of the previous actions. Each time an action is performed, it is pushed onto the stack. To undo the action, the top element of the stack is popped, and the reverse operation is performed.<sub>

**Expression evaluation :**
<sub>Stack data structure is used to evaluate expressions in infix, postfix, and prefix notations. Operators and operands are pushed onto the stack, and operations are performed based on the stack’s top elements.<sub>

**Browser history :**
<sub> Web browsers use stacks to keep track of the web pages you visit. Each time you visit a new page, the URL is pushed onto the stack, and when you hit the back button, the previous URL is popped from the stack.<sub> 

**Balanced Parentheses :**
<sub>Stack data structure is used to check if parentheses are balanced or not. An opening parenthesis is pushed onto the stack, and a closing parenthesis is popped from the stack. If the stack is empty at the end of the expression, the parentheses are balanced.<sub>

**Backtracking Algorithms :**
<sub>The backtracking algorithm uses stacks to keep track of the states of the problem-solving process. The current state is pushed onto the stack, and when the algorithm backtracks, the previous state is popped from the stack.<sub>


**•Advantages of Stack :**

Easy implementation: <sub>Stack data structure is easy to implement using arrays or linked lists, and its operations are simple to understand and implement.<sub>

Efficient memory utilization :<sub> Stack uses a contiguous block of memory, making it more efficient in memory utilization as compared to other data structures.<sub>

Fast access time :<sub> Stack data structure provides fast access time for adding and removing elements as the elements are added and removed from the top of the stack.<sub>

Helps in function calls :<sub> Stack data structure is used to store function calls and their states, which helps in the efficient implementation of recursive function calls.<sub>
Supports backtracking :<sub> Stack data structure supports backtracking algorithms, which are used in problem-solving to explore all possible solutions by storing the previous states.<sub>

Used in Compiler Design:<sub> Stack data structure is used in compiler design for parsing and syntax analysis of programming languages.<sub>

Enables undo/redo operations:<sub> Stack data structure is used to enable undo and redo operations in various applications like text editors, graphic design tools, and software development environments.<sub>



**•Disadvantages of Stack :**

Limited capacity :<sub> Stack data structure has a limited capacity as it can only hold a fixed number of elements. If the stack becomes full, adding new elements may result in stack overflow, leading to the loss of data.<sub>

No random access :<sub> Stack data structure does not allow for random access to its elements, and it only allows for adding and removing elements from the top of the stack. To access an element in the middle of the stack, all the elements above it must be removed.<sub>

Memory management :<sub> Stack data structure uses a contiguous block of memory, which can result in memory fragmentation if elements are added and removed frequently.<sub>

Not suitable for certain applications :<sub> Stack data structure is not suitable for applications that require accessing elements in the middle of the stack, like searching or sorting algorithms.<sub>

Stack overflow and underflow :<sub> Stack data structure can result in stack overflow if too many elements are pushed onto the stack, and it can result in stack underflow if too many elements are popped from the stack.<sub>

Recursive function calls limitations :<sub> While stack data structure supports recursive function calls, too many recursive function calls can lead to stack overflow, resulting in the termination of the program.<sub>


                                                       f) queue

**• introduction :**

<sub>The queue is an abstract data structure, somewhat similar to Stacks. Unlike stacks, a queue is open at both ends. One end is always used to insert data (enqueue) and the other is used to remove data (dequeue). Queue follows the First-In-First-Out methodology, i.e., the data item stored first will be accessed first.
A Queue is like a line waiting to purchase tickets, where the first person in line is the first person served. (i.e. First come first serve).
The position of the entry in a queue ready to be served, that is, the first entry that will be removed from the queue, is called the front of the queue(sometimes, head of the queue), similarly, the position of the last entry in the queue, that is, the one most recently added, is called the rear (or the tail) of the queue.<sub>


**• Types of Queues:**

Simple Queue :<sub> Simple queue also known as a linear queue is the most basic version of a queue. Here, insertion of an element i.e. the Enqueue operation takes place at the rear end and removal of an element i.e. the Dequeue operation takes place at the front end.<sub>

Circular Queue :<sub> In a circular queue, the element of the queue act as a circular ring. The working of a circular queue is similar to the linear queue except for the fact that the last element is connected to the first element. Its advantage is that the memory is utilized in a better way. This is because if there is an empty space i.e. if no element is present at a certain position in the queue, then an element can be easily added at that position.<sub>

Priority Queue :<sub> This queue is a special type of queue. Its specialty is that it arranges the elements in a queue based on some priority. The priority can be something where the element with the highest value has the priority so it creates a queue with decreasing order of values. The priority can also be such that the element with the lowest value gets the highest priority so in turn it creates a queue with increasing order of values.<sub>

Dequeue :<sub> Dequeue is also known as Double Ended Queue. As the name suggests double ended, it means that an element can be inserted or removed from both the ends of the queue unlike the other queues in which it can be done only from one end. Because of this property it may not obey the First In First Out property.<sub>

**• Applications of Queue:**

Multi programming :<sub> Multi programming means when multiple programs are running in the main memory. It is essential to organize these multiple programs and these multiple programs are organized as queues.<sub>

Network :<sub> In a network, a queue is used in devices such as a router or a switch. another application of a queue is a mail queue which is a directory that stores data and controls files for mail messages.<sub>

Job Scheduling :<sub> The computer has a task to execute a particular number of jobs that are scheduled to be executed one after another. These jobs are assigned to the processor one by one which is organized using a queue.<sub>
Shared resources :<sub> Queues are used as waiting lists for a single shared resource.<sub>

**• Queue Interface in Java :**

<sub>The Queue implementations are grouped into general-purpose and concurrent implementations.<sub>

General-Purpose Queue Implementations :

<sub>As mentioned in the previous section, LinkedList implements the Queue interface, providing first in, first out (FIFO) queue operations for add, poll, and so on.
The PriorityQueue class is a priority queue based on the heap data structure. This queue orders elements according to the order specified at construction time, which can be the elements' natural ordering or the ordering imposed by an explicit Comparator.<sub>

<sub>The queue retrieval operations — poll, remove, peek, and element — access the element at the head of the queue. The head of the queue is the least element with respect to the specified ordering. If multiple elements are tied for least value, the head is one of those elements; ties are broken arbitrarily.<sub>

<sub>PriorityQueue and its iterator implement all of the optional methods of the Collection and Iterator interfaces. The iterator provided in method iterator is not guaranteed to traverse the elements of the PriorityQueue in any particular order. For ordered traversal, consider using Arrays.sort(pq.toArray()).<sub>

Concurrent Queue Implementations :

<sub>The java.util.concurrent package contains a set of synchronized Queue interfaces and classes. BlockingQueue extends Queue with operations that wait for the queue to become nonempty when retrieving an element and for space to become available in the queue when storing an element. This interface is implemented by the following classes:<sub>

LinkedBlockingQueue —<sub> an optionally bounded FIFO blocking queue backed by linked nodes<sub>

ArrayBlockingQueue —<sub> a bounded FIFO blocking queue backed by an array<sub>

PriorityBlockingQueue —<sub> an unbounded blocking priority queue backed by a heap<sub>

DelayQueue — <sub>a time-based scheduling queue backed by a heap<sub>

SynchronousQueue —<sub> a simple rendezvous mechanism that uses the BlockingQueue interface<sub>

<sub>In JDK 7, TransferQueue is a specialized BlockingQueue in which code that adds an element to the queue has the option of waiting (blocking) for code in another thread to retrieve the element. TransferQueue has a single implementation:<sub>

<sub>LinkedTransferQueue — an unbounded TransferQueue based on linked nodes<sub>


**• Advantages of Queue :**

<sub>A large amount of data can be managed efficiently and with ease.<sub>

<sub>Operations such as insertion and deletion can be performed with ease as it follows the first in first out rule.<sub>

<sub>Queues are useful when a particular service is used by multiple consumers.<sub>

<sub>Queues are fast in speed for data inter-process communication.<sub>

<sub>Queues can be used in the implementation of other data structures.<sub>



**• Disadvantages of Queue :**

<sub>The operations such as insertion and deletion of elements from the middle are time-consuming.<sub>

<sub>Limited Space.<sub>

<sub>In a classical queue, a new element can only be inserted when the existing elements are deleted from the queue.<sub>

<sub>The maximum size of a queue must be defined prior.<sub>


**•	The time complexity of various operations :**

 <sub>enqueue take constant time i.e O(1).<sub>
 
 <sub>dequeue take constant time i.e O(1).<sub>

<sub>Searching for an element takes O(N) time.<sub>



























