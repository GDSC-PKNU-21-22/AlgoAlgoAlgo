// 성공 코드
#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    int size = s.size();
    if (size % 2 == 0) {
        answer += s[size / 2 - 1];
        answer += s[size / 2];
    }
    else answer += s[size / 2];

    return answer;
}

// 다른 사람의 풀이
// 문자열의 일부를 리턴하는 substr 함수 이용 가능
// 첫번째 문자의 위치와 부분 문자열의 길이를 인자로 주어
// 첫번째 문자의 위치부터 문자열의 길이만큼 문자열을 반환한다.
#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    int len = s.length();
    if (len % 2 == 0) {
        return s.substr(len / 2 - 1, 2);
    }
    else {
        return s.substr(len / 2, 1);
    }
}