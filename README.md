                                                       Data structure

**•	About the project :**

 <sub>In this project, we study Java data structures and want to know what problem each has solved in data storage.
 We try to implement each of them along with their most useful methods. let's start with Array List !</sub>
 
 	                                                      a) ArrayLis

**•	Introduction:**

<sub>ArrayList in Java supports dynamic arrays and it is based on the array data structure. It is used for creating dynamic arrays that are resizable. also, we can use pre-defined methods of this class to manipulate the ArrayList elements.</sub>

**•	How Does ArrayList Work?**

<sub>When an ArrayList is created, its default capacity or size is 10 if not provided by the user. **The size of the ArrayList grows based on load factor and current capacity**. The Load Factor is a measure to decide when to increase its capacity. The default value of the load factor of an ArrayList is 0.75f.
 ArrayList in Java expands its capacity after each threshold which is calculated as the product of the current capacity and a load factor of the ArrayList instance. This means that after adding an element to the end of the list, its size will increase by reaching the threshold value. Inside, a new ArrayList is created with the new capacity, and the elements in the old ArrayList are copied into the new ArrayList.</sub>

**•	Is ArrayList a list or an array?**

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
