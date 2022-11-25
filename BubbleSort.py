#Sorting Practice 2.0
#Time to design our own understanding of how to actually sort
import random
import time

def bubbleSort(array):

    #So this is how the computer will sort
    def Swap(i, j):
        array[i], array[j] = array[j], array[i]

    n = len(array)
    swapped = True

    x = -1
    while swapped:
        swapped = False
        x += 1
        for i in range(1, n-x):
            if array[i - 1] > array[i]:
                Swap(i - 1, i)
                swapped = True

    return array

def t_calc(tA, tB):
    t_init =  tB - tA
    return t_init

def main():
    t1 = time.clock()
    z = 1
    array = []
    while z <= 10000:
        x = random.randint(0, 500)
        array.append(x)
        z += 1
    print(array)
    print("Array Size:", len(array))
    t2 = time.clock()
    print("Elapsed time:", t_calc(t1, t2))
    print()

    t1 = time.clock()
    bubbleSort(array)
    print(array)
    print("Array Size:", len(array))
    t2 = time.clock()
    print("Elapsed time:", t_calc(t1, t2))
    print()

main()

#Based on observation, bubble sort with this program takes 25 seconds average
