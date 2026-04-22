class Solution {
public:
    vector<string> twoEditWords(vector<string>& queries, vector<string>& dictionary) {
        vector<string> res;
        for (int i = 0; i < queries.size(); i++) {
            string current_q = queries[i];
            for (int j = 0; j < dictionary.size(); j++) {
                string current_d = dictionary[j];
                int cnt = 0;
                for (int k = 0; k < current_q.length(); k++) {
                    if (current_q[k] != current_d[k]) {
                        cnt++;
                        if (cnt > 2) break;
                    }
                }
                if (cnt <= 2) {
                    res.push_back(current_q);
                    break;
                }
            }
        }
        return res;
    }
};