def solution(my_string):
    answer = ''
    answer = my_string.replace('a', '')
    answer = answer.replace('e', '')
    answer = answer.replace('i', '')
    answer = answer.replace('o', '')
    answer = answer.replace('u', '')
    
    return answer

# 다른사람의 풀이
import re

def solution(my_string):
    return re.sub('[aeiou]', '', my_string)