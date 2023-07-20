package org.example.lesson6;

public class Example {
    int sum(int a) {
        int res = a;
        return res;
    }
    int sum(int a, int b){
        int res = a + b;
        return res;
    }
    int sum(int a, int b, int c){
        int res = a + b + c;
        return res;
    }

    int sum(int a, int b, int c, int d) {
        int ans = d + sum(a,b,c);
        return ans;
    }
    int sum(int a, int b, int c, int d, int e) {
        int res = e + sum(a,b,c,d);
        return res;
    }
}
