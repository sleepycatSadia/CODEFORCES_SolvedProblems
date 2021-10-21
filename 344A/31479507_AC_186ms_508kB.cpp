 #include<bits/stdc++.h>

using namespace std;
  
int countFreq(string &pat, string &txt)
{
    int M = pat.length();
    int N = txt.length();
    int res = 0;
   
    
    for (int i = 0; i <= N - M; i++)
    {
        
        int j;
        for (j = 0; j < M; j++)
            if (txt[i+j] != pat[j])
                break;
  
       
        if (j == M) 
        {
           res++;
           j = 0;
        }
    }
    return res;
}
   

int main()
{
	int t;
	cin>>t;
	string s="";
	
	for(int y=1;y<=t;y++){
		string str;
		cin>>str;
		s.append(str);
	}
 
   string m="00";
   string n="11";
   int a=countFreq(m, s);
   int b=countFreq(n, s);
   int r=1+a+b;
   cout << r;
   return 0;
}