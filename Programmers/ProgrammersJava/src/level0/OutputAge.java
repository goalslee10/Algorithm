package level0;

public class OutputAge {
	public static int solution(int age) {
        int answer = 0;
        int isBirth = 2023;
        
        if(0 < age && age <= 120){
            answer = isBirth - age;
        }
        
        return answer;
    }

	public static void main(String[] args) {

	}

}
