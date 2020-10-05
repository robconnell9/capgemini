# capgemini

1. to run the Server with the API ,cd into the folder and then do mvn spring-boot:run (as part of this the junit tests will be run).

3. The Api will be of the form http://localhost:8080/calculate/sqrtSumSqHigh3 where localhost is the host that it is running on. 

4. It will be a POST action and the payload will be of the form { "data": [5,4,6,1]}

5. The output will be of the form { "output": 8.77 } and it will be derived by taking the 3 largest input numbers provided, summing their squares and the then
   finding the square root of the sum.
   
   
