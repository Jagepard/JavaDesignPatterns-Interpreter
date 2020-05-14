/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Iterator;

public class Main {

    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter();
        interpreter.addAlbumToRegistry(new Album("Korn", "Untouchables"));
        interpreter.addAlbumToRegistry(new Album("Deftones", "Adrenaline"));

        System.out.println(interpreter.interpret("album 2"));
        System.out.println(interpreter.interpret("album author 2"));
        System.out.println(interpreter.interpret("album author 1"));
        System.out.println(interpreter.interpret("author 1"));
    }
}
