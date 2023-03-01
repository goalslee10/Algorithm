package level0;

public class Protractor {
	
	public static int solution(int angle) {
        int answer = 0;
        boolean val = (0 < angle && angle <= 180);
        
        if(val){
            if(0 < angle && angle < 90){
                answer = 1;
            }else if (angle == 90){
                answer = 2;
            }else if (90 < angle && angle < 180){
                answer = 3;
            }else{
                answer = 4;
            }
        }
        
        return answer;
    }

	public static void main(String[] args) {
		

	}

}
