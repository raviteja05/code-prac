#This program prints the sum of all multiples of three and five below 1000
def isMultipleOfThreeOrFive(num):
    return num%3==0 or num%5==0

def printOutput():
    sum=0
    for i in range(1,1000):
        if isMultipleOfThreeOrFive(i):
            sum+=i
    print(sum)

printOutput()