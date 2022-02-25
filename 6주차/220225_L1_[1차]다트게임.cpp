// 성공 코드
#include <string>
#include <cmath>

using namespace std;
int a[3];

int solution(string dartResult) {
    int answer = 0, cnt = 0;
    for (int i = 0; i < dartResult.size(); i++) {
        if (dartResult[i] >= '0' && dartResult[i] <= '9') {
            a[cnt] = a[cnt] * 10 + dartResult[i] - '0';
        }
        else if (dartResult[i] == 'S') {
            a[cnt] = pow(a[cnt], 1);
            cnt++;
        }
        else if (dartResult[i] == 'D') {
            a[cnt] = pow(a[cnt], 2);
            cnt++;
        }
        else if (dartResult[i] == 'T') {
            a[cnt] = pow(a[cnt], 3);
            cnt++;
        }
        else if (dartResult[i] == '*') {
            cnt--;
            a[cnt] *= 2;
            if (cnt - 1 >= 0) {
                cnt--;
                a[cnt] *= 2;
                cnt += 2;
            }
            else cnt++;
        }
        else if (dartResult[i] == '#') {
            cnt--;
            a[cnt] = a[cnt] * -1;
            cnt++;
        }
    }
    for (int i = 0; i < 3; i++) {
        answer += a[i];
    }

    return answer;
}