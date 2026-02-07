package com.code.entity;

public class Main5 {

    public static void main(String[] args){
        String s = "abcabcdefab";
      int n = s.length();
      boolean[] visited = new boolean[256];  // ASCII

      int start = 0;
      int maxLen = 0;
      int baseStart = 0;

              for(int end = 0; end < n; end++){
                  char current = s.charAt(end);

                  while (visited[current]){
                      visited[s.charAt(start) ] =false;
                      start ++;
                  }


                  visited[current] = true;
                  int currLen = end - start+1;

                  if(currLen > maxLen){
                      maxLen = currLen;
                      baseStart = start;
                  }
              }

              System.out.print("Longest Non-Repting");
              for(int i = baseStart; i<baseStart + maxLen; i++){
                  System.out.print(s.charAt(i));
              }

        System.out.println("\nLength " + maxLen);
    }
}
