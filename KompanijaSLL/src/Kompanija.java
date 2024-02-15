
public class Kompanija {

	protected int id;
	protected int plata;

	public Kompanija(int id, int plata) {
		super();
		this.id = id;
		this.plata = plata;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlata() {
		return plata;
	}

	public void setPlata(int plata) {
		this.plata = plata;
	}

	@Override
	public String toString() {
		return "Kompanija [id=" + id + ", plata=" + plata + "]";
	}
	
	
}
