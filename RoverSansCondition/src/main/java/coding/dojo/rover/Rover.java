package coding.dojo.rover;

public class Rover {
	Point position;
	Orientation orientation;
	
	
	Rover(){
		this.position = new Point(0,0);
		orientation = Orientation.NORD;
	}
	
	Rover(int x, int y, Orientation orientation){
		Point position = new Point(x, y);
		this.position = position;
		this.orientation = orientation;
	}
	
	void pivoterDroite(){
		orientation = Orientation.pivotDroite.get(orientation);
	}
	
	void pivoterGauche(){
		orientation = Orientation.pivotGauche.get(orientation);
	}
	
	private void deplacer(int k){
		VecteurDeplacement vecteur = Orientation.reglesDeplacement.get(orientation);
		position.x += k*vecteur.deplacementSurX;
		position.y += k*vecteur.deplacementSurY;
	}
	
	void avancer(int nbDeCases){
		deplacer(nbDeCases);
	}

	public void reculer(int nbDeCases) {
		deplacer(-nbDeCases);
		
	}
	

}
