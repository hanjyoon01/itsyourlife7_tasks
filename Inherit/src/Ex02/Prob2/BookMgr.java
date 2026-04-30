package Ex02.Prob2;

public class BookMgr {

	private	Book[] Booklist;

	public BookMgr(Book[] booklist) {
		this.Booklist = booklist;
	}
	
	public void printBooklist(){
		for(int i=0;i<Booklist.length;i++){
			System.out.println(Booklist[i].getTitle());
		}
	}
	
	public void printTotalPrice(){
		int sum = 0;
		for(int i=0;i<Booklist.length;i++){
			sum+=Booklist[i].getPrice();
		}

		System.out.println("전체 책 가격의 합 : " + sum);
	}
}
