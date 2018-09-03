package com.tarni.kafka.streams.KafkaStreamsDemo;

public interface MyStringLambda {

	String myStringFunction(String str);

	public static void main(String args[]) {
		// Block lambda to reverse string
		MyStringLambda reverseStr = (str) -> {
			String result = "";

			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);

			return result;
		};

		MyStringLambda upperCaseStr = (str) -> {
			String result = "";
			result = str.toUpperCase();
			return result;
		};
		
		System.out.println(reverseStr.hashCode());
		System.out.println(upperCaseStr.hashCode());
		// Output: omeD adbmaL
		System.out.println(reverseStr.myStringFunction("Lambda Demo"));
		System.out.println(upperCaseStr.myStringFunction("tarnisharma"));
	}
}
