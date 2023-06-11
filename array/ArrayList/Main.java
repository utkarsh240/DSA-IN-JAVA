/*Geek has developed an effective vaccine for Corona virus and he wants each of the N houses in Geek Land to have access to it. Given a binary tree where each node represents a house in Geek Land, find the minimum number of houses that should be supplied with the vaccine kit if one vaccine kit is sufficient for that house, its parent house and it's immediate child nodes.  

 

Example 1:

Input:
    1
   / \
  2   3 
        \
         4
          \
           5
            \
             6

Output: 2
Explanation: The vaccine kits should be 
supplied to house numbers 1 and 5. 

Example 2:

Input:
    1
   / \
  2   3 

Output: 1
Explanation: The vaccine kits should be 
supplied to house number 1.

Your Task:
You dont need to read input or print anything. Complete the function supplyVaccine() which takes the root of the housing tree as input parameter and returns the minimum number of houses that should be supplied with the vaccine kit.


Constraints:
1 <= N <= 10^3 */

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}

class Solution {
    public static int supplyVaccine(Node root) {
        // Your code goes here
        int[] ans = new int[2];
        ans = solve(root);
        return ans[0];
    }

    public static int[] solve(Node root) {
        if (root == null) {
            int[] ans = new int[2];
            ans[0] = 0;
            ans[1] = 0;
            return ans;
        }
        int[] left = solve(root.left);
        int[] right = solve(root.right);
        int[] ans = new int[2];
        ans[0] = 1 + Math.min(left[0], Math.min(left[1], right[1]));
        ans[1] = Math.min(left[0], left[1]) + Math.min(right[0], right[1]);
        return ans;
    }
}

