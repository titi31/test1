package mombre;


import java.util.Scanner;

public class Nombre{
	public static void main(String[] args){
		int nombre= 1 + (int)(Math.random() * 100);
		int coup=0;

		while(true)
		{
			Scanner sc = new Scanner(System.in);

			try{
				System.out.println("Entrez un nombre entre 1 et 100 ?");
				int str= sc.nextInt();
				if (str>nombre && str<=100)
				{
					System.out.println("Essayer plus bas !");
					coup++;
					continue;

				}
				

				if (str<nombre && str>=1)
				{
					System.out.println("Essayer plus haut !");
					coup++;
					continue;
				}
				if(str>100 || str<1)
				{
					System.out.println("jai dit entre 1 et 100 !");
					continue;
				}
				if(str==nombre){
					System.out.println("Vous avez trouvé en "+coup+" coups");
					break;
				}
			}
			catch (java.util.InputMismatchException e)
			{
				System.out.println("j'ai dit un nombre pas une lettre !");
				continue;
			}

		}


	}

}
