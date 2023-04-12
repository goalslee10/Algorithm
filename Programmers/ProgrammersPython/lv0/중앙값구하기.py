def solution(array):
    array.sort()
    if len(array) % 2 != 0:
        answer = array[len(array) // 2]
    return answer