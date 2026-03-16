class IdCard{
    String name,addr,birth,nation;
    int id;
}
class Phone{
    String brand,model,ram,storage;
    float price;
}
class FacebookPost{
    String user , content , date;
    int likes , comments;
}
class Book{
    int id,year,price;
    String author , title;
}
public class task11 {
        public static void main(String[] args)
        {
            IdCard id1 = new IdCard();
            IdCard id2 = new IdCard();
            IdCard id3 = new IdCard();

            id1.name="Ratana";
            id1.addr = "Prey veng";
            id1.birth="02/02/2009";
            id1.id = 23;
            id1.nation = "Indian";

            id2.name="Dom";
            id2.addr = "Prey veng";
            id2.birth="02/02/2009";
            id2.id = 24;
            id2.nation = "Cambodian";

            id3.name="Mony";
            id3.addr = "Prey veng";
            id3.birth="02/02/2009";
            id3.id = 23;
            id3.nation = "Indian";

            IdCard[] idArr = new IdCard[3];
            idArr[0]= id1;
            idArr[1] = id2;
            idArr[2] = id3;

            Phone p1 = new Phone();
            Phone p2 = new Phone();
            Phone p3 = new Phone();

            p1.brand = "Samsung";
            p1.model = "Note 21 ultra";
            p1.ram = "12GB";
            p1.storage = "256GB";
            p1.price=999;

            p2.brand = "Apple";
            p2.model = "Iphone 17 pro max";
            p2.ram = "8GB";
            p2.storage = "512GB";
            p2.price = 1968;

            p3.brand = "Xiaomi";
            p3.model = "Mi 17 pro max";
            p3.ram = "16GB";
            p3.storage = "512GB";
            p3.price = 789;

            Phone[] pArr = new Phone[3];
            pArr[0] = p1;
            pArr[1] = p2;
            pArr[2] = p3;

            FacebookPost f1 = new FacebookPost();
            FacebookPost f2 = new FacebookPost();
            FacebookPost f3 = new FacebookPost();

            f1.user = "Ratana";
            f1.content = "Funny";
            f1.date = "02/12/2199";
            f1.likes = 0;
            f1.comments = 1;

            f2.user = "Dom";
            f2.content = "Sharing";
            f2.date = "12/12/1999";
            f2.likes = 2000;
            f2.comments = 800;

            f3.user = "Mony";
            f3.content = "Funny";
            f3.date = "12/12/1000";
            f3.likes = 12;
            f3.comments = 12;

            FacebookPost[] fArr = new FacebookPost[3];
            fArr[0] = f1;
            fArr[1] = f2;
            fArr[2] = f3;

            Book b1 = new Book();
            Book b2 = new Book();
            Book b3 = new Book();

            b1.title = "Last day";
            b1.author = "Ratana";
            b1.id = 1;
            b1.price = 199;
            b1.year = 2009;

            b2.title = "Heart";
            b2.author = "Mony";
            b2.id = 2;
            b2.price = 122;
            b2.year = 2009;

            b3.title = "One day";
            b3.author = "Dom";
            b3.id = 3 ;
            b3.price = 19999;
            b3.year = 2023;

            Book[] bArr = new Book[3];
            bArr[0] = b1;
            bArr[1] = b2;
            bArr[2] = b3;
        }

    }
    

