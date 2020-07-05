#https://projecteuler.net/problem=2
#Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
#
#1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
#
#By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
#0 1 1 2 3 5
def fibanocci(num):
   
    i=0
    j=1
    for n in range(num):
        (i,j)=(j,i+j) 
        if(j>num):
            break      
        yield j
       
        

    

def evenFibanocciSum(num):
    sum=0
    for i in fibanocci(num):
        if i%2==0:
            sum+=i
    print(sum)

evenFibanocciSum(4000000)
