
// This is another sorting function
/*
 *Author: Rolando Pacho
 *Param: array list
 *
 *
 */

public class Insertion
{
	public static void sortInsertion(int[] array)
	{
		int j;		
		int temp;
		for(int i = 0; i < array.length; i++)
		{
			// put j index the same as i
			j = i;
			while ((j > 0) && (array[j] < array[j-1]))
			{
				// do the swap
				temp = array[j-1];
				array[j-1] = array[j];
				array[j] = temp;
				j--;	
			}	
		}
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
			
		System.out.println();
	}

	public static void main(String[] args)
	{
		int[] array = {37, 55, 2, 9, 14, 7, 6, 7};
		sortInsertion(array);
	}
}

