def solution(array, height):
    lst = []
    for i in range(len(array)):
        if array[i] > height:
            lst.append(array[i])
    answer = len(lst)
    return answer