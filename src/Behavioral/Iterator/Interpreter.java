/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Interpreter implements InterpreterInterface {
    private List<AlbumInterface> registry = new ArrayList<>();

    @Override
    public void interpret(String input) {
        String[] exploded = input.split(" ");

        for (String value : exploded) {
            if (this.isNumeric(value)) {
                int number = Integer.parseInt(value) - 1;
                this.getDataFromRegistry(exploded, this.registry.get(number));
            }
        }
    }

    public void addAlbumToRegistry(AlbumInterface album) {
        this.registry.add(album);
    }

    private boolean isNumeric(String str) {
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }

    private void getDataFromRegistry(String[] exploded, AlbumInterface item)
    {
        for (String value : exploded) {
            if (value.equals("album")) {
                System.out.printf("%s ", item.getName());
            }

            if (value.equals("author")) {
                System.out.printf("%s ", item.getAuthor());
            }
        }

        System.out.print("\n");
    }
}
