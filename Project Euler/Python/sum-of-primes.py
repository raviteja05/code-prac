

def primeGenerator(n):
    numRange=list(range(2,n))
    for i in numRange:
        for j in range(2,n,1):
            try:
                numRange.remove(i*j)
            except:
                pass
    return numRange

def sumOfPrimes(n):
    sum=0
    for i in primeGenerator(n):
        sum+=i
    return sum

print(sumOfPrimes(2000000))
