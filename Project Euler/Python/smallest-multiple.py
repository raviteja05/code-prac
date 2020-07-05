#2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

#What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

def divisibilityCheck(num,maxNum):
    for i in range(1,maxNum+1):
        if num%i!=0:
            return False
    return True

def smallestMultiple(maxNum):
    i=maxNum
    while True:
        if divisibilityCheck(i,maxNum):
            return i
        i+=maxNum

print(smallestMultiple(20))

