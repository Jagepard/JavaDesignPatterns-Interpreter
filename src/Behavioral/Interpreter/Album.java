/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Interpreter;

public class Album implements AlbumInterface {
    private final String name;
    private final String author;

    public Album(String author, String name) {
        this.name   = name;
        this.author = author;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}
