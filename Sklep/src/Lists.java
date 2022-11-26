import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Lists {

	public ArrayList<String> loginList() {
		String line = null;
		ArrayList<String> loginsList = new ArrayList<>();
		BufferedReader input = null;

		try {
			input = new BufferedReader(new FileReader("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\listaKlientow.txt"));

			while ((line = input.readLine()) != null) {
				String[] splitResult = line.split("\t", 4);
				loginsList.add(splitResult[0].substring(0));
			}
			// System.out.println("Plik gotowy");

		} catch (FileNotFoundException e) {
			System.out.println("Nie ma takiego pliku ...");
		} catch (IOException e) {
			System.out.println("B³¹d odczytu pliku");
		}

		return loginsList;
	}

	public ArrayList<String> passwordList() {
		BufferedReader input = null;
		String line = null;
		ArrayList<String> passwordsList = new ArrayList<>();
		try {
			input = new BufferedReader(new FileReader("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\listaKlientow.txt"));

			while ((line = input.readLine()) != null) {
				String[] splitResult = line.split("\t", 4);
				passwordsList.add(splitResult[1].substring(0));
			}
			// System.out.println("Plik gotowy");

		} catch (FileNotFoundException e) {
			System.out.println("Nie ma takiego pliku ...");
		} catch (IOException e) {
			System.out.println("B³¹d odczytu pliku");
		}

		return passwordsList;
	}

	public String read(String x) {
		StringBuilder builder = new StringBuilder();
		BufferedReader input = null;
		String line = null;
		try {
			input = new BufferedReader(new FileReader(x));

			while ((line = input.readLine()) != null) {
				builder.append(line);
			}
			// System.out.println("Plik gotowy");
			input.close();

		} catch (FileNotFoundException e) {
			System.out.println("Nie ma takiego pliku ...");
		} catch (IOException e) {
			System.out.println("B³¹d odczytu pliku");
		}

		return builder.toString();
	}

	public void Save(Customer k) {
		BufferedWriter bw = null;

		try {
			File file = new File("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\listaKlientow.txt");

			if (!file.exists())
				file.createNewFile();

			FileWriter fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);

			bw.write(k + " ");
			bw.newLine();

			bw.close();
			// System.out.println("zapisano plik");
			fw.close();
		} catch (IOException e) {
			System.out.println("Plik nie jest dostêpny");
		}
		
		finally {
			if (bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					System.out.println("Nie moge zamkn¹æ pliku");
				}
		}

	}

	public void Save(YourBacket x) {
		BufferedWriter bw = null;

		try {
			File file = new File("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\Koszyk.txt");

			if (!file.exists())
				file.createNewFile();

			FileWriter fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);

			bw.write(x + " ");
			bw.newLine();

			bw.flush();
			// System.out.println("zapisano plik");

		} catch (IOException e) {
			System.out.println("Plik nie jest dostêpny");
		}

		finally {
			if (bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					System.out.println("Nie moge zamkn¹æ pliku");
				}
		}

	}

	public void Save(Transactions x) {
		BufferedWriter bw = null;

		try {
			File file = new File("C:\\Users\\Anna\\Desktop\\projekt jp wersja2\\pliki\\listaProduktowZakupionych.txt");

			if (!file.exists())
				file.createNewFile();

			FileWriter fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);

			bw.write(x + " ");
			bw.newLine();

			bw.flush();
			// System.out.println("zapisano plik");

		} catch (IOException e) {
			System.out.println("Plik nie jest dostêpny");
		}

		finally {
			if (bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					System.out.println("Nie moge zamkn¹æ pliku");
				}
		}

	}

}
