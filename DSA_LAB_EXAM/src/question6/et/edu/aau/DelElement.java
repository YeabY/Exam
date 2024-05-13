package question6.et.edu.aau;

public class DelElement {
    public static int[] deleteElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index.");
            return array;
        }
        
        int[] newArray = new int[array.length - 1];
        int newIndex = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }
        return newArray;
    }
    
    public static void main(String[] args) {
    	int[] array = {2,3,4,5};
    	
    	int index = 2;
    	
    	int[] newArr = DelElement.deleteElement(array, index);
    	
    	for(int i: newArr) {
    		System.out.print(i+" ");
    		
    	}
    }
}


