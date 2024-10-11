CRUD API
The REST API performs CRUD operations on Student objects as described below.

Installation
Get the project
clone

git clone https://github.com/uncg-csc340/f24-crud-api-jpa.git

download zip.

Open the project in IntelliJ.
/src/main/resources/application.properties file is the configuration for the MySQL database on your localhost.
the database name is on the datasource.url property between the last / and the ?. In this case the database name is f24-340.
You MUST have the database up and running before running the project!
Open your XAMPP Control Panel.
Start the Apache server.
Start MySQL.
Click on MySQL "Admin" to open up the DBMS.
Ensure the database that you need is available.
Build and run the main class. You should see 2 new tables created in the aforementioned database.
API Endpoints
Use POSTMAN to try the following endpoints:

Get list of Animals
Request
`GET /animals/all`

`http://localhost:8080/animals/all`

Response
 [

 {"AnimalID": 1, "animalName": "tom", "animalSpecies": "toad", "animalHabiat": "wherever", "animalSciname": "toad", "animalDescription": "nope"}, 

 {"AnimalID": 2, "animalName": "tod", "animalSpecies": "toad", "animalHabiat": "wherever", "animalSciname": "toad", "animalDescription": "nope"}, 
 
 {"AnimalID": 3, "animalName": "toss", "animalSpecies": "toad", "animalHabiat": "wherever", "animalSciname": "toad", "animalDescription": "nope"}, 

 ]
Get a specific animal
Request
`GET /animals/animalId`

`http://localhost:8080/animals/1`

Response
{
  {"AnimalID": 1, "animalName": "tom", "animalSpecies": "toad", "animalHabiat": "wherever", "animalSciname": "toad", "animalDescription": "nope"}, 
}

Create a new animal
Request
`POST animals/new`

`http://localhost:8080/animals/new` --data '{"AnimalID": 4, "animalName": "top", "animalSpecies": "frog", "animalHabiat": "wherever", "animalSciname": "toad", "animalDescription": "nope"}'
Response
 [

 {"AnimalID": 1, "animalName": "tom", "animalSpecies": "toad", "animalHabiat": "wherever", "animalSciname": "toad", "animalDescription": "nope"}, 

 {"AnimalID": 2, "animalName": "tod", "animalSpecies": "toad", "animalHabiat": "wherever", "animalSciname": "toad", "animalDescription": "nope"}, 
 
 {"AnimalID": 3, "animalName": "toss", "animalSpecies": "toad", "animalHabiat": "wherever", "animalSciname": "toad", "animalDescription": "nope"}, 

 {"AnimalID": 4, "animalName": "top", "animalSpecies": "frog", "animalHabiat": "wherever", "animalSciname": "toad", "animalDescription": "nope"}

 ]

 
Get Animals by species
Request
`GET /students?species = "frog"`

`http://localhost:8080/animas?species="frog"`
Response
 [

  {"AnimalID": 4, "animalName": "top", "animalSpecies": "frog", "animalHabiat": "wherever", "animalSciname": "toad", "animalDescription": "nope"}

 ]

Get animals with a string contained within their name
Request
`GET /students?name="op"`

`http://localhost:8080/animals?name="op`
Response
[

 {"studentId": 1, "name": "sample1", "major": "csc", "gpa": 3.89}, 

 {"studentId": 2, "name": "sample2", "major": "mat", "gpa": 4.0},    

 { "studentId": 4, "name": "sample4", "major": "csc", "gpa": 3.55}
]

Update an existing animal
Request
`PUT /animal/update/{4}`

`http://localhost:8080/students/update/1` --data {"AnimalID": 4, "animalName": "top", "animalSpecies": "frog", "animalHabiat": "wherever", "animalSciname": "toad", "animalDescription": "oh"}

Response
{
  "AnimalID": 4, "animalName": "top", "animalSpecies": "frog", "animalHabiat": "wherever", "animalSciname": "toad", "animalDescription": "oh"
}

Delete an existing Student
Request
`DELETE /animals/delete/{4}`

`http://localhost:8080/animals/delete/4`
Response
[

 {"AnimalID": 1, "animalName": "tom", "animalSpecies": "toad", "animalHabiat": "wherever", "animalSciname": "toad", "animalDescription": "nope"}, 

 {"AnimalID": 2, "animalName": "tod", "animalSpecies": "toad", "animalHabiat": "wherever", "animalSciname": "toad", "animalDescription": "nope"}, 
 
 {"AnimalID": 3, "animalName": "toss", "animalSpecies": "toad", "animalHabiat": "wherever", "animalSciname": "toad", "animalDescription": "nope"}, 
 
]
