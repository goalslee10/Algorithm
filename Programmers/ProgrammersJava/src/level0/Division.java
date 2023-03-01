package level0;

public class Division {
	
	public static int solution(int num1, int num2) {
        int answer = 0;
        boolean val = (0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100);
            
        if(val){
            answer = num1 / num2;
        }
        return answer;
    }

	public static void main(String[] args) {
		
		System.out.println(solution(2, 2));
		System.out.println(solution(9, 3));
	}

}
