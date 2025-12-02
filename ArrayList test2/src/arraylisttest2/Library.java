package arraylisttest2;

import java.util.ArrayList;

public class Library {

    ArrayList<String> booktitle = new ArrayList<String>();
    ArrayList<String> bookauthor = new ArrayList<String>();
    ArrayList<Integer> bookfee = new ArrayList<Integer>();

    void addbooktitle(String title) {
        booktitle.add(title);
    }

    void addbookauthor(String author) {
        bookauthor.add(author);
    }

    void addbookfee(int fee) {
        bookfee.add(fee);
    }

}