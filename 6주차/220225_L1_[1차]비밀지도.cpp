// ���� �ڵ�
#include <string>
#include <vector>

using namespace std;
// ������ ����� ��Ÿ���� �������� sizee ����
int sizee;

// 10������ 2������ �ٲٴ� �������� 1�� "#"���� 0�� "0"���� ��ȯ�ϴ� �Լ�
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
    // �� ���� ���� �� �ϳ��� 1�̸� 1�̹Ƿ� ��Ʈ OR �����ڸ� ���
    for (int i = 0; i < sizee; i++) {
        answer.push_back(bin(arr1[i] | arr2[i]));
    }

    return answer;
}

// �ٸ� ����� Ǯ��
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