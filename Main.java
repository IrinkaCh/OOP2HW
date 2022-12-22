public class Main {
    public static void main(String[] args) {
        SaveFile txt = new SaveFileTxt();
        SaveFile json = new SaveFileJson();
        SaveFile xml = new SaveFileXml();

        txt.LineSaveDoс("DOC", "file", "Иван Иванов=4.8");
        txt.LineSaveDoс("DOC", "file", "Мария Кузнецова=5.0");
        txt.LineSaveDoс("DOC", "file", "Степан Кузьмин=3.6");

        json.LineSaveDoс("DOC", "file", "{");
        json.LineSaveDoс("DOC", "file", "\"Иван Иванов\": 4.8,");
        json.LineSaveDoс("DOC", "file", "\"Мария Кузнецова\": 5.0,");
        json.LineSaveDoс("DOC", "file", "\"Степан Кузьмин\": 3.6");
        json.LineSaveDoс("DOC", "file", "}");

        xml.LineSaveDoс("DOC", "file", "<?xml version=\"1.0\" encoding=\"utf-8\" ?>");
        xml.LineSaveDoс("DOC", "file", "<students>");
        xml.LineSaveDoс("DOC", "file", "<student>");
        xml.LineSaveDoс("DOC", "file", "<name>Иван Иванов</name>");
        xml.LineSaveDoс("DOC", "file", "<grade>4.8</grade>");
        xml.LineSaveDoс("DOC", "file", "</student>");
        xml.LineSaveDoс("DOC", "file", "<student>");
        xml.LineSaveDoс("DOC", "file", "<name>Мария Кузнецова</name>");
        xml.LineSaveDoс("DOC", "file", "<grade>5.0</grade>");
        xml.LineSaveDoс("DOC", "file", "</student>");
        xml.LineSaveDoс("DOC", "file", "<student>");
        xml.LineSaveDoс("DOC", "file", "<name>Степан Кузьмин</name>");
        xml.LineSaveDoс("DOC", "file", "<grade>3.6</grade>");
        xml.LineSaveDoс("DOC", "file", "</student>");
        xml.LineSaveDoс("DOC", "file", "</students>");
    }
}