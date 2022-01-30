// 시간초과 코드
#include <string>

using namespace std;

int solution(int n) {
    int answer = 1, i, k, flag;

    for (i = 3; i <= n; i++) {
        flag = 1;
        for (k = 2; k < i; k++) {
            if (i % k == 0) {
                flag = 0;
                break;
            }
        }
        if (flag) answer++;
    }

    return answer;
}

// 시간초과 코드
#include <string>
#include <cmath>

using namespace std;

int solution(int n) {
    int answer = 1, i, k, flag;

    for (i = 3; i <= n; i++) {
        flag = 1;
        for (k = 2; k <= sqrt(i); k++) {
            if (i % k == 0) {
                flag = 0;
                break;
            }
        }
        if (flag) answer++;
    }

    return answer;
}

// 성공 코드

// 에라토스테네스의 체를 이용
// 원리: 소수는 약수가 오로지 1인 수로 1을 제외한 수의 배수가 되는 수는 소수가 아니다.
// 방식: 임의의 수 n까지의 소수를 구하고자 할 때 2부터 n의 제곱근까지 돌며 모든 배수들을 소수에서 제외시키는 방식이다.
// 시간복잡도: 특정한 숫자의 제곱근까지만 약수의 여부를 검증하므로 O(N^1/2)

#include <string>
#include <vector>
#include <cmath>

using namespace std;

int solution(int n) {
    int answer = 0, i, j, flag;
    
    // 배열을 생성하여 1로 초기화한다.
    vector<int> v(n + 1, 1);

    // 2부터 시작해서 특정 수의 배수에 해당되는 수를 모두 지운다.
    // (지울 때 자기 자신은 지우지 않고, 이미 지워진 수는 건너뛴다.)
    for (i = 2; i <= sqrt(n); i++) {
        if (v[i] == 0) continue; // 이미 지워진 수라면 건너뛰기

        // 이미 지워진 숫자가 아니라면, 그 배수부터 출발하여 가능한 모든 숫자 지우기
        for (j = 2 * i; j <= n; j += i) {
            v[j] = 0;
        }
    }

    // 2부터 시작하여 남아있는 수를 모두 출력한다.
    for (i = 2; i <= n; i++) {
        if (v[i] != 0) answer++;
    }

    return answer;
}

// 참고: https://velog.io/@max9106/Algorithm-%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98-%EC%B2%B4