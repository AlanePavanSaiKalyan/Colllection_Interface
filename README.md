In Java, standard arrays (int[], String[]) are incredibly fast, but they have a fatal flaw: they are fixed in size. If you create an array to hold 10 elements, it cannot hold an 11th. In real-world applications, you rarely know exactly how much data you'll be processing.

The Java Collection Framework (JCF) is a unified architecture that provides dynamic data structures and algorithms to store and manipulate groups of objects.

At the very top of this family tree is the Iterable interface, followed by the Collection interface. From Collection, the framework splits into three main branches: List, Set, and Queue. (Note: Map is also part of the framework but sits in its own separate hierarchy because it deals with key-value pairs, not single elements).

Today, we are starting with the most popular branch: The List Interface, and its superstar implementation, the ArrayList.

Key Characteristics of a List:

Ordered: It maintains the insertion order. The first item you put in is the first item in the list.

Index-based: Just like standard arrays, you can access elements using a zero-based index.

Allows Duplicates: You can store the exact same value multiple times.