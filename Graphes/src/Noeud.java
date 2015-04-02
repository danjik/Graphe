import java.awt.List;
import java.util.ArrayList;


public class Noeud {
	
	int id;
	ArrayList<Arete> liens ;
	
	public Noeud() {
		liens = new ArrayList<Arete>();
	}
	public void addArete(Arete toAdd){
		liens.add(toAdd);
	}
	public ArrayList<Arete> getSuccesseurs(){
		ArrayList<Arete> toReturn = new ArrayList<Arete>();
		for(int i=0;i<liens.size();i++){
			if(liens.get(i).getNoeudDebut()==this){
				toReturn.add(liens.get(i));
			}
		}
		return toReturn;
	}
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
	public static void main(String[] args){
		Noeud t1=new Noeud();
		System.out.println(t1.getSuccesseurs());
		Noeud t2=new Noeud();
		Arete a1=new Arete(t1,t2);
		System.out.println(t1.getSuccesseurs().get(0).getNoeudFin());
	}
	@Override
	public String toString() {
		return "Noeud [id=" + id + ", liens=" + liens + "]";
	}
}
