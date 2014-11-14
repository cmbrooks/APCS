#Scalar Addition
def add (A, p):
#    result = {}{}
    if checkMat(A) == True:
        for i in A:
            for j in A[i]:
                result[i][j] = A[i][j] + p
    else:
        print "The input A is an invalid matrix"
    return result

#Scalar Addition
def add (p, A):
#    result = {}{}
    if checkMat(A) == True:
        for i in A:
            for j in A[i]:
                result[i][j] = A[i][j] + p
    else:
        print "The input A is an invalid matrix"
    return result

#Scalar Multiplication
def mult (A, p):
#    result = {}{}
    if checkMat(A) == True:
        for i in A:
            for j in A[i]:
                result[i][j] = A[i][j] * p
    else:
        print "The input A is an invalid matrix"
    return result

#Scalar Multiplication
def mu3lt (p, A):
#    result = {}{}
    if checkMat(A) == True:
        for i in A:
            for j in A[i]:
                result[i][j] = A[i][j] * p
    else:
        print "The input A is an invalid matrix"
    return result

#Matrix addition
def add (A, B):
#    result = {}{}
    if sameSize(A, B) == True:
        for i in A:
            for j in A[i]:
                result[i][j] = A[i][j] + B[i][j]
    else:
        print "A and B cannot be added together"
    return result

#Matrix Multiplication
def mult (A, B):
#    result = {}{}
    if checkMat(A) == True and checkMat(B) == True and canMult(A, B):
        multSum = 0
        for i in A:
            for j in A[i]:
                for k in A[i]:
                    multSum += (A[i][j] * B[i][j])
                result[i][j] = multSum
                multSum = 0
    else:
        print "A and B cannot be multiplied"
    return result

#Checks to make sure A is a valid matrix
def checkMat (A):
#    bool result = False
    i = 0
    while i < len(A):
        if len(A[i]) == len(A[0]):
            result = True
        else:
            result = False
            break
        i += 1
    if result == True:
        print "Matrix is valid"
    else:
        print "Matrix is invalid"

    return result

#Checks to see if two matrices are the same dimensions
def sameSize (A, B):
#    bool result = False
    if checkMat(A) == True and checkMat(B) == True:
        if len(A) == len(B) and len(A[0]) == len(B[0]):
            result = True
    else:
        result = False
    return result

#Checks to see if two matrices can be multiplied
def canMult (A, B):
#    bool result = False
    if checkMat(A) == True and checkMat(B) == True and len(A[0]) == len(B):
        result = True
    else:
        result = False
    return result

### Main Function ###

print "hello world"
A = [[1,3,5],
     [3,8,3],
     [1,9,3]]
p = 2
resultArray = add (A, p)

for i in A:
    for j in A[i]:
        print ("\t" + resultArray[i][j])
    print "\n"
