package robot;

public class Tablero {
	private int columnasX;
	private int filasX;
	
	public Tablero(int tama�oColumna, int tama�oFila) {
		this.columnasX = tama�oColumna;
		this.filasX = tama�oFila;
	}
	
	public int getFilasX() {
		return filasX;
	}

	public int getColumnasX() {
		return columnasX;
	}
}
