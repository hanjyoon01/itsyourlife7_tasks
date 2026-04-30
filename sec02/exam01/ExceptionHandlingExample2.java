package day06.ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
        int result = 0;
        try {
            result = data.length();
        } catch (NullPointerException e) {
			System.out.println("널 값이어서 길이를 셀 수 없어요!");
         } catch (Exception e) {
			System.out.println("Exception 클래스에서 예외를 잡았어요");
		} catch (Throwable e) {
			System.out.println("Throwable 클래스에서 예외를 잡았어요");
		}
		finally {
			System.out.println("항상 난 실행되는 문장이예요");
        }
        System.out.println("문자수: " + result);

	}
	
	public static void main(String[] args) {
//		System.out.println("[프로그램 시작]\n");
		//printLength("ThisIsJava");
		printLength(null);
		//System.out.println("[프로그램 종료]");
	}
}


