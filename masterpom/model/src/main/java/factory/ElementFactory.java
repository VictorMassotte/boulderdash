package factory;

import factory.Element;

import motionless.Dugdirt;
import motionless.Filleddirt;
import motionless.Wall;

public class ElementFactory {

	private static final Wall wall = new Wall();

	private static final Dugdirt dugdirt = new Dugdirt();

	private static final Filleddirt filleddirt = new Filleddirt();

	private static Element[] element= {
			wall,
			dugdirt,
			filleddirt
			
	};

	public static Element createDugdirt() {
		return dugdirt;
	}

	public static Element createWall() {
		return wall;
	}

	public static Element crateFilleddirt() {
		return filleddiret;
	}

	public static Element getFromFileSymbol(char fileSymbol) {
		for(Element motionlessElement: elements ) {
			if(motionlessElement.getSprite(.getConsoleImage() == fileSymbol)) {
				return motionlessElement;
			}
		}
	}

}
