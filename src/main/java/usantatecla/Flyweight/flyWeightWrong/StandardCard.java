package usantatecla.Flyweight.flyWeightWrong;

import java.util.Objects;

public class StandardCard extends Card {

	private Suit suit;
	private Value value;

	public StandardCard(Suit suit, Value value) {
		this.suit = suit;
		this.value = value;
	}

	public Suit getSuit() {
		return this.suit;
	}

	public Value getValue() {
		return this.value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(facedUp, suit, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof StandardCard)) {
			return false;
		}
		StandardCard other = (StandardCard) obj;
		return facedUp == other.facedUp && suit == other.suit && value == other.value;
	}

	@Override
	public String toString() {
		return "StandardCard [suit=" + this.suit + " and value=" + this.value + ": facedUp: " + this.facedUp + "] ("
				+ this.hashCode() + ")\n";
	}
}
