/* MEMO
 * 객체를 배열에 담기
 */
package _02_Java_Constructor;

public class Constructor_04 {
	public static void main(String[] args) {
		
		Song song1 = new Song("비상", "임재범");
		Song song2 = new Song("모래알갱이", "임영웅");
		Song song3 = new Song("가을 우체국 앞에서", "윤도현");
		
		// 객체를 배열에 저장
		Song[] songs = {song1, song2, song3};
		
		// for
		for (int i = 0; i < songs.length; i++) {
			System.out.println(songs[i].toString());
		}
		
		// for each
		for (Song song : songs) {
			System.out.println(song.toString());
		}
	}
}

class Song {
	
	String name;
	String singer;
	
	public Song() {
		
	}
	
	public Song(String name, String singer) {
		super();
		this.name = name;
		this.singer =singer;
	}

	@Override
	public String toString() {
		return "Song [name=" + name + ", singer=" + singer + "]";
	}
}