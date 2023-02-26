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



