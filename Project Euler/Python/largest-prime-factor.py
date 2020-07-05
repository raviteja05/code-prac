def isPrime(num):
    for i in range(5,num,2):
        if num%i==0:        
            return False
    return True

def largestPrimeFactor(num):
    
    for i in range(3,num,2):
        if isPrime(i) and num%i==0:
            num=int(num/i)
            
            if(isPrime(num)):
                return num
            largestPrimeFactor(num)

print(largestPrimeFactor(600851475143 ))

        
