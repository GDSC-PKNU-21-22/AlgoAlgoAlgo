// 성공 코드
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(string s) {
    string answer = "";
    vector<int> v;

    // 아스키코드를 10진수로 변환하여 v에 넣기
    for (int i = 0; i < s.size(); i++) {
        v.push_back((int)s[i]);
    }
    // v의 원소들을 내림차순으로 정렬
    sort(v.begin(), v.end(), greater<int>());
    // v의 10진수 원소들을 아스키 코드로 변환하여 answer에 추가
    for (int i = 0; i < v.size(); i++) {
        answer += (char)v[i];
    }

    return answer;
}

// 다른 사람의 풀이
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(string s) {
    sort(s.begin(), s.end(), greater<char>());

    return s;
}