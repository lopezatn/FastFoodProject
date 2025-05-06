# FastFoodProject

## Overview
The **FastFoodProject** is a Java-based application designed for learning purposes. It demonstrates key object-oriented programming (OOP) principles by modeling a fast food meal ordering system. Users can create a meal consisting of a burger, a side dish, and a drink, calculate the total price, and view a detailed breakdown of the order.

---

## Features
- **Burger Customization**: Create a burger with a base price and add customizable toppings.
- **Item Management**: Handle individual items like side dishes and drinks with size-based price adjustments.
- **Meal Order**: Combine a burger, side dish, and drink into a meal order and calculate the total price.
- **Detailed Breakdown**: Provide a detailed summary of the meal, including individual item prices and the total cost.

---

## Learning Objectives
This project is intended to help learners understand:
1. **Inheritance**: The `Burger` class extends the `Item` class to reuse and extend functionality.
2. **Composition**: The `MealOrder` class uses composition to group `Burger` and `Item` objects.
3. **Encapsulation**: Fields are kept private, and access is provided through methods.
4. **Polymorphism**: Demonstrates method overriding in the `Burger` class.
5. **Code Organization**: Structuring a project with multiple classes and responsibilities.

---

## How It Works
1. **Burger**: Create a burger with a base price and add toppings (e.g., cheese, bacon, tomato).
2. **Side Dish and Drink**: Create items with size-based price adjustments (e.g., small fries, large cola).
3. **Meal Order**: Combine the burger, side dish, and drink into a meal order.
4. **Price Calculation**: Calculate the total price of the meal and display a detailed breakdown.

---

## Project Structure
- **`Item` Class**: Represents individual items like side dishes and drinks. Handles size-based price adjustments.
- **`Burger` Class**: Extends `Item` to add functionality for toppings and calculates the total price of a burger.
- **`MealOrder` Class**: Combines a burger, side dish, and drink into a meal order and calculates the total price.
- **`App` Class**: The entry point of the application, used to create and test meal orders.

---
