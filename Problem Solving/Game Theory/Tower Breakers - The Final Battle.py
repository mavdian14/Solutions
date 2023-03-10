#!/bin/python3

import math
import os
import random
import re
import sys
from collections import defaultdict

#
# Complete the 'towerBreakers' function below.
#
# The function is expected to return an INTEGER.
# The function accepts LONG_INTEGER n as parameter.
#
def F(n):
    if n in d:
        return d[n]
    else:
        temp=0
        for k in range(1,int(math.sqrt(n))+1):
            temp += F(n-k**2)
        d[n]=temp
        return d[n]
    
def towerBreakers(n):
    ans=0
    while d[ans]<n:
        ans+=1
    print(ans)
    
d = defaultdict(int)
d[0]=1
F(130) #d[130]>10**18

for _ in range(int(input())):
    towerBreakers(int(input()))

