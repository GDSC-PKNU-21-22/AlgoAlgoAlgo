// 성공 코드
#include <string>
#include <vector>

using namespace std;

string solution(vector<string> seoul) {
    string answer = "";

    for (int i = 0; i < seoul.size(); i++) {
        if (seoul[i] == "Kim") {
            // string 확장, 문자열 추가
            // 1. answer+="~~~";
            // 2. answer.append("~~~");
            answer += "김서방은 ";
            // 숫자를 문자열로 변환: to_string(i);
            answer += to_string(i);
            answer += "에 있다";
            break;
        }
    }

    return answer;
}