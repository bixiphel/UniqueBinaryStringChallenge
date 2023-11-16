class Solution {
    public String findDifferentBinaryString(String[] nums) {
        // Generates a blank return string and a sentinel value
        String answer = "";
        int x = 0;

        // Generates a random string until it isn't found in the array and returns the random string.
        do {
            String guess = randomString(nums.length);
            int count = 0; // This variable counts the number of times the guess doesn't match any of the string in the set
            for(int i = 0; i < nums.length; i++) {
                if(guess.equals(nums[i]) == false) {
                    count++;
                }
            }

            // Checks if the number of times the guess doesn't match the set is the same as the length and terminates the loop if it is
            if(count == nums.length) {
                answer = guess;
                x = 1;
            }
        } while(x != 1);
        return answer;
    }
    // Method for generating the random string
    public String randomString(int length) {
        // Generate a random string based on the length (n)
        String random = "";
        for(int i = 0; i < length; i++) {
            if(Math.random() * 5 % 1.618 > .8) {
            random = random + 1;
          } else {
            random = random + 0; 
          }
        }
        return random;
    }
}
