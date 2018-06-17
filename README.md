# Vehicle-Info-Service

 Vehicle API is a basic example of RESTful web service designed using Spring Boot and Mongo repository. 
 
 
## Installation steps:
 Install Java, Maven, and MongoDB on your machine. 
 
Steps to launch an application:

The easiest way to get started is to clone the repository.
```
$ git clone https://github.com/nehatambe/Vehicle-Info-Service.git
```
Download the zip file from above repository and Unzip it.
 
Update application.properties file to change database name and port. Package the code into a jar file using maven commands. 
Open command prompt terminal and change to the directory where ‘Vehicle-Info-Service’ project is located. Package the application using Maven commands. Run the application using the following command.
```
java -jar target/Vehicle-Info-Service-0.0.1-SNAPSHOT.jar
 ```
## Documentation
```
The web service implements following RESTful endpoints - 
GET vehicles
GET vehicles/{id}
POST vehicles
PUT vehicles
DELETE vehicles/{id}
```
The information about vehicles is stored in MongoDB. Also, multiple validations are implemented in the service. The web service can be tested using Postman.
