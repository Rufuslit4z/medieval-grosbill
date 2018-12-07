package com.medievalgrosbill.game.models;

public class FirebaseGame {
	
	private Game game;
	
	private enum PhasePlateau {
		INITIALISATION,
		DEBUT,
		TOUR,
		FIN
	}
	
	private enum PhaseTour {
		DEBUT,
		PORTE,
		COMBAT,
		ENTRETIENT,
		FIN
	}
	
	private enum Combat {
		MONSTRE,
		MALEDICTION
	}
	
	private enum CombatMonstre {
		RESOLUTION,
		PIOCHE,
		FUITE
	}
	
	private enum Fuite {
		SUCCES,
		MORT
	}
}
