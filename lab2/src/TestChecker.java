import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TestChecker {
    private static final List<Test> set_tests = Arrays.asList(
            // тесты на корректные выражения
            new Test("Тест на and", "a and b")
            , new Test("Тест на or", "a or b")
            , new Test("Тест на xor", "a xor b")
            , new Test("Тест на not", "not a")
            , new Test("Тест на var", "a")
            , new Test("Тест на пробелы", "    not    a    or   (  b )     ")
            , new Test("Тест на разбор всех операций и их корректный приоритет", "a and not b or c xor d")
            , new Test("Тест на корректный приоритет выражения в скобках", "(not a and (b or c)) xor d")
            , new Test("Тест на множественное отрицание переменных", "not not a or not b and not not not c")
            , new Test("Тест на отрицание выражения", "not (a or b) xor a")
            , new Test("Комбинированный тест", "((a) or not (b)) xor (c xor c) or not (y xor not not x)")
            // тесты на некорректные выражения
            , new Test("Пустая строка", "")
            , new Test("Отсутствует второй аргумент and", "a and")
            , new Test("Отсутствует второй аргумент or", "a or")
            , new Test("Отсутствует второй аргумент xor", "a xor")
            , new Test("Отсутствует аргумент not", "a or not")
            , new Test("Отсутствуют 2 аргумента", "xor")
            , new Test("Не хватает закрывающей скобки", "(a and not b")
            , new Test("Не хватает открывающей скобки", "not b)")
            , new Test("Отсутствует операция между переменными", "a b")
            , new Test("Пустые скобки", "a or not()")
            , new Test("Отсутствие пробела между токенами", "a andnot b")
            , new Test("Некорректное выражение внутри not", "a or not(or)")
            , new Test("Некорректный первый аргумент", "() or b")
            , new Test("Некорректный второй аргумент", "a or ()")
            , new Test("Неверный токен", "a ant b")
            , new Test("Отсутствует токен END после корректного выражения", "(a and b) + sth")
    );

    public static void main (String [] args) {
//        for (Test i : set_tests) {
//            i.check();
//            System.out.println();
//        }
        try(FileWriter writer = new FileWriter("D:\\study\\5sem\\MT\\lab4\\grammarFiles\\PythonLogic.test", false)) {
            for (Test i : set_tests) {
                writer.append(i.test).append("\n");
            }
        } catch (IOException ignored) {
        }
//        try(FileWriter writer = new FileWriter("testTable.txt", false))
//        {
//            writer.append("<table>\n\t<tr>\n\t\t<td> Тест </td>\n\t\t<td> Описание </td>\n\t\t<td> Результат </td>\n\t</tr>\n");
//            for (Test i : set_tests) {
//                writer.append("\t<tr>\n\t\t<td> ")
//                        .append(i.test).append(" </td>\n\t\t<td> ")
//                        .append(i.description).append(" </td>\n\t\t<td> ")
//                        .append(i.getResult()).append(" </td>\n\t</tr>\n");
//            }
//            writer.append("</table>");
//        }
//        catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }
//        try(FileWriter writer = new FileWriter("trash.txt", false))
//        {
//            writer.append("ads_featured = ads.assign(\n");
//            List<String> arr = Arrays.asList(
//                    "cpm",
//                    "duration",
//                    "n_publishers",
//                    "big_publishers",
//                    "cnt_users_for_cpm",
//                    "cnt_target_users_cpm",
//                    "cnt_target_users_hour");
//            List<String> short_name = Arrays.asList(
//                    "cpm",
//                    "dur",
//                    "npub",
//                    "bpub",
//                    "cufc",
//                    "ctuc",
//                    "ctuh");
//            for (int i = 0; i < arr.size(); i++) {
//                for (int j = i + 1; j < arr.size(); j++) {
//                    writer.append("\t")
//                            .append(short_name.get(i))
//                            .append("_x_")
//                            .append(short_name.get(j))
//                            .append("=ads.")
//                            .append(arr.get(i))
//                            .append("*ads.")
//                            .append(arr.get(j))
//                            .append(",\n");
//                    writer.append("\t")
//                            .append("log_")
//                            .append(short_name.get(i))
//                            .append("_x_")
//                            .append(short_name.get(j))
//                            .append("=np.log(ads.")
//                            .append(arr.get(i))
//                            .append("*ads.")
//                            .append(arr.get(j))
//                            .append("),\n");
//                    writer.append("\t")
//                            .append("sqrt_")
//                            .append(short_name.get(i))
//                            .append("_x_")
//                            .append(short_name.get(j))
//                            .append("=np.sqrt(ads.")
//                            .append(arr.get(i))
//                            .append("*ads.")
//                            .append(arr.get(j))
//                            .append("),\n");
//                }
//            }
//            writer.append(")\n");
//            for (int i = 0; i < arr.size(); i++) {
//                for (int j = i + 1; j < arr.size(); j++) {
//                    writer.append("print('")
//                            .append(short_name.get(i))
//                            .append("_x_")
//                            .append(short_name.get(j))
//                            .append(" ', ")
//                            .append("ads_featured[['")
//                            .append(short_name.get(i))
//                            .append("_x_")
//                            .append(short_name.get(j))
//                            .append("', 'at_least_one']].corr()['")
//                            .append(short_name.get(i))
//                            .append("_x_")
//                            .append(short_name.get(j))
//                            .append("']['at_least_one'])\n");
//                    writer.append("print('")
//                            .append("log_")
//                            .append(short_name.get(i))
//                            .append("_x_")
//                            .append(short_name.get(j))
//                            .append(" ', ")
//                            .append("ads_featured[['")
//                            .append("log_")
//                            .append(short_name.get(i))
//                            .append("_x_")
//                            .append(short_name.get(j))
//                            .append("', 'at_least_one']].corr()['")
//                            .append("log_")
//                            .append(short_name.get(i))
//                            .append("_x_")
//                            .append(short_name.get(j))
//                            .append("']['at_least_one'])\n");
//                    writer.append("print('")
//                            .append("sqrt_")
//                            .append(short_name.get(i))
//                            .append("_x_")
//                            .append(short_name.get(j))
//                            .append(" ', ")
//                            .append("ads_featured[['")
//                            .append("sqrt_")
//                            .append(short_name.get(i))
//                            .append("_x_")
//                            .append(short_name.get(j))
//                            .append("', 'at_least_one']].corr()['")
//                            .append("sqrt_")
//                            .append(short_name.get(i))
//                            .append("_x_")
//                            .append(short_name.get(j))
//                            .append("']['at_least_one'])\n");
//                }
//            }
//        }
//        catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }
    }
}
