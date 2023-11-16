# UniqueBinaryStringChallenge
This was my solution to LeetCodes' 'Unique Binary String' challenge on November 16th, 2023
Performance (based on LeetCode's submission statistics as of ~14:00 CST):
  > Runtime: 2 ms (Beats 54.91% of users with Java)
  > Memory: 40.84 (Beats 36.73% of users with Java)

This is obviously one of the least efficient ways of going about solving the problem. I originally tried converting each value into an integer, and breaking it up into digits so that I could compare each digit to the respective digit in another number (i.e. the tens place in num1 and num2) using an xnor operation. For whatever reason, I ran into bugs specifically when the set was {'00', '01'} or {'00', '10'}, and after a long time of being frustrated with my code not working, I thought it'd be funny to implement a 'bogo sort'-esque approach and randomly generate a binary string until it generates one that doesn't match the set. At some point, it will generate a string that doesn't match the set, so it is a valid solution, though it's maybe not what the question designer(s) thought. 

Question Source: https://leetcode.com/problems/find-unique-binary-string/description/?envType=daily-question&envId=2023-11-16
