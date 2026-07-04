# Java-OOP-Inheritance-Hierarchies-abstract-design
This repository is a foundational Java Object-Oriented Programming (OOP) project designed to demonstrate core principles like inheritance, abstract design, encapsulation, and polymorphism providing clear examples of how structured class hierarchies can be implemented in Java.
Key Concepts Covered
Inheritance Hierarchies: Extending base classes into specialized subclasses to maximize code reuse.

Polymorphism in Action: Using superclass references to dynamically execute subclass behaviors at runtime.

Abstract Design: Leveraging abstract classes and methods to enforce consistent logic across subclasses.

Domain Modeling: Breaking down real-world systems into cleanly separated logical entities.
Featured Modules
Banking System Module

BankAccount.java: Base class managing balance and transactions.

SavingsAccount.java: Specialized account with interest logic.

CheckingAccount.java: Transactional account with overdraft and fee rules.

UsingAccount.java: Driver program showcasing polymorphic account operations.
Core Classes
Appliance (abstract)

Base class containing universal attributes like powerRating and usageHours.

Declares abstract methods calculateEnergy() and operate() to be implemented by subclasses.

Refrigerator

Specialized subclass with temperature attribute.

Implements custom energy calculation logic based on cooling levels.

Defines operate() as "Cooling food...".

WashingMachine

Specialized subclass with loadCapacity attribute.

Implements energy calculation logic based on load size.

Defines operate() as "Washing clothes...".

ApplianceRun (driver program)

Contains the main() method.

Demonstrates polymorphism by creating objects of Refrigerator and WashingMachine through Appliance references.

Executes displayState(), calculateEnergy(), and operate() for each appliance.
