# OOPs-using-Java

## q1 : [restaurant.java](https://github.com/subhankar01/OOPs-using-Java/blob/main/restaurant.java)
You have been assigning a task to develop a software to keep track of customer for a restaurant, menu detail of the restaurant. For auditing purpose you also want to keep record of the order history of customer and total sale of the restaurant.

## q2 : [spindle.java](https://github.com/subhankar01/OOPs-using-Java/blob/main/spindle.java)

Design of Spindle Speeds of Machine Tools:

The rotational speed, that is, revolution per minute, of spindles of machine tools such as drilling machines or a lathe is designed in geometric progression. Let us assume S1, is the minimum speed, S2 the maximum speed, and n is the number of speeds. The ratio of any two consecutive speeds is the constant geometric ratio R. Thus the n speeds may be written as:

<img src="https://github.com/subhankar01/OOPs-using-Java/blob/main/repo%20images/q2.PNG" width=1000, height=500>

In program, the user has to enter the values of s1=minspeed, s2=maxspeed, and n. The user may make a mistake while entering the values; for example, user may enter zero or less than zero for s1 or s2 or may enter n=1 or less than one. The program takes care of these by throwing appropriate exception. Since the exception are the programmer’s exception, we define the class MyException that extends the standard exception class and defines the exception.

## q3 : [book_isbn.java](https://github.com/subhankar01/OOPs-using-Java/blob/main/book_isbn.java)

Design a class called ISBN to represent an International Standard Book Number, or ISBN for short.
The ISBN consists of 10 digits divided into 4 parts. For example, the ISBN 0 941831 39 6 represents the
following information:
The first part: The first digit "0" signifies the book is from an English-speaking country.
The second part: "941831" identifies the publisher.
The third part: "39" is the title number for the book.
The fourth part: "6" is a check digit to indicate that the sum of the ISBN digits is 10.
The class should have a constructor and methods to set and get the ISBN as a string.
Design a Book class that represents relevant information about a book, including the book's title, author,
publisher, city and date of publication, and price. The class should also include the field ISBN isbnNum;
where ISBN is the class defined above.
This class should include a constructor and the following methods:
- setBookISBN: to set the ISBN for the book.
- getAuthor: to return the author of the book.
- getBookISBN: to get the ISBN of the book.
- printDetails: to print the information of a book in the following form:
```
Book Title: Object First with Java
Book Author: David j. Barnes and Michael Kolling
Publisher: Prentice Hall
ISBN: 0 941831 39 6
```
