// ���� �ڵ�
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(string s) {
    string answer = "";
    vector<int> v;

    // �ƽ�Ű�ڵ带 10������ ��ȯ�Ͽ� v�� �ֱ�
    for (int i = 0; i < s.size(); i++) {
        v.push_back((int)s[i]);
    }
    // v�� ���ҵ��� ������������ ����
    sort(v.begin(), v.end(), greater<int>());
    // v�� 10���� ���ҵ��� �ƽ�Ű �ڵ�� ��ȯ�Ͽ� answer�� �߰�
    for (int i = 0; i < v.size(); i++) {
        answer += (char)v[i];
    }

    return answer;
}

// �ٸ� ����� Ǯ��
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(string s) {
    sort(s.begin(), s.end(), greater<char>());

    return s;
}