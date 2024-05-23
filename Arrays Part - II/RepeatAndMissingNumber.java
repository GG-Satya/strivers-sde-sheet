
class Solve {
    int[] findTwoElement(int arr[], int n) {

        int[] temp = new int[arr.length+1];
        int missing = -1, repeating = -1;

        for(int i : arr) {
        	temp[i]++;
        }

        for(int i=1; i<temp.length; i++) {
        	if(temp[i] == 2)repeating = i;
        	if(temp[i] == 0)missing = i;
        }

        return new int[]{repeating,missing};
    }
}