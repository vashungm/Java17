## Regular Expression

## 42. ABCs of Regex: I

1. matches
```java
"cat".matches("cat"); // true
"Cat".toLowerCase().matches("cat");//true
or
"Cat".matches("[cC]at"); //true

"Cat".matches("[cCbB]at")//true
// you can put any character you want to match in the []

"Cat".matches("[a-f]at") // true

//character ranges
"Cat".matches("[a-fA-Fw-zW-Z]at");

//not starting with b (char)". Any char is fine, except c but single char is expected.
"-at".matches("[^c]at")// true
"flat".matches("[^c]at") //false

//multiple char
"Flat".mathces("[^a-z]at")//true
"flat".matches("[^a-z]at") //false
```

2. Number | digit matches
```java
"123-123-1234".matches("\\d{3}-\\d{3}-\\d{4}"); //true

```