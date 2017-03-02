// Program izpise vsoto prvih dveh argumentov

public class Racunalo {
	
	public static void main(String[] args) {
		if(args.length == 2) {
			int prvo = Integer.parseInt(args[0]);
			int drugo = Integer.parseInt(args[1]);
			//int rezultat = prvo + drugo;
			//System.out.printf("%d + %d = %d\n", prvo, drugo, rezultat);
			System.out.printf("%d + %d = %d\n", prvo, drugo, prvo+drugo);
		} else {
			System.out.printf("Napaka: podaj dve stevili!\n");
		}
	}
}
