// ���� �ڵ�
#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr)
{
    vector<int> answer;
    int idx = 0;
    answer.push_back(arr[0]); // answer�� arr�� ù��° ���� �ֱ�

    for (int i = 1; i < arr.size(); i++) {
        if (answer[idx] != arr[i]) { // arr�� ���ҵ�� answer�� ������ ���� ���� ���ϸ� ���� �ٸ��� �ش� arr ���� �ֱ�
            answer.push_back(arr[i]);
            idx++; // answer�� ������ ���Ҹ� ����Ű�� ���� idx�� �� �ϳ� ����
        }
    }

    return answer;
}

// �ٸ� ����� Ǯ��
// vector���� �ߺ� ���� ���� �� unique �Լ��� �̿�
// sort�� unique ����� ���� include algorithm �߰�
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

vector<int> solution(vector<int> arr)
{
    // unique�� ���ӵ� �ߺ� ���Ҹ� vector�� ���� �޺κ����� �����Ⱚ���� ������.
    // sort�� �̿��Ͽ� vector�� ������ �� unique �غ��� Ȯ�� ����
    // erase�� �ڿ� ���� ������ ���� ����
    // unique�� ������ ��ȯ�Ǵ� ���� vector�� ������ ���� ù��° ��ġ�� �ǹǷ� erase ����
    arr.erase(unique(arr.begin(), arr.end()), arr.end());

    vector<int> answer = arr;
    return answer;
}