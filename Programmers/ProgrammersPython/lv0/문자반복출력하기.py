def solution(my_string, n):
    answer = ''
    for idx, i in enumerate(my_string):
        answer += i*n
    return answer

# 다른사람의 풀이
def solution(my_string, n):
    return ''.join(i*n for i in my_string)