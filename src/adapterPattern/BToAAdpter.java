package adapterPattern;

public class BToAAdpter extends BPlayerImpl implements APlayer{


	@Override
	public void play(String fileName) {
		// A의 메소드로 B의 메소드를 호출
		System.out.print("Using Adapter : ");
		playFile(fileName);
		
	}

	@Override
	public void stop() {
		
	}
	
	
}
