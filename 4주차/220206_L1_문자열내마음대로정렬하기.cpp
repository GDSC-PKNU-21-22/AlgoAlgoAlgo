// 실패 코드
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<string> solution(vector<string> strings, int n) {
    vector<string> answer;
    vector<char> k;
    for (int i = 0; i < strings.size(); i++) {
        k.push_back(strings[i][n]);
    }
    sort(strings.begin(), strings.end());
    sort(k.begin(), k.end());
    for (int i = 0; i < k.size(); i++) {
        for (int j = 0; j < strings.size(); j++) {
            if (k[i] == strings[j][n]) {
                answer.push_back(strings[j]);
                strings.erase(strings.begin() + j);
            }
        }
    }

    return answer;
}

// 성공 코드
// sort와 compare를 연습하는 문제
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int k;
bool compare(string a, string b) {
    // 2번째 인덱스 값을 비교하여 이를 기준으로 사전 순으로 정렬하기
    if (a[k] != b[k]) return a[k] < b[k];
    // 2번째 인덱스 값이 동일하다면 사전 순으로 정렬하기
    else return a < b;
}

vector<string> solution(vector<string> strings, int n) {
    k = n;
    sort(strings.begin(), strings.end(), compare);

    return strings;
}