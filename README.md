# dbs-test-forecast

DBS Assignment project

Following has been completed.

Home page with search location using google maps api
get lat long from google maps api
check if record exists in database
     if yes
         reterive record from db and send to UI
     if no
          call Darksky api, store into db and send to UI
 
Created a schedular which runs midnight and delete all the records older than 3 days (configurable from application.properties)


libraries used
  GSON for json conversion
 
Database
  mongodb (As provided in requirements)
  
UI
  thymeleaf
  
