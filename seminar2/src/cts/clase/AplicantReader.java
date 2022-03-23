package cts.clase;

import java.util.Scanner;

public abstract class AplicantReader {
	Scanner scanner;
	AplicantReader(String numeFisier) throws FileNotFoundExceptions{
		scanner=new Scanner (new File(numeFile));
	}
		
	
    public static void citireAplicant(Scanner scanner,Aplicant aplicant){
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nrProiecte = scanner.nextInt();
        String[] denumiri = new String[nrProiecte];
        for (int i = 0; i < nrProiecte; i++)
            denumiri[i] = scanner.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setDenumiriProiecte(nrProiecte,denumiri);
    }
}