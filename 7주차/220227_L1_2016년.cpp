// ���� �ڵ�
#include <string>
#include <vector>

using namespace std;

string solution(int a, int b) {
    string day[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
    int month[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    for (int i = 0; i < a - 1; i++) {
        b += month[i];
    }

    return day[(b + 4) % 7]; // �ݿ����� 1�� 1�� �̹Ƿ� +4�� �Ѵ�.
}

// �ٸ� ����� Ǯ��
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