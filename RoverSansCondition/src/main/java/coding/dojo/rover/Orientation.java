package coding.dojo.rover;

import java.util.HashMap;
import java.util.Map;

public enum Orientation {
	
	NORD, SUD, EST, OUEST;
	
	static final Map<Orientation,Orientation> pivotDroite;
	static final Map<Orientation,Orientation> pivotGauche;
	static final Map<Orientation,VecteurDeplacement> reglesDeplacement;
	static {
			pivotDroite  = new HashMap<Orientation,Orientation>();
			pivotDroite.put(Orientation.NORD, Orientation.EST);
			pivotDroite.put(Orientation.EST, Orientation.SUD);
			pivotDroite.put(Orientation.SUD, Orientation.OUEST);
			pivotDroite.put(Orientation.OUEST,Orientation.NORD);
			
			pivotGauche  = new HashMap<Orientation,Orientation>();
			pivotGauche.put(Orientation.EST, Orientation.NORD);
			pivotGauche.put(Orientation.SUD, Orientation.EST);
			pivotGauche.put(Orientation.OUEST, Orientation.SUD);
			pivotGauche.put(Orientation.NORD,Orientation.OUEST);
			
			reglesDeplacement  = new HashMap<Orientation,VecteurDeplacement>();
			reglesDeplacement.put(Orientation.EST, new VecteurDeplacement(1,0));
			reglesDeplacement.put(Orientation.SUD, new VecteurDeplacement(0,-1));
			reglesDeplacement.put(Orientation.OUEST, new VecteurDeplacement(-1,0));
			reglesDeplacement.put(Orientation.NORD, new VecteurDeplacement(0,1));
	};

}
