# capgemini

1. To run the Server with the associated API :

   Git clone the folder

   cd into the folder
   
   ./mvnw clean install (as part of this the junit tests will be run)
   
   ./mvnw spring-boot:run 

2. The Api will be of the form http://localhost:8080/calculate/sqrtSumSqHigh3 where localhost is the host that it is running on. 

3. It will be a POST action and the payload will be of the form { "data": [5,4,6,1]}

4. The output will be of the form { "output": 8.77 } and it will be derived by taking the 3 largest input numbers provided, summing their squares and the then
   finding the square root of the sum.
   
   
