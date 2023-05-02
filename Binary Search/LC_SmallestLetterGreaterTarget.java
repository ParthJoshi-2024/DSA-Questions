public class SmallestLetterGreaterTarget_LC {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
    }
        public static char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length-1;
            while(start<=end){
                if(target > letters[letters.length-1]){
                    return letters[0];
                }
                int mid = (start + end) / 2;
                if(target<letters[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
               
            }
            return letters[start % letters.length];
        }
        
    }