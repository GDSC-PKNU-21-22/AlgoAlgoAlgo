// 성공 코드
#include <string>
#include <vector>

using namespace std;

string solution(int a, int b) {
    string day[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
    int month[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    for (int i = 0; i < a - 1; i++) {
        b += month[i];
    }

    return day[(b + 4) % 7]; // 금요일이 1월 1일 이므로 +4를 한다.
}

// 다른 사람의 풀이
#include <string>
#include <vector>

using namespace std;
string days[] = { "SUN","MON","TUE","WED","THU","FRI","SAT" };
int month[] = { 31,29,31,30,31,30,31,31,30,31,30 };
string solution(int a, int b) {
    int sum = 4;
    for (int i = 0; i < a - 1; ++i)
    {
        sum += month[i];
    }
    return days[(sum + b) % 7];

}