# Cinema Booking Builder Assignment
## Project Structure
Here is how I organized my classes for this assignment:
- **Booking**: The immutable product class holding all ticket details.
- **BookingBuilder**: The builder class implementing a fluent API(method chaining) to construct the booking step by step.
- **BookingDirector**: Manages prebuilt preset configurations(standard 2D or IMAX como ticket).
- **Main**: The client class to test everythimg and print the results.
---
## Clean Code Principle Applied in my code
To make my code clean and readable, I applied 5 principles:
### 1. Meaningfull, Intention-Reveaaling Names
I named my classes, methods, variables so they clearly express their intent without needing extra comments.
```java
public BookingBuilder setMovieTitle(String movieTitle) {
    this.movieTitle = movieTitle;
    return this;
} 
```
### 2. Small Methods, Each Doing One Thing
Methods are kept concise, focusing strictly on a single logical operation.
```java
   public BookingBuilder addPopcorn() {
   this.hasPopcorn = true;
   this.totalPrice += 1500.0;
   return this;
   }
  ```
### 3. Validated Construction
The builder validates the object's state inside the build() method and setters, throwing an IllegalArgumentException immediately if mandatory data is missing or invalid.
```java
   if (movieTitle == null || movieTitle.isEmpty()) {
   throw new IllegalArgumentException("Error: Movie title is required");
   }
   if (seatNumbers.isEmpty()) {
   throw new IllegalArgumentException("Error: At least one seat must be selected.");
   }
 ```
### 4. No Magic Numbers/Strings (Encapsulation of Defaults)
Default values and pricing rules are explicitly declared or handled cleanly.
```java
   private String hallType = "2D";
   private double totalPrice = 0.0;
   this.totalPrice += seatNumbers.size() * 2000.0;
 ```
### 5. Consistent Formatting and Small, Focused Classes
Each class (Booking, BookingBuilder, BookingDirector, Main) has a single, well-defined responsibility, maintaining clean separation of concerns and readable formatting across the package structure.

