package no.hvl.dat102;

public class BS_Tre <T extends Comparable<? super T>> extends BinaerTre<T> 
implements SoeketreADT<T>{
	BS_Tre(){
		super();
	}
	
	BS_Tre(T rotElement){
		super(rotElement, null, null);
	}
	
	@Override
	public void setTre(T rotData) {
		// Vi ønskjer ikkje at denne metoden skal være tilgjengeleg
		// Ville i så fall være mulig å øydelegge det binære søketreet
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void setTre(T rotData, BinaerTre<T> venstre, BinaerTre<T> hogre) {
		// Vi ønskjer ikkje at denne metoden skal være tilgjengeleg
		// Ville i så fall være mulig å øydelegge det binære søketreet
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean inneholder(T element) {
		return finn(element) != null;
	}

	@Override
	public T finn(T element) {
		return finn(element, );
	}
	
	@Override
	private T finn(T element, BinaerTreNode<T> p) {
		T svar = null;
		
		//basis p == nill -> tomt tre, element finnes ikke
		
		if (p != null) {
			
		}
		return null;
	}

	@Override
	public T leggTil(T nyttElement) {
		// Blir fylt inn på forelesning
		return null;
	}

	@Override
	public T fjern(T element) {
		/*
		 * Det er ikkje pensum å kunne skrive kode for denne.
		 */
		
		throw new UnsupportedOperationException();
	}
}
