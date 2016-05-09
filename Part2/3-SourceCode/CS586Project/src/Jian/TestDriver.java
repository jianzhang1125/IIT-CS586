package Jian;

import java.util.Scanner;

import Jian.Accounts.Account_1;
import Jian.Accounts.Account_2;

public class TestDriver {
	public static void printTitle() {
		final String TITLE = "\tCS 586 PROJECT\n\t" + "Test Driver\n\t" + "JIAN ZHANG\n\t" + "A20327380\n\n"
				+ "Enter Anything to Continue";
		System.out.println(TITLE);
	}

	public static void printAccountSelection() {
		final String AC_SELECTION = "Please select account number\n" + "1: Account-1\n" + "2: Account-2\n\n"
				+ "Enter 1 or 2 : ";
		System.out.print(AC_SELECTION);
	}

	public static void printAccount_1_Menu() {
		final String AC_1_MENU = "\n\t\t\tAccount-1\n\t\t" + "Menu of Operations\n\t"
				+ "0. open(string p, string y, float a)\n\t" + "1. login(string y)\n\t" + "2. pin(string x)\n\t"
				+ "3. deposit(float d)\n\t" + "4. withdraw(float w)\n\t" + "5. balance()\n\t" + "6. logout()\n\t"
				+ "7. lock(string x)\n\t" + "8. unlock(string x)\n\t" + "i. information\n\t" + "q. quit\n\n";
		System.out.println(AC_1_MENU);
	}

	public static void printAccount_1_Selection() {
		final String AC_1_SELECTION = "\n\t\tACCOUNT-1 EXECUTION\n\n\t" + "Select Operations:\n"
				+ "0: open,    1: login,  2: pin,  3: deposit, 4: withdraw,\n"
				+ "5: balance, 6: logout, 7: lock, 8: unlock,  i: info,     q. quit\n" + "Please Select : ";
		System.out.print(AC_1_SELECTION);
	}

	public static void printAccount_2_Menu() {
		final String AC_2_MENU = "\n\t\t\tAccount-2\n\t\t" + "Menu of Operations\n\t"
				+ "0. OPEN(int p, int y, int a)\n\t" + "1. LOGIN(int y)\n\t" + "2. PIN(int x)\n\t"
				+ "3. DEPOSIT(int d)\n\t" + "4. WITHDRAW(int w)\n\t" + "5. BALANCE()\n\t" + "6. LOGOUT()\n\t"
				+ "7. suspend()\n\t" + "8. activate()\n\t" + "9. close()\n\t" + "i. information\n\t" + "q. quit\n\n\n";
		System.out.println(AC_2_MENU);
	}

	public static void printAccount_2_Selection() {
		final String AC_2_SELECTION = "\n\t\tACCOUNT-2 EXECUTION\n\n\t" + "Select Operations:\n"
				+ "0: OPEN,   1: LOGIN,   2: PIN,      3: DEPOSIT,  4: WITHDRAW, 5: BALANCE, \n"
				+ "6: LOGOUT, 7: suspend, 8: activate, 9: close,    i: info,     q. quit\n" + "Please Select : ";
		System.out.print(AC_2_SELECTION);
	}

	public static void Account_1_Operations(Account_1 ac1, String op) {
		try {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			switch (op) {
			case "0":
				System.out.println("\n\t\t open operation start");
				System.out.println("This operation will open an account where p is a pin, y is an user ID, "
						+ "and a is a balance.");
				System.out.println("Please enter p (String): ");
				String p = scanner.next();
				System.out.println("Please enter y (String): ");
				String y = scanner.next();
				System.out.println("Please enter a (float): ");
				float a = scanner.nextFloat();
				ac1.open(p, y, a);
				System.out.println("\n\t\t open operation finish");
				break;

			case "1":
				System.out.println("\n\t\t login operation start");
				System.out.println("This operation will login where y is an user ID");
				System.out.println("Please enter y (String): ");
				String y1 = scanner.next();
				ac1.login(y1);
				System.out.println("\n\t\t login operation finish");
				break;

			case "2":
				System.out.println("\n\t\t pin operation start");
				System.out.println("This operation will provide pin x.");
				System.out.println("Please enter x (String): ");
				String x = scanner.next();
				System.out.println("\n\t\t pin operation finish");
				ac1.pin(x);
				break;

			case "3":
				System.out.println("\n\t\t deposit operation start");
				System.out.println("This operation will provide deposit amount d.");
				System.out.println("Please enter d (float): ");
				float d = scanner.nextFloat();
				ac1.deposit(d);
				System.out.println("\n\t\t deposit operation finish");
				break;

			case "4":
				System.out.println("\n\t\t withdraw operation start");
				System.out.println("This operation will provide withdraw amount w.");
				System.out.println("Please enter w (float): ");
				float w = scanner.nextFloat();
				ac1.withdraw(w);
				System.out.println("\n\t\t withdraw operation finish");
				break;

			case "5":
				System.out.println("\n\t\t balance operation start");
				System.out.println("This operation will display the current balance.");
				ac1.balance();
				System.out.println("\n\t\t balance operation finish");
				break;

			case "6":
				System.out.println("\n\t\t logout operation start");
				System.out.println("This operation will logout from account.");
				ac1.logout();
				System.out.println("\n\t\t logout operation finish");
				break;

			case "7":
				System.out.println("\n\t\t lock operation start");
				System.out.println("This operation will locks an account where x is a pin.");
				System.out.println("Please enter x (String): ");
				String x1 = scanner.next();
				ac1.lock(x1);
				System.out.println("\n\t\t lock operation finish");
				break;
			case "8":
				System.out.println("\n\t\t unlock operation start");
				System.out.println("This operation will unlock an account where x is a pin.");
				System.out.println("Please enter x (String): ");
				String x2 = scanner.next();
				ac1.unlock(x2);
				System.out.println("\n\t\t unlock operation finish");
				break;

			case "i":
				System.out.println("\n\t\t information operation start");
				System.out.println("This operation will provide the information.");
				ac1.getInformation();
				System.out.println("\n\t\t information operation finish");
				break;

			case "q":
				System.out.println("\n\t\t quit operation start");
				System.out.println("This operation will quit the program.");
				System.exit(0);
				System.out.println("\n\t\t quit operation finish");
				break;

			default:
				System.out.println("Please enter correct operation number.");
				break;

			}
		} catch (Exception e) {
			System.out.println("Please check format.");
		}

	}

