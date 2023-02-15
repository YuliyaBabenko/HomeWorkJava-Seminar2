public class main
{
    public static void main(String[] args) {
        String basic = "Добрый день Как дела Все хорошо";
        System.out.println(basic);
       
        String str1 = basic.replaceAll(" +"," ");
        str1 = str1.trim();
        str1 = str1.replaceAll("\\s([А-Я])", ". $1") + '.';
        System.out.println(str1);
    }
}