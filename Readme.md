Project SOLID Principles Guide
Welcome to my project! In this README, the code shows the right's and wrong's on implementing a code that respects the SOLID principles.

Here are the SOLID principles:

## Table of Contents
1. Single Responsibility Principle (SRP)

Right:
   * A class should have one responsibility.
   * Encapsulate related behavior within a single class.
   * Example: UserService handles user authentication only.
   
   
Wrong:
   * Combining unrelated responsibilities in a class.

2. Open/Closed Principle (OCP)
   
    Right:
   * Software entities should be open for extension but closed for modification.
   * Add new behavior without changing existing code.
   * Use interfaces or abstract classes for extension points.

   Wrong:
      * Modifying existing code directly.
      * Violating the existing contract.
   
3. Liskov Substitution Principle (LSP)
   Right:
   * Subtypes (derived classes) must be substitutable for their base types.
   * Maintain the contract defined by the base class.

   Wrong:
   * Breaking the contract of the base class.
   
4. Interface Segregation Principle (ISP)
   Right:
   * Clients should not be forced to depend on interfaces they don’t use.
   * Split large interfaces into smaller, more specific ones.

   Wrong:
   * Creating monolithic interfaces.
   * Implementing unnecessary methods.

5. Dependency Inversion Principle (DIP)
   Right:
   * High-level modules should not depend on low-level modules.
   * Both should depend on abstractions.
   * Use interfaces or abstract classes to decouple.

   Wrong:
   * Direct coupling between high-level and low-level modules.


## Observations
The code is written in Java, but the principles apply to any object-oriented language and in the code examples, I will show you how to apply them. 
Hope you enjoy it!