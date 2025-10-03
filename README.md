# Shopping Cart Implementation

## Overview
This project demonstrates a basic e-commerce shopping cart implementation with a focus on **readability**, **maintainability**, **correctness**, and **efficiency**.  
The code allows adding items to a cart and calculating the total price while following good software engineering practices.

---

## Outline of Approach
1. **Identify Issues in Original Code**
   - Mixing business logic with controller logic.
   - Use of `double` for monetary values leading to inaccuracies.
   - String manipulation and type casting reduced readability.
   - Wildcard imports and lambdas introduced unnecessary complexity.

2. **Redesign with Domain-Driven Thinking**
   - Extracted `Item` and `Cart` as separate domain classes.
   - Controller delegates all calculations and item management to `Cart`.

3. **Ensure Financial Accuracy**
   - Replaced `double` with `BigDecimal` for all prices and totals.

4. **Improve Maintainability and Testability**
   - Business logic encapsulated within domain classes.
   - Controller remains lean and easier to unit test.

5. **Focus on Clarity**
   - Avoided fragile constructs (lambdas, wildcards).
   - Used explicit imports and clear control flow.

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

