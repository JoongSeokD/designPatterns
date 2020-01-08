package adapterPattern;

public class BPlayerImpl extends BPlayer{

	@Override
	public void stop() {
	}

	@Override
	public void playFile(String fileName) {
		System.out.println("(B)" + fileName);
		
	}

}
