# Quantum Bookstore

A simple object-oriented Java application simulating an online bookstore. This project was built for **Fawry N² Dev Slope #10 - Challenge #1**.

## 🛒 Overview

The **Quantum Bookstore** manages different types of books and supports operations like adding to inventory, removing outdated books, and handling purchases.

## 📚 Book Types

The bookstore supports the following book types:

- **Paper Book**
  - Has limited stock
  - Can be shipped to a physical address
- **EBook**
  - Has a file type (e.g., PDF)
  - Can be sent via email
- **Demo Book**
  - For display only, not for sale

Each book has:
- ISBN
- Title
- Author name
- Publication year
- Price

## ✨ Features

- Add new books to the inventory.
- Remove outdated books based on the number of years since publication.
- Purchase a book by ISBN, quantity, email, and delivery address:
  - Stock is updated after a purchase.
  - Paper books are passed to the `ShippingService`.
  - EBooks are passed to the `MailService`.
  - Demo books cannot be purchased.
- All console messages are prefixed with **"Quantum book store"** for consistency.
- System is designed to be extensible. Adding a new type of book does not require modifying existing logic.

## 🧪 Testing

The class `QuantumBookstoreFullTest` demonstrates all system features:
- Adding different types of books.
- Removing books older than a defined threshold.
- Purchasing both paper and electronic books.
- Handling errors like out-of-stock or unavailable books
