// 이상한 문자 만들기
#include <string>

using namespace std;

string solution(string s) {
    int idx = 0;
    
    for(int i=0; i<s.size(); i++){
        
        if(s[i] == ' '){
            idx=0;
            continue; 
        }
        
        if(idx%2){
            if(s[i] <= 'Z') s[i]+=32;
        }
        else{
            if(s[i] >= 'a') s[i]-=32;  
        }
        idx++;
    }
    
    return s;
}

//약수의 합
#include <string>
#include <vector>
#include <math.h>
using namespace std;

int solution(int n) {
    int answer = 0;
    for (int i = 1; i <= n; i++) { 
        if (n % i == 0) { 
            answer+=i;
        } 
    }
    return answer;
}

//시저 암호
#include <string>

using namespace std;

string solution(string s, int n) {
    string answer = "";
    for( int i = 0 ; i < s.length() ; i++){
        if ( s[i] == ' '){
            answer += s[i];
        }
        else {
            int start = (s[i] >= 'a')? 'a' : 'A';
            answer += start + (s[i]-start + n)%26;
        }
    }
    return answer;
}

// 문자열을 정수로 바꾸기
#include <string>
#include <vector>

using namespace std;

int solution(string s) {
    int answer = 0;
    answer=stoi(s);
    return answer;
}

// 수박수박수박수박수박수?
#include <string>
#include <vector>

using namespace std;

string solution(int n) {
    string answer = "";
    for(int idx=0;idx<n;++idx){
        if(idx%2==0) answer+="수";
        else answer+="박";
    }
    return answer;
}

//소수 찾기
#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    vector<bool> tmp(n+1, true);

    for (int i=2; i<n+1; i++) {
        if (tmp[i] == true) {
            for (int j=2; i*j<n+1; j++) tmp[i*j] = false;
            answer++;
        }
    }

    return answer;
}