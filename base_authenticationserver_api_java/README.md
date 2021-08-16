# Name: 
base_authenticationserver_api_java

# Scope:
To provide the global JWT token authentication across all java api


# Technology:
* Java 1.8
* JWT
* Spring
* Spring boot
* Oauth2.0


# Description:
This authentication server provided jwt token based up on the user authorities to access the protected resource. If we delivery n number of api’s to   particular customer these authentication server acts as an global token provider for that api’s.

# Start up 
 To start application from command line run following maven command.
 --**mvn spring-boot:run**
 
# Technical overview:
  # application.yml
     --clientId, clientSecret
     
        security:
         oauth2:
           client:
            clientId: AetinsClientId
            clientSecret: AetinsClientSecret
            
     --Spring security username, password.
     
      spring:
         security:
            user:
             name: aetins
             password: PassWord$123
    
    # config.properties
     --Symmetric key
       oauth2.symmetrickey=aetins@12345
       
    # Sample request
      curl --location --request POST 'http://localhost:1111/oauth/token?grant_type=password&username=aetins&password=PassWord$123' \
            --header 'Authorization: Basic QWV0aW5zQ2xpZW50SWQ6QWV0aW5zQ2xpZW50U2VjcmV0'
            
    # Sample response
    
    {
    
    "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1ODQ5NTc3MzYsInVzZXJfbmFtZSI6ImFldGlucyIsImF1dGhvcml0aWVzIjpbIlJPTEVfQURNSU4iXSwianRpIjoiZGNjMGEyMTEtZTBmMS00YTJhLWEwOGQtMDI0YWI1N2JjYjRiIiwiY2xpZW50X2lkIjoiQWV0aW5zQ2xpZW50SWQiLCJzY29wZSI6WyJyZWFkLHdyaXRlIl19.9W_yFIFmJjuGvKh3Sjp9Hl4Io_6BYQPz6QqnRvzhb_Y",
    "token_type": "bearer",
    "refresh_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJhZXRpbnMiLCJzY29wZSI6WyJyZWFkLHdyaXRlIl0sImF0aSI6ImRjYzBhMjExLWUwZjEtNGEyYS1hMDhkLTAyNGFiNTdiY2I0YiIsImV4cCI6MTU4NzU0NjEzNiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9BRE1JTiJdLCJqdGkiOiI0NWE5MmUyMS05ZDU0LTRlOGEtOWUyMC01MmQ0MzY5M2ZkYjciLCJjbGllbnRfaWQiOiJBZXRpbnNDbGllbnRJZCJ9.ycYMLpDe67St8BmU1_8EGihWD6SI_yTjNZcPPoAzqQA",
    "expires_in": 3599,
    "scope": "read,write",
    "jti": "dcc0a211-e0f1-4a2a-a08d-024ab57bcb4b"
   }
       
       

    
    
 
