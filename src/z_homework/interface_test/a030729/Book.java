package z_homework.interface_test.a030729;

public abstract class Book {
	private int number;
	private String title;
	private String author;
	private int conuntOfBooks = 0;

	public Book() {} // 기본처음에 알아서 생기는
	
	public Book(String title, String author) {     // new Book("메모","진영");
		//super();
		this.title = title;
		this.author = author;
		this.number = conuntOfBooks++;
	}

	public int getNumber() { // number, tltle, author 필드에 대한 getter와 setter
		return number;
	}

	public void setNumber(int number) {// number, tltle, author 필드에 대한 getter와 setter
		this.number = number;
	}

	public String getTitle() {// number, tltle, author 필드에 대한 getter와 setter
		return title;
	}

	public void setTitle(String title) {// number, tltle, author 필드에 대한 getter와 setter
		this.title = title;
	}

	public String getAuthor() {// number, tltle, author 필드에 대한 getter와 setter
		return author;
	}

	public void setAuthor(String author) {// number, tltle, author 필드에 대한 getter와 setter
		this.author = author;
	}
	
//	public boolean equals() { // 제목과 저자가 같으면 true를 반환하는 equals()메서드를 재정의
//		if(this.title.equals(getTitle()) && this.author.equals(getAuthor()){ //?? 이거 어케 쓰는거여....
//			return true;
//		}else
//		return false;
//	}

	
	public abstract int getLateFee(int lateDays) ;//String toString(): 책의 제목과 저자를 문자열로 반환한다.

	@Override
	public String toString() {//String toString():책의 제목과 저자를 문자열로 반환한다.
		return "관리번호 " + number +"번, 제목 : " + this.title + ", 작가 : " + this.author + "(일주일 연체료: " + this.getLateFee(7)
+ "원";
	}
	
	
	
}
