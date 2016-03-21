package esicadsio;

public class SommeArgent {

	private int quantite;
	private String unite;


	public SommeArgent(int amount, String currency) {
		this.quantite = amount;
		this.unite = currency;
	}

	public int getQuantite() {
		return this.quantite;
	}

	public String getUnite() {
		return this.unite;
	}

	public SommeArgent add(SommeArgent m) {
		return new SommeArgent(getQuantite()+m.getQuantite(), getUnite());
	}
}