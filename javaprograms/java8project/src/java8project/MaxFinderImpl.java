package java8project;

public class MaxFinderImpl implements MaxFinder {

	@Override
	public int findMax(int num1, int num2) {
		int max = num1>num2 ? num1 : num2;
		return max;
	}

}
