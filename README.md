# 📘 Study Tracker

![Java](https://img.shields.io/badge/Java-8%2B-blue)
![Platform](https://img.shields.io/badge/Platform-Windows%20%7C%20Linux-lightgrey)


---

**Study Tracker** is a **Java-based console application** that helps students systematically **log, track, and analyze study sessions**.
It enables you to record daily study activities, generate summaries, and export logs to a CSV file for future reference.

This project demonstrates **object-oriented programming (OOP)**, **Java collections**, and **file handling**.

---

## ✨ Features

* 📅 **Insert Study Log** → Record study sessions with subject, duration, and description.
* 📖 **View Logs** → Display all recorded logs in a structured format.
* ⏳ **Summary by Date** → Track total study duration per date.
* 📚 **Summary by Subject** → Track total study duration per subject.
* 📂 **Export to CSV** → Save all study logs in `MarvellousStudy.csv`.
* 🖥️ **User-Friendly Menu** → Console-based shell for interaction.

---

## 🛠️ Technologies Used

* **Language:** Java (JDK 8 or later)
* **Core Libraries:**

  * `java.time.LocalDate` → Date handling
  * `java.util.*` → Collections (`ArrayList`, `TreeMap`)
  * `java.io.*` → File operations (CSV export)

---

## 📂 Project Structure

```
StudyTracker/
│── program557.java       # Entry point (main program)
│── StudyLog.java         # Represents individual study records
│── StudyTracker.java     # Manages logs, summaries, export
│── MarvellousStudy.csv   # Auto-generated CSV file
│── README.md             # Documentation
│── Screenshots/          # Suggested screenshots for demo
```

---

## ▶️ Installation & Running

1. Clone or download the repository.
2. Open a terminal in the project directory.
3. Compile the program:

   ```bash
   javac program557.java
   ```
4. Run the program:

   ```bash
   java program557
   ```

---

## 📌 Application Menu

```
1 : Insert New Study log into Database
2 : View all Study logs
3 : Summary of Study log by Date
4 : Summary of Study log by Subject
5 : Export Study Log to CSV file
6 : Exit the application
```

---

## 📝 Example Usage

**Insert Log**

```
Please Enter the Name of Subject like C/C++/Java/OS/DS
Java
Enter the time period of your Study in hours
2
Please provide the Description about the Study for Future reference
Practiced OOP concepts
Study log gets stored Successfully
```

**Display Logs**

```
2025-09-18 | Java | 2.0 | Practiced OOP concepts
```

**Summary by Date**

```
Date : 2025-09-18 Total Study : 5.0
Date : 2025-09-19 Total Study : 3.0
```

**Summary by Subject**

```
Subject : Java Total Study : 4.0
Subject : OS Total Study : 3.0
```

**Export CSV**

```
Log Created Successfully!!
```

**Sample `MarvellousStudy.csv`**

```csv
Date , Subject , Duration , Description
2025-09-18, Java, 2.0, Practiced OOP concepts
2025-09-19, OS, 3.0, Revised process scheduling
```

---

## ✅ Test Cases

| Function Name          | Function Description                                            | Expected Output                                                         | 
| ---------------------- | --------------------------------------------------------------- | ----------------------------------------------------------------------- | 
| **InsertLog()**        | Inserts a new study log with subject, duration, and description | `"Study log gets stored Successfully"`                                  |
| **DisplayLog()**       | Displays all study logs stored in the database                  | Shows logs in format: \`Date                                            | 
| **SummaryByDate()**    | Provides a summary of total study hours grouped by date         | `Date : 2025-09-18  Total Study : 5.0`                                  | 
| **SummaryBySubject()** | Provides a summary of total study hours grouped by subject      | `Subject : Java  Total Study : 4.0`                                     | 
| **ExportCSV()**        | Exports all logs into a CSV file                                | Creates `MarvellousStudy.csv`                                           |
| **Exit (main)**        | Terminates the application                                      | Program ends with exit message                                          | 

---

## 📸 Screenshots

1. **Main Menu** – Program startup
2. **Insert Log** – Adding a study log
3. **Display Logs** – Showing stored logs
4. **Summary by Date** – Aggregated logs by date
5. **Summary by Subject** – Aggregated logs by subject
6. **Export Success** – Message after CSV export
7. **CSV Preview** – Opened in Excel/Notepad

---

## 👨‍💻 Author

**Shreyas Prakash Thorat**
Developed as a console-based application to practice **Java programming, OOP, collections, and file handling**.

