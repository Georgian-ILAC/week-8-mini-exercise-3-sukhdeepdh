# Instructions  

  ## Step 1
  a. You will be completing a class named Employee that will inherit from the class Person. Make the necessary changes to the person class.
  
  b. Write the Employee constructor don’t forget your call to super
  
  c. Create two private class variables: an int id, and a double hourlyPay
  
  d. Since they are both private variables, write getters and setters for both variables: getId, getHourlyPay, setId, setHourlyPay
  
  ## Step 2
  a. In the Employee class, write a getRaise method. This method gives a raise to the user, increasing their total hourly pay by 15%. This method also updates the hourly pay class variable you made as well. Finally return the value of the employee’s new hourlyPay.

  ## Step 3
  a. Inside the Employee class create another method payDay. This method calculates how much the employee earned for the week. First calculate their pay, if the employee worked more than 40 hours, then any hour OVER 40 is worth 1.5 times their normal pay, this is considered overtime pay, otherwise their pay is as normal. Return their total pay for the week.

Example: if I worked 45 hours this week, I would get 5 hours of overtime pay and 40 hours of normal pay.

Include any parameters required

## Step 4
Inside the Employee class, let’s override the toString method.

Sample output:

Name: first_name last_name

They are height_feet’ height_inches“

They make $hourly_pay

They have the employee ID id_number

Each line should be followed by a new line, including the last character. 

HINT will a call to super help?

## Step 5
Test your work using Main.java`
  
