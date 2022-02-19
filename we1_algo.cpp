// 최대공약수와 최소공배수
#include <string>
#include <vector>

using namespace std;

vector<int> solution(int n, int m) {
    cin<<n<<m;
    min=n
    vector<int> answer;
    answer[]
    return answer;
}

//제일 작은 수 제거하기
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> answer;
    
    if(arr.size() == 1)
    {
        answer.push_back(-1);
        return answer;
    }
    
    arr.erase(min_element(arr.begin(), arr.end()));
    answer = arr;
    return answer;
}

// 정수 제곱근 판별
#include <string>
#include <vector>

using namespace std;

long long solution(long long n) {
    long long answer = 0;
    return answer;
}

//정수 내림차순으로 배치하기
#include <string>
#include <vector>

using namespace std;

long long solution(long long n) {
    long long answer = 0;
    return answer;
}

//자연수 뒤집어 배열로 만들기
#include <string>
#include <vector>

using namespace std;

vector<int> solution(long long n) {
    vector<int> answer;
    int tmp;
    while(n>0){
        tmp=n%10;
        answer.push_back(n%10);
        n=n/10;
    }
    return answer;
}

//자릿수 더하기
#include <iostream>

using namespace std;
int solution(int n)
{
    int answer = 0 ;
    while(n>0){
        answer+=n%10;
        n/=10; 
    }    
    return answer;
}