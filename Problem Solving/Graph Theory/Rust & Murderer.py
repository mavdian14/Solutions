#!/bin/python3

import os
import sys

tests = int(input())

for _ in range(tests):
    [n, e] = [int(i) for i in input().split(" ")]
    dists = [1] * n
    roads = {}
    for _ in range(e):
        [n1, n2] = [int(i) for i in input().split(" ")]
        if n1 not in roads:
            roads[n1] = set()
        if n2 not in roads:
            roads[n2] = set()
        roads[n1].add(n2)
        roads[n2].add(n1)
    start_loc = int(input())
    not_visited = roads[start_loc] if start_loc in roads else set()
    newly_visited = set()
    curr_dist = 2
    while len(not_visited) > 0:
        for i in not_visited:
            diff = not_visited | roads[i]
            if len(diff) < n:
                dists[i-1] = curr_dist
                newly_visited.add(i)
        not_visited = not_visited - newly_visited
        newly_visited = set()
        curr_dist += 1
    del dists[start_loc-1]
    print(" ".join(str(i) for i in dists))
