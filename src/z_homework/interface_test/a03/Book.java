package z_homework.interface_test.a03;

public abstract class Book {
	private int number; // 관리번호
	private String title, author; // 책 제목 및 저자
	private static int countOfBooks = 0; // 만들어진 book의 개수/ = 0; 선언과 동시에 0으로 초기화함
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.number = ++countOfBooks; // 생성자 일단 번호를 주고 ++하겠다는 의미 ! 증가!!! 우선 주고나서!
	}								  // 1부터 시작하려고 ++를 앞으로 옮김! 위에서 0으로 초기화함

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public abstract int getLateFee(int a);
	
	@Override // 모든클래스는 오브젝트가 될수 있고 그 오브젝트는 모든 클래스가 될 수 있다
	public boolean equals(Object o) { //Object 전체라는거 //
		Book b = (Book)o; // 오브젝트 o를  (Book)으로 바꾸고/ 오브젝트 o라는 객체를 book으로 만들고
		if(this.title.equals(b.getTitle())&&this.author.equals(b.getAuthor())){ //this.author 이책의 저자가 (b.getAuthor()) 파라미터로 받은 그 북저자와 equals같냐???? 
		//this 는 나의/title 제목이 / equals같니?/ 뭐랑?(b.getTitle()) < 이 파라미터 값으로 오는거랑??
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public String toString() {
		return "관리번호 " + this.number + "번, 제목 : " + this.title + ", 저자 : " + this.author
				//+ "(일주일 연체료: " + String.format("%,d원)", this.getLateFee(7));
			    + "(일주일 연체료: " + String.format("%,d", this.getLateFee(7))+"원)";
			     // 이거 2개 가 같은 의미임!!!!! 결과는 같음 하나는 포맷 안에 넣었고 하나는 포맷 밖으로!
	}
	
	
	@Override
	public int hashCode() { // 이건 왜있는지 모르겠다고 쌤이 그러심
		return 0;
	}
	
	
}
