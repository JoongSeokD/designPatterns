package adapterPattern;

public class BToAAdpter implements APlayer{

	private BPlayer media;

	public BToAAdpter(BPlayer media) {
		super();
		this.media = media;
	}

	@Override
	public void play(String fileName) {
		// A�� �޼ҵ�� B�� �޼ҵ带 ȣ��
		System.out.print("Using Adapter : ");
		media.playFile(fileName);
		
	}

	@Override
	public void stop() {
		
	}
	
	
}
