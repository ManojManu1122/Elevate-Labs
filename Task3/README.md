# 📚 Library Management System (CLI)

A simple command-line based Library Management System implemented in Java using Object-Oriented Programming (OOP) principles. This system allows users to view available books, issue books, and return books through a menu-driven interface.

---

## ✅ Features

- Add Books and Users to the system  
- View all books with availability status  
- Issue a book (mark as issued)  
- Return a book (mark as available)  
- Menu-driven interaction  
- Demonstrates clean OOP structure with multiple classes  

---

## 🛠️ Tools Used

- Java  
- VS Code or any Java IDE  
- Terminal/Command Prompt  

---

## 📂 Project Structure

- LibrarySystem/
- ├── Book.java # Book class with book details and status
- ├── User.java # User class to represent users
- ├── Library.java # Manages books and users, handles logic
- └── Main.java # Contains menu, handles user interaction

## Example Usage

- ==== Library Management System ====
- 1. View Books
- 2. Issue Book
- 3. Return Book
- 4. Exit
- Enter your choice: 1

- ID: 1, Title: The Alchemist, Status: Available
- ID: 2, Title: Java Programming, Status: Available

- ==== Library Management System ====
- Enter your choice: 2
- Enter Book ID to Issue: 1
- Book issued successfully.

- ==== Library Management System ====
- Enter your choice: 1
- ID: 1, Title: The Alchemist, Status: Issued
- ID: 2, Title: Java Programming, Status: Available
