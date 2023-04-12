def solution(price):
    answer = 0
    if price >= 10 and price <= 1000000:
        if price < 300000 and price >= 100000:
            answer = price - (price * 0.05)
        elif price < 500000 and price >= 300000:
            answer = price - (price * 0.1)
        elif price >= 500000:
            answer = price - (price * 0.2)
        else:
            answer = price
            
    return int(answer)