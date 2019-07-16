#include <bits/stdc++.h>

using namespace std;

// Complete the isValid function below.
string isValid(string s) {
    int arr[26] = {0};
    int letter;
    int occur = -1;
    bool removed = false;
    for(int i; i<s.length(); i++) {
        letter = (int)s.at(i);
        arr[letter-97]++;
    }
    for(int i; i<26; i++) {
        cout << arr[i] << endl;
        cout << "occur begin: " << occur << endl;
        if(arr[i] == 0) {
            cout << "test1" << endl;
            continue;
        }
        else if(occur == -1) {
            cout << "test2" << endl;
            occur = arr[i];
            cout << "occur: " << occur << endl;
            continue;
        }
        else if(arr[i] == occur) {
            cout << "test3" << endl;
            continue;
        }
        else if(removed == false && (arr[i]-1 == occur || arr[i] + 1 == occur)) {
            cout << "test4" << endl;
            removed = true;
            continue;
        }
        else {
            return "NO";
        }
    }
    return "YES";
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    string result = isValid(s);

    fout << result << "\n";
    cout << result << endl;

    fout.close();

    return 0;
}

