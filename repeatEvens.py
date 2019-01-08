def repeatEvens(arr):
    #given an integer array, replace each even integer with two of itself
    #assume the array has room for all of these, as in there are null characters at the end

    #solved using reverse traversal
    end = len(arr) - 1
    for i in range(len(arr) - 1, -1, -1):
        if arr[i] != None:
            if arr[i]%2 == 0:
                arr[end] = arr[i]
                arr[end - 1] = arr[i]
                end -= 2
            else:
                arr[end] = arr[i]
                end -= 1
    return arr
print(repeatEvens([4,4,4,4,None,None,None,None,None,None,None,None,None,None]))
