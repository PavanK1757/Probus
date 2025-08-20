class BookRunner {
    public static void main(String[] args) {
        String[] names = {"Java", "Python", "C++", "OS"};
        String[] books = Book.bookName(names);
        for (int title = 0; title < books.length; title++) {
            System.out.println(books[title]);
        }

        int[] pages = {250, 500, 400, 350};
        int[] bookPages = Book.bookPages(pages);
        for (int pg = 0; pg < bookPages.length; pg++) {
            System.out.println(bookPages[pg]);
        }

        double[] ratings = {4.5, 4.0, 3.8, 4.7};
        double[] bookRatings = Book.bookRatings(ratings);
        for (int rate = 0; rate < bookRatings.length; rate++) {
            System.out.println(bookRatings[rate]);
        }

        float[] price = {250.5f, 300.0f, 200.8f, 450.2f};
        float[] bookPrices = Book.bookPrice(price);
        for (int amt = 0; amt < bookPrices.length; amt++) {
            System.out.println(bookPrices[amt]);
        }

        boolean[] available = {true, true, false, true};
        boolean[] bookAvailable = Book.bookIsAvailable(available);
        for (int check = 0; check < bookAvailable.length; check++) {
            System.out.println(bookAvailable[check]);
        }

        char[] symbol = {'B', 'O', 'O', 'K'};
        char[] bookSymbols = Book.bookSymbol(symbol);
        for (int c = 0; c < bookSymbols.length; c++) {
            System.out.println(bookSymbols[c]);
        }

        long[] isbn = {978013L, 978014L, 978015L, 978016L};
        long[] bookISBNs = Book.bookISBN(isbn);
        for (int id = 0; id < bookISBNs.length; id++) {
            System.out.println(bookISBNs[id]);
        }
    }
}
