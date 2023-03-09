package level0;

public class AverageOfArrays {
	public static double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
            answer = sum/numbers.length;
        }
        return answer;
    }

	public static void main(String[] args) {
//		int [] k = {1,2,3,4,5,6,7,8,11,13};
//		System.out.println(solution(k));
	}

}
