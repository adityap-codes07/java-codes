**Number Guessing Game (Java Edition)**
->Summary
This is a traditional command-line Number Guessing Game written in Java. The application picks a random integer within an interval supplied by the user, and the player has seven attempts to find out the number.

It is a great, low-key project to demonstrate fundamental Java principles, such as:

Employing the Scanner class for solid user input.

How to implement the Random class in order to make random integers.

Using while loops and conditional statements (if/else if/else) for the flow of the game and offering hints.

**Requirements**
To build and run this Java program, you will need to have the following installed:

Java Development Kit (JDK): Version 8 or later.

**Getting Started**
These steps will guide you through compiling and running the game from your command line.

1. Save the Code
Save the following Java code into a file called GuessingGame.java.

2. Compile the Program
Open your command line or terminal and go to the directory where you downloaded the file. Compile the Java code (javac):

->Bash
javac GuessingGame.java
3. Run the Game
Run the compiled class file with the Java Runtime Environment (java):

**Bash**
java GuessingGame
->How to Play
The application will first ask you to define the lower and upper limits of the range for guessing (e.g., 1 and 100).
You will be told that you have 7 opportunities to discover the hidden number.
Following each guess, the game will give you a tip: "Too high" or "Too low".
The game will terminate upon correct guessing or when you exhaust all attempts.

**Code Structure (For Developers)**
The main logic is in the main method of the GuessingGame class:

->Initialization: The Scanner and Random instances are created. The random num is then produced using the formula random.nextInt(high - low + 1) + low to make the range inclusive.

->Loop: A while (guessesMade < chances) loop manages the 7 attempts.

->Exit Condition: The break keyword is employed to directly return from the loop after a successful guess, and a boolean flag (guessedCorrectly) controls the ultimate game message.

**Contribution**
Contributions, ideas, and feature requests are welcome! Fork the repository and open a Pull Request.
