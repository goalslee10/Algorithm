def solution(array, n):
    lst = []
    for i in range(len(array)):
        if n == array[i]:
            lst.append(array[i])
    answer = len(lst)
    return answer