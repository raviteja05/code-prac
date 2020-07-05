#By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
#
#What is the 10 001st prime number?
def isPrime(num):
    for i in range(3,num,2):
        if num%i==0:        
            return False
    return True

def nthPrime(n):
    count=2
    primeNo=3
    while count<=n:
        primeNo+=2
        
        if isPrime(primeNo):
            count+=1           
            
        if count==n:
            return primeNo

print(nthPrime(10001))