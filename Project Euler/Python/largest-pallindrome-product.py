#A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

#Find the largest palindrome made from the product of two 3-digit numbers.

def isPallindrome(num):
    return str(num)==str(num)[::-1]

def largestPallindrome(num):
    for i in range(num,100,-1):
        for j in range(num,100,-1):
            if(i==j):
                break
            if isPallindrome(i*j):
                yield i*j

print(max(largestPallindrome(999)))