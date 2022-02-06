// 성공 코드
#include <string>
#include <vector>

using namespace std;

long long solution(int a, int b) {
    long long answer = 0;

    // a<b인 경우와 그렇지 않은 경우로 나눈다.
    if (a < b) for (int i = a; i <= b; i++) answer += i;
    else for (int i = b; i <= a; i++) answer += i;

    return answer;
}