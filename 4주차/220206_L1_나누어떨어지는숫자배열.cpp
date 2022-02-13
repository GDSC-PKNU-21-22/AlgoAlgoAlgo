// 성공 코드
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr, int divisor) {
    vector<int> answer;

    for (int i = 0; i < arr.size(); i++) {
        if (arr[i] % divisor == 0) answer.push_back(arr[i]);
    }
    if (answer.size() > 0) sort(answer.begin(), answer.end());
    else answer.push_back(-1);

    return answer;
}

// 다른 사람의 풀이
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> solution(vector<int> arr, int divisor) {
    vector<int> answer;
    for (int i = 0; i < arr.size(); i++) {
        if (arr[i] % divisor == 0) answer.push_back(arr[i]);
    }
    // !연산자 활용하기
    if (!answer.size()) answer.push_back(-1);
    sort(answer.begin(), answer.end());
    return answer;
}