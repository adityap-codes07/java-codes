# 🖨️ Java Thread Synchronization Example

This project demonstrates **thread synchronization** in Java using **synchronized blocks** to prevent concurrent access issues when multiple threads use a shared resource.

---

## 📌 Overview

This program simulates a **printer** being used by multiple threads simultaneously.  
Without proper synchronization, the output can get **mixed**, leading to race conditions.

### Classes in the Program

1. **`Printer`**  
   - Contains the method `printDoc(String doc)`  
   - Uses a **synchronized block** (`synchronized(this)`) to ensure only one thread prints at a time.

2. **`ThreadA` & `ThreadB`**  
   - Extend the `Thread` class  
   - Each calls `printDoc` on the shared `Printer` object.

3. **`SyncBlock`**  
   - Main class  
   - Creates the `Printer` object and starts both threads.

---

## ⚙️ How It Works

1. A single `Printer` object is shared between threads.  
2. Each thread attempts to print its document.  
3. The `synchronized` block ensures **one thread at a time** executes the print loop.  
4. Pages within each document remain sequential, but documents can appear in any order depending on which thread acquires the lock first.

---
