package z_homework.jh0730_2;

public interface Talkable {
	//public abstract void talk();
	void talk();
	default void talkable() {
		System.out.println("말한다");
	}
	
	
}
