import java.util.Scanner;

public class DictionaryCommandline {
    private final Dictionary dictionary = new Dictionary();
    private final DictionaryManagement dictionaryManagement = new DictionaryManagement(this.dictionary);

    public void dictionaryAdvanced() {
        Scanner input = new Scanner(System.in);

        while(true) {
            int option;
            System.out.println("Nhập tùy chọn bạn muốn: ");
            System.out.println("[0]-Exit, [1]-addWord, [2]-removeWord, [3]-updateWord, [4]-searchWord, [5]-showAllWords, [6]-importFromFile, [7]-exportToFile");

            try {
                option = input.nextInt();
                input.nextLine();
            } catch (Exception e) {
                System.out.println("Please enter a valid number!");
                input.nextLine();
                continue;
            }

            switch (option) {
                case 0:
                    System.out.println("Thoát khỏi chương trình. Tạm biệt!");
                    return;
                case 1:
                    System.out.println("Nhập từ mới: ");
                    String target = input.nextLine();
                    System.out.println("Nhập ý nghĩa: ");
                    String meaning = input.nextLine();
                    this.dictionary.addWord(new Word(target, meaning));
                    break;
                case 2:
                    System.out.println("Nhập từ bạn muốn xóa: ");
                    String removeTarget = input.nextLine();
                    dictionaryManagement.removeWordInDictionary(removeTarget);
                    break;
                case 3:
                    System.out.println("Nhập từ bạn muốn sửa: ");
                    String editTarget = input.nextLine();
                    dictionaryManagement.editWordInDictionary(editTarget);
                    break;
                case 4:
                    System.out.println("Nhập từ bạn muốn tìm kiếm: ");
                    String searchTarget = input.nextLine();
                    dictionaryManagement.dictionarySearcher(searchTarget);
                    break;
                case 5:
                    dictionaryManagement.showAllWords();
                    break;
                case 6:
                    System.out.println("Đang tải dữ liệu từ điển từ dictionaries.txt.....");
                    System.out.println("Tải dữ liệu từ điển từ dictionaries.txt thành công.");
                    dictionaryManagement.insertFromFile("resource/dictionaries/dictionaries.txt");
                    break;
                case 7:
                    System.out.println("Đang xuất dữ liệu sang exportDictionaries.txt...");
                    System.out.println("Xuất dữ liệu sang exportDictionaries.txt thành công.");
                    dictionaryManagement.dictionaryExportToFile(this.dictionary.getWordList());
                    break;

                default:
                    System.out.println("Type in option 0 - 7");
            }
        }
    }

    public static void main(String[] args) {
        DictionaryCommandline dictionaryCommandline = new DictionaryCommandline();
        dictionaryCommandline.dictionaryAdvanced();
    }
}