	public static void Account_2_Operations(Account_2 ac, String op) {
		try {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			switch (op) {
			case "0":
				System.out.println("\n\t\t OPEN operation start");
				System.out.println("This operation will open an account where p is a pin, y is an user ID, "
						+ "and a is a balance.");
				System.out.println("Please enter p (int): ");
				int p = scanner.nextInt();
				System.out.println("Please enter y (int): ");
				int y = scanner.nextInt();
				System.out.println("Please enter a (int): ");
				int a = scanner.nextInt();
				ac.OPEN(p, y, a);
				System.out.println("\n\t\t OPEN operation finish");
				break;

			case "1":
				System.out.println("\n\t\t LOGIN operation start");
				System.out.println("This operation will login where y is an user ID");
				System.out.println("Please enter y (int): ");
				int y1 = scanner.nextInt();
				ac.LOGIN(y1);
				System.out.println("\n\t\t LOGIN operation finish");
				break;

			case "2":
				System.out.println("\n\t\t PIN operation start");
				System.out.println("This operation will provide pin x.");
				System.out.println("Please enter x (int): ");
				int x = scanner.nextInt();
				ac.PIN(x);
				System.out.println("\n\t\t PIN operation finish");
				break;

			case "3":
				System.out.println("\n\t\t DEPOSIT operation start");
				System.out.println("This operation will provide deposit amount d.");
				System.out.println("Please enter d (int): ");
				int d = scanner.nextInt();
				ac.DEPOSIT(d);
				System.out.println("\n\t\t DEPOSIT operation finish");
				break;

			case "4":
				System.out.println("\n\t\t WITHDRAW operation start");
				System.out.println("This operation will provide withdraw amount w.");
				System.out.println("Please enter w (int): ");
				int w = scanner.nextInt();
				ac.WITHDRAW(w);
				System.out.println("\n\t\t WITHDRAW operation finish");
				break;

			case "5":
				System.out.println("\n\t\t BALANCE operation start");
				System.out.println("This operation will display the current balance.");
				ac.BALANCE();
				System.out.println("\n\t\t BALANCE operation finish");
				break;

			case "6":
				System.out.println("\n\t\t LOGOUT operation start");
				System.out.println("This operation will logout from account.");
				ac.LOGOUT();
				System.out.println("\n\t\t LOGOUT operation finish");
				break;

			case "7":
				System.out.println("\n\t\t suspend operation start");
				System.out.println("This operation will suspend an account.");
				ac.suspend();
				System.out.println("\n\t\t suspend operation finish");
				break;

			case "8":
				System.out.println("\n\t\t activate operation start");
				System.out.println("This operation will activate an account.");
				ac.activate();
				System.out.println("\n\t\t activate operation finish");
				break;

			case "9":
				System.out.println("\n\t\t close operation start");
				System.out.println("This operation will close an account.");
				ac.close();
				System.out.println("\n\t\t close operation finish");
				break;

			case "i":
				System.out.println("\n\t\t information operation start");
				System.out.println("provide the information.");
				ac.getInformation();
				System.out.println("\n\t\t information operation finish");
				break;

			case "q":
				System.out.println("\n\t\t quit operation start");
				System.out.println("quit the program.");
				System.exit(0);
				System.out.println("\n\t\t quit operation start");
				break;

			default:
				System.out.println("Please enter correct operation number.");
				break;
			}
		} catch (Exception e) {
			System.out.println("Please check format.");
		}

	}

	public static void main(String[] args) {
		while (true) {
			try {
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				printTitle();
				scanner.next();
				printAccountSelection();
				int num = scanner.nextInt();
				if (num == 1) {
					Account_1 account_1 = new Account_1();
					printAccount_1_Menu();
					while (true) {
						printAccount_1_Selection();
						String n = scanner.next();
						Account_1_Operations(account_1, n);
					}
				}

				if (num == 2) {
					Account_2 account_2 = new Account_2();
					printAccount_2_Menu();
					while (true) {
						printAccount_2_Selection();
						String n = scanner.next();
						Account_2_Operations(account_2, n);
					}
				}
				System.out.println("\nPlese enter 1 or 2.\n\n");
			} catch (Exception e) {
				System.out.println("\nPlese check your entering.\n\n");
			}
		}

	}
}
