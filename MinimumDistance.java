import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int A[] = new int[n];
		for (int A_i = 0; A_i < n; A_i++) {
			A[A_i] = in.nextInt();
		}
		HashMap<Integer, Integer> pairMap = new HashMap<>();
		HashMap<Integer, Integer> unPairMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (!unPairMap.containsKey(A[i])) {
				unPairMap.put(A[i], i);
				pairMap.put(A[i], 0);
			} else {
				int value = unPairMap.get(A[i]);
				value = i - value;
				unPairMap.put(A[i], i);
				int dist = pairMap.get(A[i]);
				pairMap.put(A[i], dist + value);

			}
		}
		Iterator it = pairMap.entrySet().iterator();
		int min = Integer.MAX_VALUE;
		while (it.hasNext()) {
			// Map.Entry pair = (Map.Entry)it.next();
			Map.Entry pair = (Map.Entry) it.next();
			// System.out.println(pair.getKey() + " = " + pair.getValue());

			if ((Integer) pair.getValue() != 0) {
				if ((Integer) pair.getValue() < min) {
					min = (Integer) pair.getValue();
				}
			}
		}
		if(min==Integer.MAX_VALUE)
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(min);
		}

	}
}
