// ���� �ڵ�
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

// ���� �ڵ�
// sort�� compare�� �����ϴ� ����
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int k;
bool compare(string a, string b) {
    // 2��° �ε��� ���� ���Ͽ� �̸� �������� ���� ������ �����ϱ�
    if (a[k] != b[k]) return a[k] < b[k];
    // 2��° �ε��� ���� �����ϴٸ� ���� ������ �����ϱ�
    else return a < b;
}

vector<string> solution(vector<string> strings, int n) {
    k = n;
    sort(strings.begin(), strings.end(), compare);

    return strings;
}