# Vinothkumar
Problems for Screening Round

**Language:** Java

## 1. Program_1

1. Imported the Scanner class
    I used java.util.Scanner so I can take input from the user through the console.

2. Asked the user to input two numbers
    The user is asked to enter two double values.

3. Asked for the operation name
    The user then needs to type the operation they want to perform. I gave them four options to choose from:

    add

    subtract

    multiply

    divide

4. I wrote a method called calculate
    Inside this method, I used a switch statement to check which operation the user entered. Based on that:

    If it's add, it prints the sum.

    If it's subtract, it prints the difference.

    If it's multiply, it prints the product.

    If it's divide, I added a check to make sure the second number is not zero (to avoid division by zero error). If it's valid, it prints the result of the division.

5. I handled invalid operations
    If the user enters something other than the four valid operations, the program shows an "Invalid operation" message.

---

## 2. Program_2


1. Imported the Scanner class
    I used java.util.Scanner to take input from the user through the console.

2. Asked the user to input a number
    The user is prompted to enter an integer value which determines how many numbers to generate in the series.

3. Created a method called generateSeries
    This method takes the user input and generates a series of odd numbers starting from 1.

4. Used a loop to generate the series

    I used a for loop that runs userInput times.

    On each iteration, it prints the current odd number.

5. I used a variable number initialized to 1 and added 2 to it in every iteration to get the next odd number.

6. Formatted the output
    I printed the numbers separated by commas, without a trailing comma at the end of the series.

---

## 3. Program_3

1. Imported the Scanner class
    I used java.util.Scanner to take input from the user via the console.

2. Asked the user to input a number
    The user is asked to enter an integer value.

3. Created a method called generateConditionalSeries
    This method generates a series of odd numbers, but with a condition based on the user input.

4. Set the number of values to generate
    If the input number is even, I subtract 1 to make it odd (so the series length is odd).
    If the input number is odd, I use it as-is.

5. This ensures the series length is always an odd number.

6. Generated the series of odd numbers
    I used a for loop to print count odd numbers starting from 1, incrementing by 2 each time.

7. Formatted the output
    The numbers are printed separated by commas, without a trailing comma at the end.

---

## 4. Program_4

1. Imported the Scanner class
    I used java.util.Scanner to take input from the user through the console.

2. Asked the user to input numbers separated by spaces
    The user is prompted to enter multiple integers separated by spaces.

3. Split the input string and converted to an integer array

    I split the input string based on spaces using split("\\s+").

4. Then, I converted each part into an integer and stored them in an int array.

5. Created an array to count multiples for numbers 1 to 9
    I initialized an integer array count of size 9, where each index represents counts of numbers divisible by 1 through 9.

6. Counted how many numbers are divisible by each number from 1 to 9
    For each input number, I checked divisibility by every integer from 1 to 9.

    If the number is divisible by i, I incremented the corresponding count at count[i-1].

7. Printed the result in a formatted way
    I printed the counts in the format {1=count1, 2=count2, ..., 9=count9} showing how many numbers are divisible by each integer from 1 to 9.
