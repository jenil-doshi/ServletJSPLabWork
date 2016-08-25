package Lab1;

public class GlassVase implements Sized {
	int size;

	@Override
	public int getSize() {
		return size;
	}

	public GlassVase(int size) {
		this.size = size;
	}

}
