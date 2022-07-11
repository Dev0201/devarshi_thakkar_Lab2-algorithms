package CurerncyCount;

public class Currency {
	
	public void currencyImplementation(int notes[],int amount) {
		
		int [] currency = new int [notes.length];
		
		try {
			
			for (int i=0; i<notes.length;i++) {
				
				if(amount >= notes[i])
				{
					currency[i] = amount / notes[i];
					amount = amount - currency[i]*notes[i];
				}
			}
			if(amount>0) {
				System.out.println("Demonination is Higher");
			}
			else
			{
				System.out.println("Payment is More");
			}
			for (int i=0; i< notes.length; i++) {
				if (currency[i]!=0) {
					System.out.println(notes[i]+ ":" +currency[i]);
					
				}
			}
		}
		catch(Exception ex) {
			System.out.println("Exception " + ex);
			
		}
	}

}
