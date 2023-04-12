def solution(money):
    answer = []
    answer.append(money // 5500)
    answer.append(money % 5500)
    return answer

# def solution(money):
#   return divmod(money, 5500)
# divmod (8, 3)
# (2,2) (몫, 나머지)