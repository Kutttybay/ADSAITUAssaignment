# ADSAITUAssaignment
# Kuttybaev Daulet SE-2216 
# Assaignment 1 
<br/>
<br/>

# Some Information
<hr/>
This is assaignment from "Algorithm and Data Structure" AITU. <br/>
All task have a "Problem" function <br/>
This function can output and input, call the other functions <br/>
All task have created java classes , and main call all this task beetwen 1 - 10 <br/>
<hr/>
<br/>
<br/>

# Task 1 
<hr/>
Find minimun of numbers 
<br/>

``` Java
public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
```
<br/>

1. Initialization of a new variable that will be equal to 1 array number
2. Loop through all elements of an array using a for loop
3. with "if" functions if conditions are met. If the conditions are met, then "min" takes the value of the numbering of the array on which the array was executed.
4. Finally, return the value of "min" as the output of the method.
<hr/>
<br/>
<br/>

# Task 2
<hr/>
Find average of the number
<br/>

``` Java
public static double getAverage(int[] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
```
<br/>
1. Initialization of the "sum" variable, which is equal to 0.<br/>
2. With a "for" loop, iterate through all the masima loops, and add "Sum" to the variable. <br/>
3. The return of the method is "sum / arr.length" , the sum divided by the length of the array. <br/>
<hr/>
<br/>

# Task 3 
<hr/>
Prime number checker
<br/>

``` Java
public boolean is_Prime(int n, int div){
        if (n <= 2){
            return n == 2;
        }
        if (div * div > n){
            return true;
        }
        if (n % div == 0){
            return false;
        }
        return is_Prime(n , div + 1);
    }
```

<br/>
1. Create a "boolean" method where "int n, int div" is initialized. <br/>
2. The value will pass through 3 "if" , but if one condition is met, then the method will return a certain thing. <br/>
3. If none of the conditions is met, then recursion will occur here and the method will call itself. <br/>
4. After that, then one of the conditions will be fulfilled and it will be the answer of the method. <br/>
<hr/>
<br/>

# Task 4 

<hr/>
Factorial with using recursion

``` Java
public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
```

<br/>
1. The method accepts an initialized number <br/>
2. There are two functions in the method: "if" and "else" . <br/>
3. If the condition in "if" is not met, then the code continues <br/>
4. In "else" , the recursion starts and the code will continue until it returns an answer. <br/>
<hr/>
<br/>

# Task 5

<hr/>
Fibonacci sequence using recursion.

``` Java
public int fibonacci(int n){
        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
```

<br/>
1. Initialize the "n" parameter, and start passing all conditions. <br/>
2. if the parameter is 0 , then 1 condition is met and the method returns 0. <br/>
3. if the parameter is 1, then 2 conditions are met and the method returns 1 <br/>
4. if none of these conditions is met, then the "else" function is executed, and the answer is subtracted by the formula recursion method. <br/>
<hr/>
<br/>

# Task 6
<hr/>
Finding Power of number with recursion

``` Java
public double power(double a, int n){
        if (n == 0){
            return 1;
        }
        else if(n < 0){
            return 1 / power(a, -n);
        }
        else if(n % 2 == 0){
            double halfpower = power(a, n/2 );
            return halfpower * halfpower;
        }
        else {
            return a * power(a, n-1);
        }
    }
```

<br/>
1. This code defines a recursive function power that takes a base a and an integer exponent n, and computes a raised to the power of n <br/>
2. There are 3 "if" conditions, all of them are made in the form of mathematical calculations, if someone's conditions are met, then the method will return the value that is inside this condition <br/>
3. If none of the conditions is met, then the method will stop at "else" and recursively will be executed until the calculation is over. And after the end, what the method will return will be the answer. <br/>
<hr/>
<br/>

# Task 7
<hr/>
returns given array in reverse order (without using array data structure)

``` Java
public int reversedNumbers(int n, int[] arr){
        if (n == 0){
            return arr[0];
        }
        else{
            System.out.print(arr[n-1] + " ");
            return reversedNumbers(n-1, arr);
        }
    }
```

<br/>
1. The method accepts two values in the seed: "n" and "arr[]". <br/>
2. If "n = 0" then the code will return the value 0, since the array is empty. <br/>
3. If the condition is not met, then the "else" function works, and The function continues to call itself recursively with "n" decremented by one until "n" equals zero, at which point the function returns the first element of the array.<br/>
4. After the method returns an array <br/>
<hr/>
<br/>

# Task 8
<hr/>
Checking String for digits

``` Java
  public boolean isAllDigits(String a){
        if (a == null || a.isEmpty()){
            return false;
        }
        for (char c : a.toCharArray()){
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
```

<br/>
1. method takes a String input a and returns a boolean value. <br/>
2. If a is null or empty, the method returns false. <br/>
3. The method enters a loop that iterates over each character in the string a. <br/>
4. For each character, the code checks if it is a digit using the Character.isDigit() method. <br/>
5. If the character is not a digit, the method returns false. <br/>
6. If the loop completes without finding any non-digit characters, the method returns true. <br/>
<hr/>

<br/>

# Task 9
<hr/>

Binominal Coefficient 

``` Java
public int findBinomialCoefficient(int n, int k){
        if (k == 0 || n == k){
            return 1;
        }
        else {
            return findBinomialCoefficient(n-1,k-1) + findBinomialCoefficient(n-1,k);
        }
    }
```

<br/>
1."n" and "k" get into the method <br/>
2. If k is 0 or n is equal to k, return 1. <br/>
3. Otherwise, calculate "n-1 choose k-1" and "n-1 choose k", and add them together. <br/>
4. The final result is the sum of the two recursive calls. <br/>
<hr/>
<br/>

# Task 10 
<hr/>
GCD(a, b) with Eucladian Alghorithm 

``` Java
public int findGCD(int a, int b){
        if (b == 0){
            return a;
        }
        else {
            return findGCD(b, a % b);
        }
    }
```
<br/>
1. The method starts by checking if the value of "b" is zero. If it is, then the method simply returns the value of "a" because the GCD of "a" and "0" is "a". <br/>
2. If "b" is not zero, the method recursively calls itself with the arguments "b" and "a % b". <br/>
3. The recursion continues until "b" becomes zero. At this point, the method returns the value of "a" which is the GCD of the original "a" and "b" values.<br/>
<hr/>
<br/>
<br/>

# Thanks For watching 
# The End





