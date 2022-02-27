// 성공 코드
// 1
using namespace std;

long long solution(int price, int money, int count)
{
    long long answer = 0;
    for (int i = 1; i <= count; i++) {
        answer += price * i;
    }
    if (answer - money > 0) return answer - money;
    else return 0;
}
// 2
// 1LL은 (long long)1
using namespace std;

long long solution(int price, int money, int count)
{
    long long answer = 1LL * price * count * (count + 1) / 2 - money;

    return answer > 0 ? answer : 0;
}

// 다른 사람의 풀이
#include <bits/stdc++.h>
using namespace std;

long long solution(int price, int money, int count)
{
    long long required = 1LL * price * count * (count + 1) / 2;
    return required <= money ? 0 : required - money;
}