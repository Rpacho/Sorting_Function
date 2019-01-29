public class Selection
{
    /*
    * This selection sort will look for the smallest value inside the array
    * and put it at the right first index. Then previous value of first index
    * will be place at the smallest value where we took it.
    * then repeat until all value is all sorted
    * Parameter: the array that we will be sorting out.
    */
    public static void selectionSort(int[] array)
    {   
        // trace where the small value located
        int smallIndex = 0;
        // Place holder when doing a swap
        int temp;


        for (int i = 0; i < array.length - 1; i++)
        {
            smallIndex = i;

            for (int j = i + 1; j < array.length; j++)
            {   
                // i > j || if this is true then do swap
                if (array[smallIndex] > array[j]){
                    smallIndex = j;

                }
            //System.out.print(smallIndex + " ");
            }
            temp = array[i];
            array[i] = array[smallIndex];
            array[smallIndex] = temp;
            
        }
        for (int x = 0; x < array.length; x++)
        {
            System.out.print(array[x] + " ");
        }
        
    }

    public static void main(String[] args)
    {

        int[] array = {4, 5, 2, 7, 1, 2, 8, 10, 9};
        selectionSort(array);

    }
}