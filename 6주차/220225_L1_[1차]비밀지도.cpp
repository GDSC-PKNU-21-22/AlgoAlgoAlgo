// 성공 코드
#include <string>
#include <vector>

using namespace std;
// 지도의 사이즈를 나타내는 전역변수 sizee 선언
int sizee;

// 10진수를 2진수로 바꾸는 과정으로 1은 "#"으로 0은 "0"으로 변환하는 함수
string bin(int n) {
    string res;
    for (int i = 0; i < sizee; i++) {
        res += " ";
    }
    int cnt = sizee - 1;
    while (n != 0) {
        if (n % 2 == 1) res[cnt] = '#';
        cnt--;
        n /= 2;
    }

    return res;
}

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer, a1, a2;
    sizee = arr1.size();
    // 두 장의 지도 중 하나라도 1이면 1이므로 비트 OR 연산자를 사용
    for (int i = 0; i < sizee; i++) {
        answer.push_back(bin(arr1[i] | arr2[i]));
    }

    return answer;
}

// 다른 사람의 풀이
#include <string>
#include <vector>

using namespace std;

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer;
    for (int i = 0; i < n; i++) {
        arr1[i] = arr1[i] | arr2[i];
        string ans = "";
        for (int j = 0; j < n; j++) {
            if (arr1[i] % 2 == 0) ans = " " + ans;
            else ans = "#" + ans;
            arr1[i] = arr1[i] >> 1;
        }
        answer.push_back(ans);
    }
    return answer;
}