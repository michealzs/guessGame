
# Political Guess Game (Java)

A simple **Java console application** that guesses your political affiliation based on your responses to three questions. Your responses are saved in CSV files for each political party.

---

## 🎯 Features

✅ Asks three political questions  
✅ Guesses your political party based on predefined logic  
✅ Saves your answers in a CSV file by party  
✅ Uses Java core libraries (no external dependencies)  
✅ Fun interactive console UI with a simple pattern matcher  

---

## 🏗️ Setup

### Prerequisites

- Java 8+ installed on your system
- A terminal/command prompt to run the program

### How to Run

1. Compile the Java file:

```bash
javac Main.java
```

2. Run the program:

```bash
java Main
```

3. Follow the prompts and answer **Yes** or **No** to each question.

---

## 📝 Questions Asked

1. Do you believe in a limited government?  
2. Do you think the government should work on eradicating inequality?  
3. Do you believe in strong national defense and maintaining a powerful military?

Based on your responses, the program will make a guess and store your answers in one of the following CSV files:

- `Republican.csv`
- `Democrat.csv`
- `Green.csv`
- `Independent.csv`

---

## 📂 CSV Format

Each entry is stored in the corresponding CSV file as a JSON-like object:

```json
{ "Name" : "John Doe", "Limit Government" : "yes", "Eradicate Inequality" : "yes", "Powerful military" : "yes" },
```

---

## ⚠️ Notes

- The game expects answers in **yes** or **no** (case-sensitive).  
- If answers don't match predefined logic, it defaults to "Independent".  
- The game saves your final answers based on your **actual** political affiliation choice at the end.

---

## 📄 License

This project is open-source and licensed under the MIT License.

