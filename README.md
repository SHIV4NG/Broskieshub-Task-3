# Employee Sorting Program

## What I Built
This is a **Java program** that manages a list of employees and allows sorting them by **salary** (descending) or **name** (alphabetical). Each employee has a name, age, and salary.

## Why I Built It
The goal was to practice **object-oriented programming**, **collections**, and **custom sorting using comparators** in Java. It demonstrates how to handle user input, store objects in a list, and sort them using different criteria.

## How I Built It
- Created an `Employee` class with `name`, `age`, and `salary` fields.  
- Implemented two comparator classes:
  - `SalaryComparator` for sorting employees by salary (highest first).  
  - `NameComparator` for sorting employees alphabetically by name.  
- Used `ArrayList` to store employee objects.  
- Read employee details from the user using `Scanner`.  
- Displayed the original list, sorted by salary, and sorted by name using `Collections.sort()`.
