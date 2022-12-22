import java.util.Scanner;

public abstract class SaveFile {
    Scanner scan = new Scanner(System.in);

    public void SaveDocument() {
        this.scan = new Scanner(System.in);
    }

    abstract void LineSaveDoс(String puthDoc, String nameDoc, String line);
    abstract void EnterSaveDoс(String puthDoc, String nameDoc);
}