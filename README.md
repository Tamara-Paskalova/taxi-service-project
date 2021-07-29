# Taxi Service
This is a very handy application that aims to help organize and coordinate part of the inside information of your taxi business.
It is easy to use, has a user-friendly interface and allows you to:
- Create a new car.
- Create a new driver.
- Assign a driver to one or more cars.
- Add detailed vehicle description by creating manufacturer information.
- Provide a list of cars assigned to each driver.
- Delete cars, drivers and manufacturers.

Allows access only to authorized users, and also provides the ability to register new ones.
This project follows the rules of N-tier Architecture and SOLID. Has DAO, SERVICE and CONTROLLER layers and uses custom Injector class and Logger.
### The next DB diagram shows relations between Car, Driver, and Manufacturer.
![car_diagram_db_2_4f50942103](https://user-images.githubusercontent.com/83809337/127296817-e1af8215-1819-49ed-ba0a-6526e71e6542.png)

## Technologies used
- Java 15
- Apache Tomcat - version 9.0.46
- MySQL - version 8.0.25
- JDBC
- Servlet
- JSTL
- JSP
- HTML, CSS

## Run Project
To run this project need to have installed
- IntelliJ IDEA Ultimate [IDEA](https://www.jetbrains.com/idea/download/#section=windows)
- ApacheTomcat [TOMCAT](https://tomcat.apache.org/download-90.cgi)
- MySQL and MySQL Workench [MySQL](https://www.mysql.com/downloads/)

- Clone the project on your IDE
- In MySQL Workbench run the script from resources/init_db.sql.
  #### Warning!!! if you already have a database named "taxi", this script will delete it and create a new database with the same name.
  
- In src/main/java/taxi/util/ConnectionUtil change URL, USERNAME and PASSWORD with your data

![2021-07-28 (9)](https://user-images.githubusercontent.com/83809337/127299771-25ceddd3-305a-4108-86ae-f0fe9acc8a69.png)

for example

![2021-07-28 (11)](https://user-images.githubusercontent.com/83809337/127303479-19989d70-b625-4d08-ac82-4620d7a8ef5f.png)


jdbc.Driver is already provided, but you can change it with more suitable as well

- Configure TomCat Local server (Add New Configuration -> TomCat -> Local -> Fix -> taxi-service:war exploded -> OK)
- Enjoy the project!


(If your logger doesn't write logs in file, create file `app.log` in `src/logs` folder.
Then in `src/main/resources/log4j2.xml` change the line `<File name = "File" fileName = "logs\app.log">`
where you should replace `logs\app.log` with your absolute path to `app.log` file)
## Login Page
![2021-07-29](https://user-images.githubusercontent.com/83809337/127461892-60bfc0c5-7f67-4f7e-bda5-2e71a568c2ed.png)
## Create new User/Driver Page
![2021-07-29 (1)](https://user-images.githubusercontent.com/83809337/127461072-e37faff8-43b7-412e-be51-59769b22fe68.png)
## Menu Page
![2021-07-29 (2)](https://user-images.githubusercontent.com/83809337/127460904-ad69c8f9-5d7d-4d35-8795-ae64982dba23.png)
