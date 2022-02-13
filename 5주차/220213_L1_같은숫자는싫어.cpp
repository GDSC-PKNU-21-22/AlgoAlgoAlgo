// 성공 코드
#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr)
{
    vector<int> answer;
    int idx = 0;
    answer.push_back(arr[0]); // answer에 arr의 첫번째 원소 넣기

    for (int i = 1; i < arr.size(); i++) {
        if (answer[idx] != arr[i]) { // arr의 원소들과 answer의 마지막 원소 값을 비교하며 값이 다르면 해당 arr 값을 넣기
            answer.push_back(arr[i]);
            idx++; // answer의 마지막 원소를 가리키기 위해 idx의 값 하나 증가
        }
    }

    return answer;
}

// 다른 사람의 풀이
// vector에서 중복 원소 제거 시 unique 함수를 이용
// sort와 unique 사용을 위해 include algorithm 추가
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

vector<int> solution(vector<int> arr)
{
    // unique는 연속된 중복 원소를 vector의 제일 뒷부분으로 쓰레기값으로 보낸다.
    // sort를 이용하여 vector를 정렬한 뒤 unique 해보면 확인 가능
    // erase로 뒤에 붙은 쓰레기 값을 제거
    // unique가 끝나면 반환되는 값은 vector의 쓰레기 값의 첫번째 위치가 되므로 erase 가능
    arr.erase(unique(arr.begin(), arr.end()), arr.end());

    vector<int> answer = arr;
    return answer;
}