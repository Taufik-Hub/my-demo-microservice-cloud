
GET:http://localhost:7002/users/2
GET:http://localhost:7002/users/
POST:http://localhost:7002/users/2

 {
       
        "userFirstName": "raj",
        "userLastName": "pratap",
        "departmentId": 2,
        "userEmail": "raj@gmail.com"
}

{
    "userId": 2,
    "userFirstName": "raj",
    "userLastName": "pratap",
    "userEmail": "raj@gmail.com",
    "department": {
        "departmentId": 2,
        "departmentName": "Electrical",
        "departmentAddress": "Amravati",
        "departmentCode": "ELE"
    }
}