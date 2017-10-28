import java.util.List;

import domain.Bank;
import domain.Klient;
import domain.Lokata;
import utils.Create;
import utils.ToolsForBank;

public class BankiKlienciLokaty {

	public static void dane(){
		Bank mbank = Create.createBank(
				"mBank",
				Create.createListKlient(new Klient[] {
						Create.createKlient(
								"Cash",
								"Johnny",
								Create.createListLokata(new Lokata[] {
										Create.createLokata(2000),
										Create.createLokata(3000) })),
						Create.createKlient(
								"Bartnik",
								"Bartlomiej",
								Create.createListLokata(new Lokata[] {
										Create.createLokata(300),
										Create.createLokata(400),
										Create.createLokata(500), }))

				}));

		Bank millenium = Create.createBank("Millenium", Create
				.createListKlient(new Klient[] {
						Create.createKlient(
								"Nowak",
								"Steve",
								Create.createListLokata(new Lokata[] {
										Create.createLokata(2000),
										Create.createLokata(9000),
										Create.createLokata(10000) })),
						Create.createKlient("Kowalsky", "Janina", Create
								.createListLokata(new Lokata[] { Create
										.createLokata(500) })) }));

		List<Bank> listBank = Create
				.createListBank(new Bank[] { mbank, millenium });
		
		ToolsForBank.wyswietl(mbank);

		System.out.println("--------------------------------");
		
		ToolsForBank.wyswietl(millenium);
		
		System.out.println("--------------------------------");
		
		for(Klient k : mbank.getListaKlientow()){
			ToolsForBank.sumyLokatKlienta(k);
		}
		

		System.out.println("--------------------------------");
		
		
		for(Klient k : millenium.getListaKlientow()){
			ToolsForBank.sumyLokatKlienta(k);
		}
		
	}
}
