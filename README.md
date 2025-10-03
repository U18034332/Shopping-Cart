# Shopping Cart Implementation

## Overview
This project demonstrates a basic e-commerce shopping cart implementation with a focus on **readability**, **maintainability**, **correctness**, and **efficiency**.  
The code allows adding items to a cart and calculating the total price while following good software engineering practices.

---

## Improvements Made

### 1. Encapsulation: Dedicated Domain Model
- **Item class** encapsulates product details such as `name`, `price`, and `quantity`.
- **Cart class** manages a collection of `Item` objects and is responsible for total calculations.
- This separation of concerns makes the code easier to maintain and test.

### 2. Correctness: Financial Accuracy
- Replaced `double` with **BigDecimal** to handle monetary values safely and avoid floating-point inaccuracies.
- Ensures calculations such as totals and discounts remain consistent.

### 3. Readability: Simplified Code
- Removed fragile string manipulation and type casting.
- Clearer method signatures and structured control flow improve understanding.

### 4. Maintainability: Business Logic in Domain Classes
- The **Controller** is now lightweight, delegating responsibilities to `Cart` and `Item`.
- Business logic resides in domain classes, improving cohesion and enabling better unit testing.

### 5. Efficiency: Streamlined Operations
- Simplified cart creation and item updates with straightforward control structures.
- Avoided unnecessary complexity (e.g., no lambdas or overuse of streams).

---

## Implementation Choices

1. **Encapsulated Domain Model**
   - `Item` holds product details.
   - `Cart` manages items and calculates totals.

2. **Precise Data Types**
   - `BigDecimal` is used for all monetary calculations.

3. **Clean Controller**
   - Controller delegates responsibilities to `Cart`, reducing complexity.

4. **Safe Imports**
   - No wildcard imports (`*`).
   - Only essential classes are imported to prevent namespace pollution.


