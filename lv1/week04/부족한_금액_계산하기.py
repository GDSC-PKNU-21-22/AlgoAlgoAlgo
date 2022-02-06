def solution(price, money, count):
    get_price = lambda x: x if x > 0 else 0
    total = sum((i + 1) * price for i in range(count))

    return get_price(total - money)