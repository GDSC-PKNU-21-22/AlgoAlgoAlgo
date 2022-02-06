// 성공 코드
#include <string>
#include <vector>

using namespace std;

bool solution(string s) {
    bool answer = true;

    if (s.size() != 4 && s.size() != 6) answer = false;
    else {
        for (int i = 0; i < s.size(); i++) {
            if (s[i] < '0' || s[i] > '9') {
                answer = false;
                break;
            }
        }
    }

    return answer;
}

// 다른 사람의 풀이
#include <string>
#include <vector>

using namespace std;

bool solution(string s) {
    bool answer = true;

    if (s.size() != 4 && s.size() != 6) answer = false;
    else {
        for (int i = 0; i < s.size(); i++) {
            // 숫자 판단 함수
            // int isdigit(int c);
            // 숫자면 0이 아닌 값이, 숫자가 아니면 0이 반한됨
            if (!isdigit(s[i])) {
                answer = false;
                break;
            }
        }
    }

    return answer;
}