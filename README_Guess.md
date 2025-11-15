# 🎯 Number Guessing Game (Java Edition)

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)](LICENSE)
[![Stars](https://img.shields.io/github/stars/adityap-codes07/Number-Guessing-Game?style=for-the-badge)](https://github.com/adityap-codes07/Number-Guessing-Game/stargazers)

---

## 📝 Overview

Welcome to the **Number Guessing Game**, a **fun and interactive command-line Java project**!  

The game picks a **random number** within a user-defined range, and you have **7 attempts** to guess it correctly.  

This project demonstrates fundamental Java concepts such as:

- ✅ **Scanner class** for user input  
- 🎲 **Random class** for generating numbers  
- 🔁 **Loops and conditional statements** for game flow  
- 💡 **Hints** like "Too high" or "Too low"

---

## ⚙️ Requirements

- **Java Development Kit (JDK) v8+**  
  [Download JDK](https://www.oracle.com/java/technologies/downloads/)

---

## 🚀 Getting Started

### 1️⃣ Save the Code
Save the Java code into `GuessingGame.java`.

### 2️⃣ Compile the Program
```bash
javac GuessingGame.java
3️⃣ Run the Game
bash
Copy code
java GuessingGame
🎮 How to Play
Define lower and upper limits of the guessing range (e.g., 1 to 100)

You have 7 attempts to guess the number

After each guess, the game gives a hint:

"Too high" → Your guess is greater than the number

"Too low" → Your guess is less than the number

The game ends when:

✅ You guess correctly

❌ Or you exhaust all attempts

Tip: Use the hints to narrow down the range and guess strategically!

🏗️ Code Structure
Initialization
java
Copy code
Scanner sc = new Scanner(System.in);
Random random = new Random();
int secretNumber = random.nextInt(high - low + 1) + low;
Creates Scanner and Random instances

Generates a random number in the inclusive range

Game Loop
java
Copy code
while (guessesMade < 7) { ... }
Handles 7 attempts

Checks input and provides hints

Exit Condition
Break exits the loop after a correct guess

Boolean guessedCorrectly controls the final message

🖼️ Sample Output
<div align="center"> <img src="https://user-images.githubusercontent.com/your-username/guessing-game-screenshot.png" alt="Game Output Screenshot" width="500"/> </div>
java
Copy code
Enter lower bound: 1
Enter upper bound: 50
Guess the number (7 attempts): 25
Too low!
Guess the number (7 attempts): 40
Too high!
...
Each run may produce a different secret number!

🌈 Contribution
Love this project? Contributions are welcome!

Fork the repository

Make your changes

Submit a Pull Request

Let’s make this game even more interactive! 🚀


