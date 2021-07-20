# OOPs-using-Java

## q1
You have been assigning a task to develop a software to keep track of customer for a restaurant, menu detail of the restaurant. For auditing purpose you also want to keep record of the order history of customer and total sale of the restaurant.

## q2 

Design of Spindle Speeds of Machine Tools:

The rotational speed, that is, revolution per minute, of spindles of machine tools such as drilling machines or a lathe is designed in geometric progression. Let us assume S1, is the minimum speed, S2 the maximum speed, and n is the number of speeds. The ratio of any two consecutive speeds is the constant geometric ratio R. Thus the n speeds may be written as:

<img src="https://github.com/subhankar01/OOPs-using-Java/blob/main/repo%20images/q2.PNG" width=1000, height=500>

In program, the user has to enter the values of s1=minspeed, s2=maxspeed, and n. The user may make a mistake while entering the values; for example, user may enter zero or less than zero for s1 or s2 or may enter n=1 or less than one. The program takes care of these by throwing appropriate exception. Since the exception are the programmer’s exception, we define the class MyException that extends the standard exception class and defines the exception.
