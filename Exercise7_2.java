class SuddaDeck {
    final int CARD_NUM = 20;
    SuddaCard[] cards = new SuddaCard[CARD_NUM];

    SuddaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int No = i % 10 + 1;
            boolean isKwang = (i < 10) && (No == 1 || No == 3 || No == 8);

            cards[i] = new SuddaCard(No, isKwang);
        }
    }
    void shuffle() {

        for(int i=0;i<cards.length;i++){
            int j  =(int) (Math.random()*cards.length);
            SuddaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;

        }
    }

    SuddaCard pick(int index) {
        if(index < 0 || index >= CARD_NUM)
            return null;
        return cards[index];
    }

    SuddaCard pick() {
        int j  =(int) (Math.random()*cards.length);
        return pick(j);
    }
} // SutdaDeck

class SuddaCard {
    int num;
    boolean isKwang;

    SuddaCard() {
        this(1, true);
    }

    SuddaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}

class Exercise7_2 {
    public static void main(String args[]) {
        SuddaDeck deck = new SuddaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
//예상결과) 
// 1K
// 7 
// 2,6,10,1K,7,3,10,5,7,8,5,1,2,9,6,9,4,8K,4,3K, 
// 2