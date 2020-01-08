package adapterPattern;

public class BToAAdpter implements APlayer{

	private BPlayer media;

	public BToAAdpter(BPlayer media) {
		super();
		this.media = media;
	}

	@Override
	public void play(String fileName) {
		// A의 메소드로 B의 메소드를 호출
		System.out.print("Using Adapter : ");
		media.playFile(fileName);
		
	}

	@Override
	public void stop() {
		
	}
	
	
}
