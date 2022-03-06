// 성공 코드
#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int i = 2;

    while (i < n) {
        if (n % i == 1) return i;
        i++;
    }
}