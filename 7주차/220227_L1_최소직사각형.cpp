// ���� �ڵ�
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<vector<int>> sizes) {
    int max1, max2;
    // ���� �� ���� ���̿� ���� ���̸� ������������ �����ϰ�
    for (int i = 0; i < sizes.size(); i++) {
        sort(sizes[i].begin(), sizes[i].end());
    }
    // ���� ���̿��� �ִ밪, ���� ���̿��� �ִ밪�� �����Ѵ�.
    max1 = sizes[0][0], max2 = sizes[0][1];
    for (int i = 1; i < sizes.size(); i++) {
        if (max1 < sizes[i][0]) max1 = sizes[i][0];
        if (max2 < sizes[i][1]) max2 = sizes[i][1];
    }

    return max1 * max2;
}

// �ٸ� ����� Ǯ��
#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(vector<vector<int>> sizes)
{
    int answer = 0;

    int w = 0, h = 0;
    for (int i = 0; i < sizes.size(); i++)
    {
        w = max(w, min(sizes[i][0], sizes[i][1]));
        h = max(h, max(sizes[i][0], sizes[i][1]));
    }
    answer = w * h;

    return answer;
}