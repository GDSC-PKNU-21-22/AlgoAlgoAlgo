// ���� �ڵ�
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

// �ٸ� ����� Ǯ��
// ���ڿ��� �Ϻθ� �����ϴ� substr �Լ� �̿� ����
// ù��° ������ ��ġ�� �κ� ���ڿ��� ���̸� ���ڷ� �־�
// ù��° ������ ��ġ���� ���ڿ��� ���̸�ŭ ���ڿ��� ��ȯ�Ѵ�.
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