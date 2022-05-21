# Java17
Learning Java 17 and Development




## Basic 
### Class

### 12. ArrayDemo
Passing arguments  


#### Run Java Progam

```shell
$ javac <program-name>
``` 
This will create a class  

```shell
$ java <class-name> 
```  

## 13. Methods

In java, all code lives inside of a class. Its a function apart of the class. In java, methods cannot live alone. They are to placed inside class. they are now called `methods`.


## 14. Varargs
Always takes input as an array of strings as args. 


##  15. Static Methods

```java
Person p = new Person()
```
Create instance of a class to access the methods. 

1. Making a static -> to create methods to build that method even without having instance of a class. 

2. In java, default starting point of class is public and static. Entry point or starting point of a class.

3. Memory management
4. Grouping class together
5. used to access primitive member of the enclosing class through the object reference.

### 16. Static variable


### 17. Static Initializer


```java
public static int [];
...
static {
    nums = new int[5];
    nums[0] = 3;
    .
    .
    .
}
```
### 18. The Object SuperClass

Overriding a class
```java
public class cat extends Pet{
    ...
    @override
    //ctrl + 0
    public String toString(){
        return "Cat :" + " name;
}

```
All class extends from parent class, If it doesn't extends from any other parent class, it extends from `Object class`.

`Object class` is the parent class. `toString` is one fo the methods of `Object class`.

### 19. Member visibility : Methods

```public, private, protected```
Only Public member of a class is accessible by other classs.

### 20. Member visibility: Fields


### 21. Constructor
### 22. Getter and Setter
