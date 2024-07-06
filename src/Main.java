public class Main {
    public static void main(String[] args) {

        Author nikolai = new Author("Николай", "Дроздов");
        Book tom1 = new Book("В мире животных", 1960, nikolai);
        Author kyk = new Author("Кук", "Джейис");
        Book adventure = new Book("Канибалы", 1750, kyk);
        System.out.println(adventure.getPublisherYear());
        adventure.setPublisherYear(1779);
        System.out.println(adventure.getPublisherYear());
    }

}
