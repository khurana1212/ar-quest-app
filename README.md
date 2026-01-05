
# AR Quest App – Review 2 Submission

## Project Overview
AR Quest App is a campus-based Augmented Reality learning system where students unlock quests only after reaching specific campus locations.
Each quest includes learning material and assignments with Ordinary, Difficult, and Extra Difficult levels.
Completion awards badges and points.

This submission strictly follows MVC architecture and implements JDBC transaction management as per Review 2 feedback.

---

## Architecture (Strict MVC)
Controller (Servlet)
↓
Service (Business Logic + Transactions)
↓
DAO (Pure Database Operations)
↓
MySQL Database

Servlets DO NOT contain business logic or SQL.

---

## Core Features Implemented
- Quest unlocking and completion
- Badge and score awarding
- Duplicate quest prevention (innovation)
- Transaction-safe quest completion (commit/rollback)
- Admin & Student separation
- Input validation (client + server)
- Robust error handling

---

## JDBC Transaction Management (Key Improvement)
Quest completion is atomic:
- Progress update
- Badge award
- Score update

If any step fails → rollback ensures data consistency.

---

## Innovation / Extra Effort
- Duplicate quest completion lock
- Cheating prevention stub (timestamp & duplicate attempt detection)
- Centralized transaction-based service layer

---

## How to Run
1. Import project into IntelliJ / Eclipse
2. Configure MySQL credentials in DBConnection.java
3. Deploy on Apache Tomcat
4. Access via browser

---

## Testing
- Invalid inputs tested
- Duplicate submissions blocked
- DB failure handled with rollback
- Application does not crash

---

## Review 2 Compliance
✔ Servlet Implementation  
✔ Code Quality & Execution  
✔ Innovation / Extra Effort  
✔ Documentation  

