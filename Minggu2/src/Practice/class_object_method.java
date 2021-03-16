package Practice;

/**
 *
 * @author Fauzan
 */
class class_object_method { // "class_object_method" merupakan nama class yang berisi 2 komponen: atribut dan method.
    // Atribut: price dan pages
    int price;
    int pages;

    // Method: set dan show
    public void set(int price, int pages) { 
        this.price = price;
        this.pages = pages;
    }

    public void show() {
        System.out.println("----- Books Information -----");
        System.out.println("Book price      : " + price);
        System.out.println("Number of pages : " + pages);
    }

    
    public static void main(String[] args) { // berisi method main
        class_object_method javabook = new class_object_method(); 
            // merupakan sebuah object dari class "class_object_method". Yang mana object tersebut mendeklarasikan method set dan show.
        javabook.set(60000, 100);
        javabook.show();
    }
}