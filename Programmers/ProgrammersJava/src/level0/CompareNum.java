package level0;

public class CompareNum {
	
	public static int solution(int num1, int num2) {
        int answer = 0;
        boolean val = (0 < num1 && num1 <= 10000 && 0 < num2 && num2 <= 10000);
        
        if(val){
        	// int answer = (num1 == num2) ? 1 : -1;
            if(num1==num2){
                answer = 1;
            }
            else{
                answer = -1;
            }
        }
        
        return answer;
    }

	public static void main(String[] args) {
		
		System.out.println(solution(3,3));
		System.out.println(solution(2,1));
		System.out.println(solution(8000, 10001));

	}

}
