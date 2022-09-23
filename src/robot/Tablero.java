package robot;

public class Tablero {
	private int columnasX;
	private int filasX;
	
	public Tablero(int tamañoColumna, int tamañoFila) {
		this.columnasX = tamañoColumna;
		this.filasX = tamañoFila;
	}
	
	public int getFilasX() {
		return filasX;
	}

	public int getColumnasX() {
		return columnasX;
	}
}
