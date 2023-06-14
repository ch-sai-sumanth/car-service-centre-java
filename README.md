<center>
<h1> CAR SERVICE CENTRE JAVA APPLICATION </h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>

</center>
This is a Java application designed for car service centers. It provides a user-friendly interface for selecting services and generating bills for different car types.


---


## Language Used
* Java

---
<br>

## Features

* Car Type Selection: Users can choose the car type from options like Hatchback, Sedan, and SUV.
* Service Selection: Users can select the desired services using unique service codes.
* Cost Calculation: The application calculates the total cost of the selected services based on the car type and service codes.
* Complimentary Cleaning Service: If the total bill amount exceeds 10,000, a complimentary cleaning service is added to the bill free of cost.
* Bill Generation: The application generates a detailed bill with itemized services, individual costs, and the total bill amount.
<br>

## Installation
 1.Clone the repository

 ``https://github.com/ch-sai-sumanth/car-service-centre-java.git``

2.Compile the Java source code

``javac CarServiceCentre.java``

3.Run the application:

``java CarServiceCentre``

## Usage
* Upon running the application, follow the prompts to input the car type and select the desired services by entering the corresponding service codes.
* Once the services are selected, the application will calculate the total cost and display it on the screen.
* If the total bill amount is above 10,000, the complimentary cleaning service will be automatically added.
* The application will generate a detailed bill with all the selected services, their individual costs, and the total bill amount.

## Examples
Here are a few examples to help you understand how the application works:

### Input
1. Car Type: Hatchback
   * Services: BS01, EF01
### Output
     * Bill: 
      
            Type of car -> Hatchback
            Service Codes -> BS01,EF01,
            charges for Basic servicing -> 2000
            charges for Engine Fixing -> 5000
            Total Bill : 7000

### Input
2. Car Type: Sedan
   * Services: BF01, GF01

### Output
  * Bill:

        Type of car -> Sedan
        Service Codes -> BF01,GF01,
        charges for Gear Fixing -> 6000
        charges for Break Fixing -> 1500
        Total Bill : 7500

## How I developed this project 

Abstract Class: The "Cars" class serves as an abstract base class, defining common properties and behaviors for all types of cars. It encapsulates the shared characteristics and functionality that are inherent to cars in general.

Inheritance: The "Hatchback," "Sedan," and "SUV" classes extend the "Cars" abstract class. By inheriting from the "Cars" class, these subclasses inherit the properties and behaviors defined in the abstract class. In other words, the subclasses inherit the common features of a car while allowing for specific characteristics and behaviors unique to each type.

Polymorphism: Polymorphism is demonstrated through the usage of abstract methods in the "Cars" class. Abstract methods are declared in the abstract class but do not have an implementation. Each subclass (Hatchback, Sedan, SUV) must provide its own implementation of these abstract methods, fulfilling the specific requirements for that type of car. This allows for different behaviors of the same method based on the type of car.

Encapsulation: Encapsulation refers to the bundling of data and methods within a class, hiding the internal details and providing access through well-defined interfaces. In your project, encapsulation is exemplified by the private fields and public getter and setter methods used to access and modify the car-related information, such as car type, service codes, and bill details. This encapsulation ensures data integrity and enables controlled access to the internal state of the car objects.

By employing these OOP concepts, you have created a modular and extensible design for your car service center project. The abstract class and inheritance hierarchy provide a clear structure for managing different car types and their specific behaviors, while encapsulation ensures data security and controlled access to the car-related information.
## Contributing

Contributions are welcome! If you would like to contribute to this project, please follow these steps:

1.Fork the repository.

2.Create a new branch for your feature/bug fix.

3.Make your changes and commit them.

4.Push your changes to your forked repository.

5.Submit a pull request describing the changes you've made.

## Project Summary

The Car Service Centre Java Application is a Java-based solution designed specifically for car service centers. It streamlines the process of generating bills by providing a user-friendly interface for selecting car types, choosing services through unique service codes, and calculating the total cost. In addition, the application offers a complimentary cleaning service, which is automatically added to the bill if the total amount exceeds 10,000. The generated bill includes detailed information such as itemized services, individual costs, and the total bill amount. This project aims to simplify and automate the billing process for car service centers, enhancing efficiency and customer satisfaction.

## 📝 Licence
---
Copywrite © 2019 [sumanth]().


 
---
_This README was generated with ❤️  by [readme-md-generator]()_

