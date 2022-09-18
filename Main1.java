public class Main1{
	public static void main(String args[])
	{
		Manusia a = new Manusia();
		Hewan b = new Hewan();
		Telepon c = new Telepon();
		
		System.out.println("Manusia: ");
		System.out.println("Bermain: " + a.bermain("Bola"));
		System.out.println("Makan: " + a.makan("Kerupuk"));
		System.out.println("tidur " );
		System.out.println("Bekerja: " + a.bekerja("Kontraktor"));
		System.out.println("Memasak: " + a.memasak("Nasi"));
		System.out.println("Mencuci: " + a.mencuci("Pakaian"));

		System.out.println("Hewan: ");
		System.out.println("Bermain: " + b.bermain("Berlari"));
		System.out.println("Makan: " + b.makan("Whiskas"));
		System.out.println("tidur " );

		System.out.println("Telepon: ");
		System.out.println("Menerima Panggilan: " + c.terima_panggilan("Menerima"));
		System.out.println("Melakukan Panggilan: " + c.melakukan_panggilan("Memanggil"));

	}

}