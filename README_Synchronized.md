# 🎯 Number Guessing Game (Java Edition)

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)](LICENSE)
[![GitHub stars](https://img.shields.io/github/stars/adityap-codes07/Number-Guessing-Game?style=for-the-badge)](https://github.com/adityap-codes07/Number-Guessing-Game/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/adityap-codes07/Number-Guessing-Game?style=for-the-badge)](https://github.com/adityap-codes07/Number-Guessing-Game/network/members)

---

## 📝 Overview

The **Number Guessing Game** is a classic command-line game written in **Java**.  
The program randomly picks a number in a range defined by the player, who then has **7 chances** to guess it.  

This project demonstrates **core Java concepts**:

- ✅ **Scanner** class for input handling  
- 🎲 **Random** class for generating numbers  
- 🔁 **While loops** and **if/else** for game logic  
- 💡 Dynamic hints: "Too high" or "Too low"

---

## ⚙️ Requirements

- **Java Development Kit (JDK) v8+**  
  [Download JDK](https://www.oracle.com/java/technologies/downloads/)

---

## 🚀 Getting Started

### 1️⃣ Save the Code
Save the following Java code as:

```text
GuessingGame.java
2️⃣ Compile the Program
bash
Copy code
javac GuessingGame.java
3️⃣ Run the Game
bash
Copy code
java GuessingGame
🎮 How to Play
Set lower and upper bounds for the random number.

You have 7 attempts to guess it.

After each guess, the game provides hints:

"Too high" → Guess is greater than the number

"Too low" → Guess is less than the number

Game ends when:

✅ Correct guess

❌ All attempts used

💡 Tip: Use hints strategically to zero in on the number!

🏗️ Code Structure
1️⃣ Initialization
java
Copy code
Scanner sc = new Scanner(System.in);
Random random = new Random();
int secretNumber = random.nextInt(high - low + 1) + low;
Creates Scanner and Random objects

Generates a random number within the inclusive range

2️⃣ Game Loop
java
Copy code
while (guessesMade < 7) { ... }
Handles 7 attempts

Provides hints after each guess

3️⃣ Exit Condition
break exits the loop on correct guess

Boolean guessedCorrectly controls final message

🤝 Contribution
Love this project? Contribute to it!

Fork the repository

Make your changes

Open a Pull Request

Let’s make the game even more interactive! 🚀

---
