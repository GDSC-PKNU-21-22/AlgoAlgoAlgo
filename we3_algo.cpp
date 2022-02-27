// 서울에서 김서방 찾기
#include <string>
#include <vector>

using namespace std;

string solution(vector<string> seoul) {
    string answer = "";
    
    for(int i=0; i<seoul.size(); i++){
        if(seoul[i]=="Kim"){
            answer= "김서방은 "+to_string(i)+"에 있다";
            break;
        }
    }
    
    return answer;
}

//문자열 다루기 기본
#include <string>
#include <vector>

using namespace std;

bool solution(string s) {
    bool answer = true;
    int i;
    
    if(s.size() != 4 && s.size() != 6) {
        answer = false;
        return answer;
    }
    
    for(i = 0; i < s.size(); i++) {
        if(!(s[i] >= '0' && s[i] <= '9'))
        {
            return false;
        }
    }
    return answer;
}
// 문자열 내림차순으로 배치하기
#include <string>
#include <vector>
#include <algorithm>
 
using namespace std;
 
string solution(string s) {
    string answer = s;
    sort(answer.begin(),answer.end(),greater<char>());
    return answer;
}

// 문자열 내 p와 y의 개수
#include <string>
#include <iostream>
using namespace std;

bool solution(string s)
{
    bool answer = true;
    int i, p = 0, y = 0;

    for(i = 0; i < s.size(); i++) {
        if(s[i] == 'p' || s[i] == 'P') {
            p++;
        } else if(s[i] == 'y' || s[i] == 'Y') {
            y++;
        }
    }
    
    if(p != y) {
        answer = false;
    }

    return answer;
}

//문자열 내 마음대로 정렬하기
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int N;
bool cmp(string a, string b){
    if(a[N] == b[N]){
        return a < b;
    }
    else{
        return a[N] < b[N];
    }
}

vector<string> solution(vector<string> strings, int n) {
    N=n;
    sort(strings.begin(), strings.end(), cmp);
    return strings;
}

// 두 정수 사이의 합
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

long long solution(int a, int b) {
    long long answer = 0;
    if(a > b) for(int i = b; i <= a; i++) answer += i;
    else for(int i = a; i <= b; i++) answer += i;
    return answer;
}