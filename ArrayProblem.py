def bubble_sort(arr):
    for i in range(len(arr)):
        for j in range(len(arr)-i-1):
            if arr[j] > arr[j+1]:
                temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
    return arr

def reverse(arr):
    l = len(arr)
    for i in range(int(l/2)):
        temp = arr[i]
        arr[i] = arr[l-i-1]
        arr[l-i-1] = temp
    return arr
def maximum_minimum(arr) -> list[int]:
    return [arr[-1],arr[0]]
arr = list(map(int,input().split()))
sorted_arr = bubble_sort(arr)
print(sorted_arr)
reverse_arr = reverse(sorted_arr)
print(reverse_arr)
maxandmin = maximum_minimum(sorted_arr)
print(maxandmin)