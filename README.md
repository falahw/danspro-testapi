## HOW-to-USE
- clone all files in repository 'danspro-testapi'
- open the project in your IDE (eclipse, spring tool suite, or intellij idea)
- run it from there

## API-URL
http://localhost:8080/users will show all data rows in JSON format

http://localhost:8080/user/{username} will show chosen data row in JSON format based on value in parameter {username}
some values that can be tried for {username} are 'admin', 'intern', 'johnm'

## SQL File
- there is this file named 'danspro_login.csv'. This is an SQL file made out of PostgreSQL
- export this file through your database app. In my case, I use pgAdmin