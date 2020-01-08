package adapterPattern;

public class BPlayerImpl implements BPlayer{

	@Override
	public void stop() {
	}

	@Override
	public void playFile(String fileName) {
		System.out.println("(B)" + fileName);
		
	}

}
