// �ð��ʰ� �ڵ�
#include <string>

using namespace std;

int solution(int n) {
    int answer = 1, i, k, flag;

    for (i = 3; i <= n; i++) {
        flag = 1;
        for (k = 2; k < i; k++) {
            if (i % k == 0) {
                flag = 0;
                break;
            }
        }
        if (flag) answer++;
    }

    return answer;
}

// �ð��ʰ� �ڵ�
#include <string>
#include <cmath>

using namespace std;

int solution(int n) {
    int answer = 1, i, k, flag;

    for (i = 3; i <= n; i++) {
        flag = 1;
        for (k = 2; k <= sqrt(i); k++) {
            if (i % k == 0) {
                flag = 0;
                break;
            }
        }
        if (flag) answer++;
    }

    return answer;
}

// ���� �ڵ�

// �����佺�׳׽��� ü�� �̿�
// ����: �Ҽ��� ����� ������ 1�� ���� 1�� ������ ���� ����� �Ǵ� ���� �Ҽ��� �ƴϴ�.
// ���: ������ �� n������ �Ҽ��� ���ϰ��� �� �� 2���� n�� �����ٱ��� ���� ��� ������� �Ҽ����� ���ܽ�Ű�� ����̴�.
// �ð����⵵: Ư���� ������ �����ٱ����� ����� ���θ� �����ϹǷ� O(N^1/2)

#include <string>
#include <vector>
#include <cmath>

using namespace std;

int solution(int n) {
    int answer = 0, i, j, flag;
    
    // �迭�� �����Ͽ� 1�� �ʱ�ȭ�Ѵ�.
    vector<int> v(n + 1, 1);

    // 2���� �����ؼ� Ư�� ���� ����� �ش�Ǵ� ���� ��� �����.
    // (���� �� �ڱ� �ڽ��� ������ �ʰ�, �̹� ������ ���� �ǳʶڴ�.)
    for (i = 2; i <= sqrt(n); i++) {
        if (v[i] == 0) continue; // �̹� ������ ����� �ǳʶٱ�

        // �̹� ������ ���ڰ� �ƴ϶��, �� ������� ����Ͽ� ������ ��� ���� �����
        for (j = 2 * i; j <= n; j += i) {
            v[j] = 0;
        }
    }

    // 2���� �����Ͽ� �����ִ� ���� ��� ����Ѵ�.
    for (i = 2; i <= n; i++) {
        if (v[i] != 0) answer++;
    }

    return answer;
}

// ����: https://velog.io/@max9106/Algorithm-%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98-%EC%B2%B4