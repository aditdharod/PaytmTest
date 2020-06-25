# PaytmTest

Question 1
answer a)
SELECT
    EmpName, Salary
FROM
    Salary inner join Employee using(EmpID)
ORDER BY column_name DESC
LIMIT n - 1, 1;

answer b)
update Salary
set Salary = 5000
from Salary
inner join Employee using(EmpID)
where (year(getdate())-year(Date_of_birth)) > 30;

Question 2
PFA Excel sheet attached in the mail body

Question 3
PFB Manual test cases for Prime number check
Check the github link

Pre condition : Let the prime number be n
Case 1 : Expected output should be prime number
Divide the number n by 1 remainder = 0 pass
Divide the number n by n remainder = 0 pass
Divide the number n by 2 remainder!= 0 pass ....
Divide the number n by upto n-1 and if the remainder is not equal to zero then its a prime number
1. It should be numeric values
2. Number should not contain fraction or decimal values
3. Number should not contain any special character
4. Number should be divisible by 1
5. If the number is divisible by other than 1 then the remainder should be atleast 1
6. Number should be positive number

Question 4
Please check the github link
https://Adit_Dharod@bitbucket.org/Adit_Dharod/paytmtest.git
