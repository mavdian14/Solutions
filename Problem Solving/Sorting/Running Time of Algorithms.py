#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'runningTime' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY arr as parameter.
#

def runningTime(arr):
    ret=0
    for i in range(1,n):
        tmp=arr[i]
        j=i-1
        
        while j>=0 and arr[j] > tmp:
            arr[j+1] = arr[j]
            j-=1
            ret+=1
        arr[j+1]=tmp
    return ret
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    result = runningTime(arr)

    fptr.write(str(result) + '\n')

    fptr.close()