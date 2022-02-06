// ���� �ڵ�
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

// �ٸ� ����� Ǯ��
#include <string>
#include <vector>

using namespace std;

bool solution(string s) {
    bool answer = true;

    if (s.size() != 4 && s.size() != 6) answer = false;
    else {
        for (int i = 0; i < s.size(); i++) {
            // ���� �Ǵ� �Լ�
            // int isdigit(int c);
            // ���ڸ� 0�� �ƴ� ����, ���ڰ� �ƴϸ� 0�� ���ѵ�
            if (!isdigit(s[i])) {
                answer = false;
                break;
            }
        }
    }

    return answer;
}