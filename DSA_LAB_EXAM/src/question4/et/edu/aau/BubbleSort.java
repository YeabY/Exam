package question4.et.edu.aau;

public class BubbleSort {
    public void bubbleSort(char[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                	char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        for(char i: array) {
        	System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
    	BubbleSort bs = new BubbleSort();
    	char array[] = {'c','d','a'};
    	bs.bubbleSort(array);
    	
    }
}


