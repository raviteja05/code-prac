#A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
#
#a2 + b2 = c2
#For example, 32 + 42 = 9 + 16 = 25 = 52.
#
#There exists exactly one Pythagorean triplet for which a + b + c = 1000.
#Find the product abc.
def tripletMatchingSumandProduct(n):
    for a in range(1,n,1):
        for b in range(a+1,n,1):
            c=n-a-b
            if a**2+b**2==c**2:
                return (a,b,c,a*b*c)

print(tripletMatchingSumandProduct(1000))
