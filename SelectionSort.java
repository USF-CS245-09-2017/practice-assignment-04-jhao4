class SelectionSort implements SortingAlgorithm
{
	@Override
	public void sort(int [] a)
	{
		for(int i = 0; i < a.length - 1; i++)
		{
			int mid = i;
			for(int j = i + 1; j < a.length; j++)
			{
				if(a[j] < a[mid])
				{
					mid = j;
				} //if
			} //for
			int temp = a[mid];
			a[mid] = a[i];
			a[i] = temp;
		} //for
		return a;
	} //sort
} //SelectionSort