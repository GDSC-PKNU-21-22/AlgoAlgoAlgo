// ���� �ڵ�
#include <string>
#include <vector>

using namespace std;

string solution(vector<string> seoul) {
    string answer = "";

    for (int i = 0; i < seoul.size(); i++) {
        if (seoul[i] == "Kim") {
            // string Ȯ��, ���ڿ� �߰�
            // 1. answer+="~~~";
            // 2. answer.append("~~~");
            answer += "�輭���� ";
            // ���ڸ� ���ڿ��� ��ȯ: to_string(i);
            answer += to_string(i);
            answer += "�� �ִ�";
            break;
        }
    }

    return answer;
}