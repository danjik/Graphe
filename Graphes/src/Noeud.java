import java.util.ArrayList;


public class Noeud {
	int id;
	ArrayList<Arete> liens;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Arete> getLiens() {
		return liens;
	}
	public void setLiens(ArrayList<Arete> liens) {
		this.liens = liens;
	}
}
