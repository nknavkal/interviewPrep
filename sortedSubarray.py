def subarray(arr):
    start = 0
    end = len(arr) - 1
    if len(arr)<=1:
        return arr
    while arr[start] < arr[start + 1] or arr[end] > arr[end - 1]:
        if arr[start] < arr[start + 1]:
            start += 1
        if arr[end] > arr[end - 1]:
            end -= 1
        if start >= end:
            return []
    #at this point, we've isolated first dip from the front and the first jump from the back
    #we now have to push this subarray outward until its max is less than array[end] and min is more than array[start]
    sub = arr[start:end+1]
    #print(sub)
    MIN = min(sub)
    MAX = max(sub)
    while start != 0 and MIN < arr[start-1]:
        if MIN < arr[start-1]:
            start -= 1
    while end != len(arr)-1 and MAX > arr[end+1]:
        if MAX > arr[end + 1]:
            end += 1

    return arr[start:end+1]
print(subarray([1,2,3]))
