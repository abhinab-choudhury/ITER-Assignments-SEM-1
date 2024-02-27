package HomeAssignment;

public class A1Q5 {
	public static void main(String[] args) {
		int W,G,K,A;
		W = 21;
		G = 98;
		K = 81;
		A = 9;
		System.out.println("Before Swaping(Using Third Variable):\nW = " + W + "\nG = " + G + "\nK = " + K + "\nA = " + A);

		//		int temp = W;
		//		W = G;
		//		G = K;
		//		K = A;
		//		A = temp;
		//		System.out.println("After Swaping(Using Third Variable):\nW = " + W + "\nG = " + G + "\nK = " + K + "\nA = " + A);

		W = W + G + K + A;
		G = W - (K + G + A);
		K = W - (K + G + A);
		A = W - (K + G + A);
		W = W - (K + G + A);
		System.out.println("After Swaping(Without Third Variable):\nW = " + W + "\nG = " + G + "\nK = " + K + "\nA = " + A);

	}
}
