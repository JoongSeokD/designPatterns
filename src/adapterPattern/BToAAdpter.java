package adapterPattern;

public class BToAAdpter extends BPlayerImpl implements APlayer{


	@Override
	public void play(String fileName) {
		// A�� �޼ҵ�� B�� �޼ҵ带 ȣ��
		System.out.print("Using Adapter : ");
		playFile(fileName);
		
	}

	@Override
	public void stop() {
		
	}
	
	
}
